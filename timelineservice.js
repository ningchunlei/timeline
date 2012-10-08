var thrift = require("thrift")

var TimeLineService = require("./thrift/TimeLineIFace")
var ShareStruct_ttypes = require("./thrift/ShareStruct_Types")
var ErrorNo_ttypes = require("./thrift/ErrorNo_Types")
var Exception_ttypes = require("./thrift/Exception_Types")

var server = exports.timeline = thrift.createServer(TimeLineService,{
     get: function(uid,type,start,len,response){

     }
 })

