namespace java org.iko.thrift

include "ShareStruct.thrift"
include "Exception.thrift"

service PRelationIFace{
       i32 addFollow(1: string uid,2: string followId,3:ShareStruct.RelationType type) throws (1:Exception.EngineException error),
       i32 isFollow(1:string uid,2:string followId,3:ShareStruct.RelationType type) throws (1:Exception.EngineException error),
       i32 cancelFollow(1: string uid,2: string followId,3:ShareStruct.RelationType type) throws (1:Exception.EngineException error),
       i32 cancelFans(1: string uid,2: string fansId,3:ShareStruct.RelationType type) throws (1:Exception.EngineException error),
       i32 addFans(1: string uid,2: string fansId,3:ShareStruct.RelationType type) throws (1:Exception.EngineException error),
       list<string> getFollow(1:string uid,2:i32 start,3:i32 len,4 :ShareStruct.RelationType type) throws (1:Exception.EngineException error),
       list<string> getFans(1:string uid,2:i32 start,3:i32 len,4:ShareStruct.RelationType type) throws (1:Exception.EngineException error)
}

