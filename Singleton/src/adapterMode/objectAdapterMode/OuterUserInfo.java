package adapterMode.objectAdapterMode;

import adapterMode.classAdapterMode.userInfo.IUserInfo;
import adapterMode.objectAdapterMode.outerInfo.IOuterUserBaseInfo;
import adapterMode.objectAdapterMode.outerInfo.IOuterUserHomeInfo;
import adapterMode.objectAdapterMode.outerInfo.IOuterUserOfficeInfo;

import java.util.Map;

public class OuterUserInfo implements IUserInfo {
    //源目标对象
    private IOuterUserBaseInfo baseInfo = null; //员工的基本信息
    private IOuterUserHomeInfo homeInfo = null; //员工的家庭信息
    private IOuterUserOfficeInfo officeInfo = null; //工作信息
    //数据处理
    private Map baseMap = null;
    private Map homeMap = null;
    private Map officeMap = null;

    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
        this.officeInfo = officeInfo;
        baseMap= baseInfo.getUserBaseInfo();
        homeMap= homeInfo.getUserHomeInfo();
        officeMap= officeInfo.getUserOfficeInfo();
    }
    public String getHomeAddress() {
        String homeAddress = (String)this.homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }
    //家庭电话号码
    public String getHomeTelNumber() {
        String homeTelNumber = (String)this.homeMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;}
    public String getJobPosition() {
        String jobPosition = (String)this.officeMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }
    //手机号码
    public String getMobileNumber() {
        String mobileNumber = (String)this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }
    //办公电话
    public String getOfficeTelNumber() {
        String officeTelNumber= (String)this.officeMap.get("officeTelNumber");
                System.out.println(officeTelNumber);
        return officeTelNumber;
    }
    public String getUserName() {
        String userName = (String)this.baseMap.get("userName");
        System.out.println(userName);
        return userName;
    }

}
