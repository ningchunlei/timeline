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
  UserFollowers = 21,
  UserFollowing = 22,
  TopicFollowers = 23,
  TopicFollowing = 24

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

enum OtherLogin{
   QQ = 41,
   RenRen=42
}

enum  ReserveUID{
   latest = 0,
   chinese = 1,
   math = 2,
   eng = 3,
   physics = 4,
   chemistry = 5,

   chinese_7 = 11,
   math_7 = 12,
   eng_7 = 13,
   physics_7 = 14,
   chemistry_7 = 15,

   chinese_8 = 21,
   math_8 = 22,
   eng_8 = 23,
   physics_8 = 24,
   chemistry_8 = 25,

   chinese_9 = 31,
   math_9 = 32,
   eng_9 = 33,
   physics_9 = 34,
   chemistry_9 = 35

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

struct User{
    1: string phone,
    2: string nick,
    3: string password,
    4: i32 city,
    5: i32 street,
    6: i32 school,
    7: i32 grade,
    8: i32 sex,
    9: i32 uid,
    10: string code,
    11: i32 type,
    12: i32 money,
    13: i32 point,
    14: string desc,
    15: list<i32> tags,
    16: string qq;
    17: string renren;
}





