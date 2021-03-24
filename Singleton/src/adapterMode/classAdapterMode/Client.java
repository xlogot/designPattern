package adapterMode.classAdapterMode;

import adapterMode.classAdapterMode.OuterUserInfo;
import adapterMode.classAdapterMode.userInfo.IUserInfo;
import adapterMode.classAdapterMode.userInfo.UserInfo;

public class Client {
    public static void main(String[] args) {
        IUserInfo youngGirl=new UserInfo();
        for (int i = 0; i < 10; i++) {
            youngGirl.getMobileNumber();
        }

        IUserInfo youngGirl1=new OuterUserInfo();
        for (int i = 0; i < 10; i++) {
            youngGirl1.getMobileNumber();
        }
    }
}
