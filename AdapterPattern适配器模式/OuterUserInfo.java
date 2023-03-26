package example.Design.AdapterPattern适配器模式;

import java.util.Map;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 15:51
 */
public class OuterUserInfo extends OuterUser implements IUserInfo{
    private Map baseInfo = super.getUserBaseInfo(); //员工的基本信息
    private Map homeInfo = super.getUserHomeInfo(); //员工的家庭 信息
    private Map officeInfo = super.getUserOfficeInfo(); //工作信息


    @Override
    public String getUserName(String name) {
        String UserName = (String)this.homeInfo.get("UserName");
        System.out.println(UserName);
        return UserName;
    }

    @Override
    public String getHomeAddress(String address) {
        String UserAddress  = (String)this.homeInfo.get("UserAddress");
        System.out.println(UserAddress);
        return UserAddress;
    }

    @Override
    public String getMobileNumber(String MobileNumber) {
        String MobileNumber1 = (String) this.homeInfo.get("家庭电话");
        System.out.println(MobileNumber1);
        return MobileNumber1;
    }

    @Override
    public String getOfficeTelNumber(String OfficeTelNumber) {
        String OfficeTelNumber1 = (String) this.officeInfo.get("移动电话");
        System.out.println(OfficeTelNumber1);
        return OfficeTelNumber1;
    }

    @Override
    public String getJobPosition(String Position) {
        String address1 = (String) this.baseInfo.get("Position");
        System.out.println(address1);
        return address1;
    }

    @Override
    public String getHomeTelNumber(String HomeTelNumber) {
        String HomeNumber = (String) this.homeInfo.get("家庭电话");
        System.out.println(HomeNumber);
        return HomeNumber;
    }
}
