package adapterMode.classAdapterMode;

import adapterMode.classAdapterMode.outerUserInfo.OuterInfo;
import adapterMode.classAdapterMode.userInfo.IUserInfo;

import java.util.Map;

public class OuterUserInfo extends OuterInfo implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo(); //员工的基本信息
    private Map homeInfo = super.getUserHomeInfo(); //员工的家庭信息
    private Map officeInfo = super.getUserOfficeInfo(); //工作信息
    /*
     * 家庭地址
     */
    public String getHomeAddress() {
        String homeAddress = (String)this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }
    public String getHomeTelNumber() {
        String homeTelNumber = (String)this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
    public String getJobPosition() {
        String jobPosition = (String)this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }
    public String getMobileNumber() {
        String mobileNumber = (String)this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }
    public String getOfficeTelNumber() {
        String officeTelNumber = (String)this.officeInfo.get("officeTelNumbe");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }
    public String getUserName() {
        String userName = (String)this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }
}
