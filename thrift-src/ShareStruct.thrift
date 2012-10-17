namespace java org.iko.thrift

include "Exception.thrift"
include "ErrorNo.thrift"

enum TimeLineType {
  Inbox = 1,
  Outbox = 2,
  ReadNotice = 3,
  UnReadNotice = 4
}

enum MsgType{
   Comment = 10,
   Post = 11
}

enum RelationType{
  Followers = 21,
  Following = 22,
}

enum GradeCategory{
  Grade7 = 31,
  Grade8 = 32,
  Grade9 = 33
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

struct Msg{
  1: string mid,
  2: string msgtext,
  3: string uid,
  5: string pushlishTime,
  6: MsgType type,
  7: GradeCategory category,
  8: string ip,
  9: string device,
  10: list<Attach> attachments,
  11: string msgdesc,
  12: list<string> tags
}

struct TimeLine{
    1: string uid,
    2: TimeLineType group,
    3: list<string> mids
}



