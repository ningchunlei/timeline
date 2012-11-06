namespace java org.iko.thrift

include "ShareStruct.thrift"
include "Exception.thrift"

service MRelationIFace{
       map<string,map<i32,i32>> getMsgCounter(1: list<string> mids) throws (1:Exception.EngineException error),
       list<string> getRelatedMsg(1: string mid,2: i32 start,3: i32 len) throws (1:Exception.EngineException error),
       i32 initMsg(1:string mid) throws (1:Exception.EngineException error),
       i32 incr(1:string mid,2:i32 type) throws (1:Exception.EngineException error),
       i32 decr(1:string mid,2:i32 type) throws (1:Exception.EngineException error),
       i32 addRelatedMsg(1:string mid,2:string answer) throws (1:Exception.EngineException error)
       i32 deleteRelatedMsg(1:string mid,2:string answer) throws (1:Exception.EngineException error)
}

