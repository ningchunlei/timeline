//
// Autogenerated by Thrift Compiler (0.7.0)
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//
var Thrift = require('thrift').Thrift;
var ttypes = module.exports = {};
ttypes.TimeLineType = {
'Inbox' : 1,
'Outbox' : 2,
'ReadNotice' : 3,
'UnReadNotice' : 4
};
ttypes.MsgType = {
'Comment' : 10,
'Post' : 11
};
ttypes.RelationType = {
'UserFollowers' : 21,
'UserFollowing' : 22,
'TopicFollowers' : 23,
'TopicFollowing' : 24
};
ttypes.GradeCategory = {
'Grade7' : 31,
'Grade8' : 32,
'Grade9' : 33
};
ttypes.AttachType = {
'Normal' : 0,
'Photo' : 1,
'Video' : 2,
'Music' : 3,
'SinaPhoto' : 4
};
ttypes.OtherLogin = {
'QQ' : 41,
'RenRen' : 42
};
ttypes.ReserveUID = {
'latest' : 0,
'chinese' : 1,
'math' : 2,
'eng' : 3,
'physics' : 4,
'chemistry' : 5,
'chinese_7' : 11,
'math_7' : 12,
'eng_7' : 13,
'physics_7' : 14,
'chemistry_7' : 15,
'chinese_8' : 21,
'math_8' : 22,
'eng_8' : 23,
'physics_8' : 24,
'chemistry_8' : 25,
'chinese_9' : 31,
'math_9' : 32,
'eng_9' : 33,
'physics_9' : 34,
'chemistry_9' : 35
};
var Attach = module.exports.Attach = function(args) {
  this.attachtext = null;
  this.type = null;
  this.attachname = null;
  if (args) {
    if (args.attachtext !== undefined) {
      this.attachtext = args.attachtext;
    }
    if (args.type !== undefined) {
      this.type = args.type;
    }
    if (args.attachname !== undefined) {
      this.attachname = args.attachname;
    }
  }
};
Attach.prototype = {};
Attach.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.attachtext = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.I32) {
        this.type = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRING) {
        this.attachname = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

Attach.prototype.write = function(output) {
  output.writeStructBegin('Attach');
  if (this.attachtext) {
    output.writeFieldBegin('attachtext', Thrift.Type.STRING, 1);
    output.writeString(this.attachtext);
    output.writeFieldEnd();
  }
  if (this.type) {
    output.writeFieldBegin('type', Thrift.Type.I32, 2);
    output.writeI32(this.type);
    output.writeFieldEnd();
  }
  if (this.attachname) {
    output.writeFieldBegin('attachname', Thrift.Type.STRING, 3);
    output.writeString(this.attachname);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var Msg = module.exports.Msg = function(args) {
  this.mid = null;
  this.msgtext = null;
  this.uid = null;
  this.pushlishTime = null;
  this.type = null;
  this.category = null;
  this.ip = null;
  this.device = null;
  this.attachments = null;
  this.msgdesc = null;
  this.tags = null;
  if (args) {
    if (args.mid !== undefined) {
      this.mid = args.mid;
    }
    if (args.msgtext !== undefined) {
      this.msgtext = args.msgtext;
    }
    if (args.uid !== undefined) {
      this.uid = args.uid;
    }
    if (args.pushlishTime !== undefined) {
      this.pushlishTime = args.pushlishTime;
    }
    if (args.type !== undefined) {
      this.type = args.type;
    }
    if (args.category !== undefined) {
      this.category = args.category;
    }
    if (args.ip !== undefined) {
      this.ip = args.ip;
    }
    if (args.device !== undefined) {
      this.device = args.device;
    }
    if (args.attachments !== undefined) {
      this.attachments = args.attachments;
    }
    if (args.msgdesc !== undefined) {
      this.msgdesc = args.msgdesc;
    }
    if (args.tags !== undefined) {
      this.tags = args.tags;
    }
  }
};
Msg.prototype = {};
Msg.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.mid = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.msgtext = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRING) {
        this.uid = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.STRING) {
        this.pushlishTime = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 6:
      if (ftype == Thrift.Type.I32) {
        this.type = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 7:
      if (ftype == Thrift.Type.I32) {
        this.category = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 8:
      if (ftype == Thrift.Type.STRING) {
        this.ip = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 9:
      if (ftype == Thrift.Type.STRING) {
        this.device = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 10:
      if (ftype == Thrift.Type.LIST) {
        var _size0 = 0;
        var _rtmp34;
        this.attachments = [];
        var _etype3 = 0;
        _rtmp34 = input.readListBegin();
        _etype3 = _rtmp34.etype;
        _size0 = _rtmp34.size;
        for (var _i5 = 0; _i5 < _size0; ++_i5)
        {
          var elem6 = null;
          elem6 = new ttypes.Attach();
          elem6.read(input);
          this.attachments.push(elem6);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 11:
      if (ftype == Thrift.Type.STRING) {
        this.msgdesc = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 12:
      if (ftype == Thrift.Type.LIST) {
        var _size7 = 0;
        var _rtmp311;
        this.tags = [];
        var _etype10 = 0;
        _rtmp311 = input.readListBegin();
        _etype10 = _rtmp311.etype;
        _size7 = _rtmp311.size;
        for (var _i12 = 0; _i12 < _size7; ++_i12)
        {
          var elem13 = null;
          elem13 = input.readString();
          this.tags.push(elem13);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

Msg.prototype.write = function(output) {
  output.writeStructBegin('Msg');
  if (this.mid) {
    output.writeFieldBegin('mid', Thrift.Type.STRING, 1);
    output.writeString(this.mid);
    output.writeFieldEnd();
  }
  if (this.msgtext) {
    output.writeFieldBegin('msgtext', Thrift.Type.STRING, 2);
    output.writeString(this.msgtext);
    output.writeFieldEnd();
  }
  if (this.uid) {
    output.writeFieldBegin('uid', Thrift.Type.STRING, 3);
    output.writeString(this.uid);
    output.writeFieldEnd();
  }
  if (this.pushlishTime) {
    output.writeFieldBegin('pushlishTime', Thrift.Type.STRING, 5);
    output.writeString(this.pushlishTime);
    output.writeFieldEnd();
  }
  if (this.type) {
    output.writeFieldBegin('type', Thrift.Type.I32, 6);
    output.writeI32(this.type);
    output.writeFieldEnd();
  }
  if (this.category) {
    output.writeFieldBegin('category', Thrift.Type.I32, 7);
    output.writeI32(this.category);
    output.writeFieldEnd();
  }
  if (this.ip) {
    output.writeFieldBegin('ip', Thrift.Type.STRING, 8);
    output.writeString(this.ip);
    output.writeFieldEnd();
  }
  if (this.device) {
    output.writeFieldBegin('device', Thrift.Type.STRING, 9);
    output.writeString(this.device);
    output.writeFieldEnd();
  }
  if (this.attachments) {
    output.writeFieldBegin('attachments', Thrift.Type.LIST, 10);
    output.writeListBegin(Thrift.Type.STRUCT, this.attachments.length);
    for (var iter14 in this.attachments)
    {
      if (this.attachments.hasOwnProperty(iter14))
      {
        iter14 = this.attachments[iter14];
        iter14.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.msgdesc) {
    output.writeFieldBegin('msgdesc', Thrift.Type.STRING, 11);
    output.writeString(this.msgdesc);
    output.writeFieldEnd();
  }
  if (this.tags) {
    output.writeFieldBegin('tags', Thrift.Type.LIST, 12);
    output.writeListBegin(Thrift.Type.STRING, this.tags.length);
    for (var iter15 in this.tags)
    {
      if (this.tags.hasOwnProperty(iter15))
      {
        iter15 = this.tags[iter15];
        output.writeString(iter15);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var TimeLine = module.exports.TimeLine = function(args) {
  this.uid = null;
  this.group = null;
  this.mids = null;
  if (args) {
    if (args.uid !== undefined) {
      this.uid = args.uid;
    }
    if (args.group !== undefined) {
      this.group = args.group;
    }
    if (args.mids !== undefined) {
      this.mids = args.mids;
    }
  }
};
TimeLine.prototype = {};
TimeLine.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.uid = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.I32) {
        this.group = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.LIST) {
        var _size16 = 0;
        var _rtmp320;
        this.mids = [];
        var _etype19 = 0;
        _rtmp320 = input.readListBegin();
        _etype19 = _rtmp320.etype;
        _size16 = _rtmp320.size;
        for (var _i21 = 0; _i21 < _size16; ++_i21)
        {
          var elem22 = null;
          elem22 = input.readString();
          this.mids.push(elem22);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

TimeLine.prototype.write = function(output) {
  output.writeStructBegin('TimeLine');
  if (this.uid) {
    output.writeFieldBegin('uid', Thrift.Type.STRING, 1);
    output.writeString(this.uid);
    output.writeFieldEnd();
  }
  if (this.group) {
    output.writeFieldBegin('group', Thrift.Type.I32, 2);
    output.writeI32(this.group);
    output.writeFieldEnd();
  }
  if (this.mids) {
    output.writeFieldBegin('mids', Thrift.Type.LIST, 3);
    output.writeListBegin(Thrift.Type.STRING, this.mids.length);
    for (var iter23 in this.mids)
    {
      if (this.mids.hasOwnProperty(iter23))
      {
        iter23 = this.mids[iter23];
        output.writeString(iter23);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

var User = module.exports.User = function(args) {
  this.phone = null;
  this.nick = null;
  this.password = null;
  this.city = null;
  this.street = null;
  this.school = null;
  this.grade = null;
  this.sex = null;
  this.uid = null;
  this.code = null;
  this.type = null;
  this.money = null;
  this.point = null;
  this.desc = null;
  this.tags = null;
  this.qq = null;
  this.renren = null;
  if (args) {
    if (args.phone !== undefined) {
      this.phone = args.phone;
    }
    if (args.nick !== undefined) {
      this.nick = args.nick;
    }
    if (args.password !== undefined) {
      this.password = args.password;
    }
    if (args.city !== undefined) {
      this.city = args.city;
    }
    if (args.street !== undefined) {
      this.street = args.street;
    }
    if (args.school !== undefined) {
      this.school = args.school;
    }
    if (args.grade !== undefined) {
      this.grade = args.grade;
    }
    if (args.sex !== undefined) {
      this.sex = args.sex;
    }
    if (args.uid !== undefined) {
      this.uid = args.uid;
    }
    if (args.code !== undefined) {
      this.code = args.code;
    }
    if (args.type !== undefined) {
      this.type = args.type;
    }
    if (args.money !== undefined) {
      this.money = args.money;
    }
    if (args.point !== undefined) {
      this.point = args.point;
    }
    if (args.desc !== undefined) {
      this.desc = args.desc;
    }
    if (args.tags !== undefined) {
      this.tags = args.tags;
    }
    if (args.qq !== undefined) {
      this.qq = args.qq;
    }
    if (args.renren !== undefined) {
      this.renren = args.renren;
    }
  }
};
User.prototype = {};
User.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.phone = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.nick = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRING) {
        this.password = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.I32) {
        this.city = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.I32) {
        this.street = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 6:
      if (ftype == Thrift.Type.I32) {
        this.school = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 7:
      if (ftype == Thrift.Type.I32) {
        this.grade = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 8:
      if (ftype == Thrift.Type.I32) {
        this.sex = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 9:
      if (ftype == Thrift.Type.I32) {
        this.uid = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 10:
      if (ftype == Thrift.Type.STRING) {
        this.code = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 11:
      if (ftype == Thrift.Type.I32) {
        this.type = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 12:
      if (ftype == Thrift.Type.I32) {
        this.money = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 13:
      if (ftype == Thrift.Type.I32) {
        this.point = input.readI32();
      } else {
        input.skip(ftype);
      }
      break;
      case 14:
      if (ftype == Thrift.Type.STRING) {
        this.desc = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 15:
      if (ftype == Thrift.Type.LIST) {
        var _size24 = 0;
        var _rtmp328;
        this.tags = [];
        var _etype27 = 0;
        _rtmp328 = input.readListBegin();
        _etype27 = _rtmp328.etype;
        _size24 = _rtmp328.size;
        for (var _i29 = 0; _i29 < _size24; ++_i29)
        {
          var elem30 = null;
          elem30 = input.readI32();
          this.tags.push(elem30);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 16:
      if (ftype == Thrift.Type.STRING) {
        this.qq = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 17:
      if (ftype == Thrift.Type.STRING) {
        this.renren = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

User.prototype.write = function(output) {
  output.writeStructBegin('User');
  if (this.phone) {
    output.writeFieldBegin('phone', Thrift.Type.STRING, 1);
    output.writeString(this.phone);
    output.writeFieldEnd();
  }
  if (this.nick) {
    output.writeFieldBegin('nick', Thrift.Type.STRING, 2);
    output.writeString(this.nick);
    output.writeFieldEnd();
  }
  if (this.password) {
    output.writeFieldBegin('password', Thrift.Type.STRING, 3);
    output.writeString(this.password);
    output.writeFieldEnd();
  }
  if (this.city) {
    output.writeFieldBegin('city', Thrift.Type.I32, 4);
    output.writeI32(this.city);
    output.writeFieldEnd();
  }
  if (this.street) {
    output.writeFieldBegin('street', Thrift.Type.I32, 5);
    output.writeI32(this.street);
    output.writeFieldEnd();
  }
  if (this.school) {
    output.writeFieldBegin('school', Thrift.Type.I32, 6);
    output.writeI32(this.school);
    output.writeFieldEnd();
  }
  if (this.grade) {
    output.writeFieldBegin('grade', Thrift.Type.I32, 7);
    output.writeI32(this.grade);
    output.writeFieldEnd();
  }
  if (this.sex) {
    output.writeFieldBegin('sex', Thrift.Type.I32, 8);
    output.writeI32(this.sex);
    output.writeFieldEnd();
  }
  if (this.uid) {
    output.writeFieldBegin('uid', Thrift.Type.I32, 9);
    output.writeI32(this.uid);
    output.writeFieldEnd();
  }
  if (this.code) {
    output.writeFieldBegin('code', Thrift.Type.STRING, 10);
    output.writeString(this.code);
    output.writeFieldEnd();
  }
  if (this.type) {
    output.writeFieldBegin('type', Thrift.Type.I32, 11);
    output.writeI32(this.type);
    output.writeFieldEnd();
  }
  if (this.money) {
    output.writeFieldBegin('money', Thrift.Type.I32, 12);
    output.writeI32(this.money);
    output.writeFieldEnd();
  }
  if (this.point) {
    output.writeFieldBegin('point', Thrift.Type.I32, 13);
    output.writeI32(this.point);
    output.writeFieldEnd();
  }
  if (this.desc) {
    output.writeFieldBegin('desc', Thrift.Type.STRING, 14);
    output.writeString(this.desc);
    output.writeFieldEnd();
  }
  if (this.tags) {
    output.writeFieldBegin('tags', Thrift.Type.LIST, 15);
    output.writeListBegin(Thrift.Type.I32, this.tags.length);
    for (var iter31 in this.tags)
    {
      if (this.tags.hasOwnProperty(iter31))
      {
        iter31 = this.tags[iter31];
        output.writeI32(iter31);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.qq) {
    output.writeFieldBegin('qq', Thrift.Type.STRING, 16);
    output.writeString(this.qq);
    output.writeFieldEnd();
  }
  if (this.renren) {
    output.writeFieldBegin('renren', Thrift.Type.STRING, 17);
    output.writeString(this.renren);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

