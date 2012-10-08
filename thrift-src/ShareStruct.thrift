namespace java org.iko.thrift

include "Exception.thrift"
include "ErrorNo.thrift"

enum TimeLineType {
  Inbox = 1,
  Outbox = 2,
  At = 3,
  Repost = 4,
  Comment = 5,
  Favorite = 6,
}

enum MsgType{
   Repost = 4,
   Comment = 5,
   Post = 7,
}

enum RelationType{
  Followers = 8,
  Following = 9,
}

enum MsgTag {
   All = 10
}

enum AttachType{
	Normal =0,
	Photo = 1,
	Video = 2,
	Music = 3,
	SinaPhoto = 4
}

struct Attach{
	1: string attachtext,
	2: AttachType type,
	3: optional string attachname
}

struct ShortURL {
	1: string url,
	2: string tiny_url,
	3: optional string info,
	4: string actual_url
}

struct Msg{
  1: string mid,
  2: string msgtext,
  3: string uid,
  5: string pushlishTime,
  6: MsgType type,
  7: MsgTag tag,
  8: string ip,
  9: string device,
  10: list<string> atIds,
  11: list<Attach> attachments,
  12: list<ShortURL> shorturl
}

struct TimeLine{
    1: string uid,
    2: TimeLineType group,
    3: list<string> mids
}



