namespace java org.iko.thrift

include "ShareStruct.thrift"
include "Exception.thrift"

service UserIFace{

    i32 isRegister()
    i32 registerUser(1:ShareStruct.User user),
    i32 modifyPasswd(1:ShareStruct.User user,2:string newpasswd),
    i32 bindingQQ(1:string qq,3:string uid),
    i32 bindingRenRen(1:string renren,3:string uid),
    string login(1:ShareStruct.User user,2:string token,3: i32 expire),
    i32 logout(1:string token),

    i32 sendCode(1:string phone,2:i32 expire),
    i32 verifyCode(1:string phone,2:i32 code),

    map<string,i32> getCity(),
    map<string,i32> getStreet(1:i32 city),
    map<string,i32> getSchool(1:i32 street),
    map<string,i32> getGrade(1:i32 school),

    map<i32,i32> getCounter(1:string uid),
    i32 incCounter(1:string uid,2:i32 g,3:i32 s),
    i32 decrCounter(1:string uid,2:i32 g,3:i32 s)

}