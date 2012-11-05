var thrift = require("thrift")
var util = require("util");
var poolModule = require('generic-pool');

var TimeLineService = require("./thrift/TimeLineIFace")
var IKaoDBService = require("./thrift/IKaoDBIFace")
var UserService = require("./thrift/UserIFace")

var ShareStruct_ttypes = require("./thrift/ShareStruct_Types")
var ErrorNo_ttypes = require("./thrift/ErrorNo_Types")
var Exception_ttypes = require("./thrift/Exception_Types")
var redis = require("redis")


var ikaodbPool = poolModule.Pool({
    name : "ikaodb",
    create   : function(callback) {
        var dbconnection = thrift.createConnection(process.conf.db.ip, process.conf.db.port)
        var client = thrift.createClient(IKaoDBService, dbconnection);
        callback(null, client);
    },
    destroy  : function(client) { client.quit(); }, //当超时则释放连接
    max      : 10,   //最大连接数
    idleTimeoutMillis : 10,  //超时时间
    log : true
})

var pool = poolModule.Pool({
    name     : 'redis',
    create   : function(callback) {
        var client = redis.createClient(process.conf.redis.port,process.conf.redis.ip);
        client.auth(process.conf.redis.passwd)
        callback(null, client);
    },
    destroy  : function(client) { client.quit(); }, //当超时则释放连接
    max      : 10,   //最大连接数
    idleTimeoutMillis : 10,  //超时时间
    log : true
});

var FALSE = -1
var TRUE = 1

var server = exports.timeline = thrift.createServer(TimeLineService,{
     get: function(uid,type,latestmid,len,response){
         process.log.info(util.format("get:uid=%s,type=%d,latestmid=%s,len=%d",uid,type,latestmid,len))
         if(latestmid!=null){
             pool.borrow(function(err,client){
                 client.zrevrangebyscore(uid+"-"+type,latestmid,"-inf","limit",0,len,function(err,reply){
                     pool.release(client)
                     if(err!=null || reply.length<len){
                         process.log.info(util.format("get:uid=%s,type=%d,latestmid=%s,len=%d,err=%s,reply=%s",uid,type,latestmid,len,err,reply))
                         ikaodbPool.borrow(function(err,ikaodb){
                             ikaodb.getForTL(uid,type,latestmid,len,function(reply){
                                 process.log.info(util.format("getForTL:uid=%s,type=%d,latestmid=%s,len=%d,reply=%s",uid,type,latestmid,len,reply))
                                 ikaodbPool.release(ikaodb)
                                 response(reply)
                                 internalAdd(uid,type,reply.mids)
                             })
                         })
                     }else{
                         response(new ShareStruct_ttypes.TimeLine( {"uid":uid,"group":type,"mids":reply}))
                     }
                 })
             })
         }else{
            pool.borrow(function(err,client){
                client.zrevrangebyscore(uid+"-"+type,"+inf","-inf","limit",0,len,function(err,reply){
                    pool.release(client)
                    if(err!=null || reply.length==0){
                        process.log.info(util.format("get:uid=%s,type=%d,latestmid=%s,len=%d,err=%s,reply=%s",uid,type,latestmid,len,err,reply))
                        ikaodbPool.borrow(function(err,ikaodb){
                            ikaodb.getForTL(uid,type,latestmid,len,function(reply){
                                process.log.info(util.format("getForTL:uid=%s,type=%d,latestmid=%s,len=%d,reply=%s",uid,type,latestmid,len,reply))
                                ikaodbPool.release(ikaodb)
                                response(reply)
                                internalAdd(uid,type,reply.mids)
                            })
                        })
                    }else{
                        response(new ShareStruct_ttypes.TimeLine( {"uid":uid,"group":type,"mids":reply}))
                    }
                })
            })
         }
     },

    internalAdd:function(uid,type,mids){
         pool.borrow(function(err,client){
            client.zcard(uid+"-"+type,function(err,reply){
                i=process.conf.server.topN-reply
                midlist = [uid+"-"+type];
                for(j=0;j<i;j++){
                    midlist.push(parseInt(mids[j].substr(0,16),16))
                    midlist.push(mids[j]);
                }
                midlist.push(function(){pool.release(client)})
                client.zadd(client,midlist);
            })
         })
    },

     add: function(uid,typeArray,mid,response){
          var retCount = 0;
          process.log.info(util.format("add:uid=%s,typeArray=%d,mid=%s",uid,typeArray,mid))
          pool.borrow(function(err,client){
              typeArray.forEach(function(ele){
                  client.zadd(uid+"-"+ele,parseInt(mid.substr(0,16),16),mid,function(err,reply){
                       client.zcard(uid+"-"+ele,function(err,reply){
                              if(reply>process.conf.server.topN+50){
                                  client.zremrangebyrank(uid+"-"+ele,0,50,function(err,reply){
                                      retCount ++;
                                      if(typeArray.length == retCount){
                                          pool.release(client);
                                          if(err!=null){
                                              response(FALSE)
                                          }else{
                                              response(TRUE)
                                          }
                                      }
                                  })
                              }else{
                                  retCount ++;
                                  if(typeArray.length == retCount){
                                      pool.release(client);
                                      if(err!=null){
                                          response(FALSE)
                                      }else{
                                          response(TRUE)
                                      }
                                  }
                              }
                       })
                  })
              })
         })
     },

     remove: function(uid,mid,type,response){
         process.log.info(util.format("remove:uid=%s,type=%d,mid=%s",uid,type,mid))
         pool.borrow(function(err,client){
              client.zrem(uid+"-"+type,mid,function(err,reply){
                  pool.release(client);
                  process.log.info(util.format("remove:uid=%s,type=%d,mid=%s,err=%s,reply=%s",uid,type,mid,err,reply))
                  if(err!=null){
                      response(FALSE)
                  }else{
                      response(TRUE)
                  }
              });
         });
     }
 })

