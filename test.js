/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-9-24
 * Time: 下午6:06
 * To change this template use File | Settings | File Templates.
 */
var path = require("path")
fs = require("fs")

var thrift_path = require.resolve("thrift")
var thrift = require("thrift")
var ttransport = require(path.resolve(path.dirname(thrift_path),"transport"));
TBinaryProtocol = require(path.resolve(path.dirname(thrift_path),"protocol")).TBinaryProtocol;

var TimeLineService = require("./thrift/TimeLineIFace")
var ShareStruct_ttypes = require("./thrift/ShareStruct_Types")
var ErrorNo_ttypes = require("./thrift/ErrorNo_Types")
var Exception_ttypes = require("./thrift/Exception_Types")

fid = fs.openSync("b","w+")

var output = new TBinaryProtocol(new ttransport.TBufferedTransport(undefined, function(buf) {
    fs.write(fid, buf, 0, buf.length, null)
}));
//var t = new ShareStruct_ttypes.TimeLine({"uid":"aa","group":ShareStruct_ttypes.TimeLineType.Inbox,"mids":["123","123123"]})
t =new ShareStruct_ttypes.Msg({"uid":"aaa","mid":"msgid","msgtext":"msgtext"})
t.write(output)
output.flush()

var redis = require("redis")
var client = redis.createClient(6379,"192.168.10.84");


setInterval(function(){
    var a = ["ad",function(err,reply){console.log(reply)}];
    client.zcard.apply(client,a)
    console.log("xxx")
    client.quit()
},500)


/*var server = thrift.createServer(TimeLineService,{
 get: function(uid,type,start,len,response){
 var output = new TBinaryProtocol(new ttransport.TBufferedTransport(undefined, function(buf) {
 console.log(buf.length)
 }));
 var t = new ShareStruct_ttypes.TimeLine({"uid":"aa","group":ShareStruct_ttypes.TimeLineType.Inbox,"mids":["123","123123"]})
 t.write(output)
 output.flush()
 //var tx = new Exception_ttypes.EngineException({"errorno":ErrorNo_ttypes.ErrorNo.THRIFT_ERROR,"errormsg":"aaaa"})
 //response(new ShareStruct_ttypes.TimeLine({"uid":"aa","group":ShareStruct_ttypes.TimeLineType.Inbox,"mids":["123","123123"]}))
 //response()
 }
 }) ;

 server.on("error",function(err){
 console.log("x"+err)
 })


 server.on("close",function(err){
 console.log("c"+err)
 })

 process.on('uncaughtException', function (exception) {
 console.log(exception);
 });

 server.listen(9090)        */

