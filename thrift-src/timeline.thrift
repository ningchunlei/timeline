namespace java org.iko.thrift

include "ShareStruct.thrift"
include "Exception.thrift"

service TimeLineIFace{
    ShareStruct.TimeLine get(1: string uid,2:ShareStruct.TimeLineType g,3:i32 start,4:i32 len) throws (1:Exception.EngineException error)
    bool add(1:string uid,2:list <ShareStruct.TimeLineType> g,3:string mid) throws (1:Exception.EngineException error)
    map<ShareStruct.TimeLineType,i32> getUnRead(1: string uid) throws (1:Exception.EngineException error)
    bool remove(1: string uid,2:string mid, 3:ShareStruct.TimeLineType g) throws (1: Exception.EngineException error)
}