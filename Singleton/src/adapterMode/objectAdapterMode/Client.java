package adapterMode.objectAdapterMode;

import adapterMode.classAdapterMode.userInfo.IUserInfo;
import adapterMode.objectAdapterMode.outerInfo.*;
import com.sun.tools.javac.Main;

public class Client {
    public static void main(String[] args) {
        //外系统的人员信息
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
//传递三个对象
        IUserInfo youngGirl = new OuterUserInfo(baseInfo,homeInfo,officeInfo);
//从数据库中查到101个
        for(int i=0;i<11;i++){
            youngGirl.getMobileNumber();
        }
    }
}
