namespace java org.iko.thrift

include "ShareStruct.thrift"
include "Exception.thrift"

service IKaoDBIFace{
    ShareStruct.TimeLine getForTL(1: string uid,2:ShareStruct.TimeLineType g,3:string latestmid,4:i32 len) throws (1:Exception.EngineException error)
    i32 addForTL(1:string uid,2:list <ShareStruct.TimeLineType> g,3:string mid) throws (1:Exception.EngineException error)
    i32 removeForTL(1: string uid,2:string mid, 3:ShareStruct.TimeLineType g) throws (1: Exception.EngineException error)

     map<string,i32> getMsgCounter(1: list<string> mids) throws (1:Exception.EngineException error),
     list<string> getRelatedMsg(1: string mid,2: i32 start,3: i32 len) throws (1:Exception.EngineException error),
     i32 addRelatedMsg(1:string mid,2:string answer) throws (1:Exception.EngineException error)
     i32 deleteRelatedMsg(1:string mid,2:string answer) throws (1:Exception.EngineException error)

      i32 addFollow(1: string uid,2: string followId,3:ShareStruct.RelationType type) throws (1:Exception.EngineException error),
      i32 cancelFollow(1: string uid,2: string followId,3:ShareStruct.RelationType type) throws (1:Exception.EngineException error),
      i32 cancelFans(1: string uid,2: string fansId,3:ShareStruct.RelationType type) throws (1:Exception.EngineException error),
      i32 addFans(1: string uid,2: string fansId,3:ShareStruct.RelationType type) throws (1:Exception.EngineException error),
      list<string> getFollow(1:string uid,2:i32 start,3:i32 len,4 :ShareStruct.RelationType type) throws (1:Exception.EngineException error),
      list<string> getFans(1:string uid,2:i32 start,3:i32 len,4:ShareStruct.RelationType type) throws (1:Exception.EngineException error)

      i32 postMsg(1:ShareStruct.Msg msg) throws (1:Exception.EngineException error)


}