var thrift = require("thrift")
var util = require("util");

var TimeLineService = require("./thrift/TimeLineIFace")
var ShareStruct_ttypes = require("./thrift/ShareStruct_Types")
var ErrorNo_ttypes = require("./thrift/ErrorNo_Types")
var Exception_ttypes = require("./thrift/Exception_Types")
var redis = require("redis")

var poolModule = require('generic-pool');
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
     get: function(uid,type,start,len,response){
         process.log.info(util.format("get:uid=%s,type=%d,start=%d,len=%d",uid,type,start,len))
         pool.borrow(function(err,client){
             client.zrevrange(uid+"-"+type, start-1 ,start+len-1,function(err,reply){
                  pool.release(client);
                  if(err!=null){
                      process.log.info(util.format("get:uid=%s,type=%d,start=%d,len=%d,err=%s",uid,type,start,len,err))
                      response(new ShareStruct_ttypes.TimeLine())
                  }else{
                      response(new ShareStruct_ttypes.TimeLine( {"uid":uid,"group":type,"mids":reply}))
                  }
              })
         })
     },

     add: function(uid,typeArray,mid,response){
          var retCount = 0;
          process.log.info(util.format("add:uid=%s,typeArray=%d,mid=%s",uid,typeArray,mid))
          pool.borrow(function(err,client){
              typeArray.forEach(function(ele){
                  client.zadd(uid+"-"+ele,0,mid,function(err,reply){
                       client.zremrangebyrank(uid+"-"+ele,process.conf.server.topN,-1,function(err,reply){
                           retCount ++;
                           if(typeArray.length == retCount){
                               pool.release(client);
                               console.log(err)
                               if(err!=null){
                                   response(FALSE)
                               }else{
                                   response(TRUE)
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

