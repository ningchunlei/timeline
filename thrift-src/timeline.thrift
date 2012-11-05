namespace java org.iko.thrift

include "ShareStruct.thrift"
include "Exception.thrift"

service TimeLineIFace{
    ShareStruct.TimeLine get(1: string uid,2:ShareStruct.TimeLineType g,3:string latest,4:i32 len) throws (1:Exception.EngineException error)
    i32 add(1:string uid,2:list <ShareStruct.TimeLineType> g,3:string mid) throws (1:Exception.EngineException error)
    i32 remove(1: string uid,2:string mid, 3:ShareStruct.TimeLineType g) throws (1: Exception.EngineException error)
}