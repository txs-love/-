package example.Design.AdapterPattern适配器模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 15:36
 */
public class UserInfo implements IUserInfo{
    @Override
    public String getUserName(String name) {
        System.out.println("这个人的姓名: "+name);
        return null;
    }
    @Override
    public String getHomeAddress(String address) {
        System.out.println("这个人的地址: "+address);
        return null;
    }
    @Override
    public String getMobileNumber(String MobileNumber) {
        System.out.println("这个人的移动电话: "+MobileNumber);
        return null;
    }
    @Override
    public String getOfficeTelNumber(String OfficeTelNumber) {
        System.out.println("这个人的办公电话:  "+OfficeTelNumber);
        return null;
    }

    @Override
    public String getJobPosition(String Position) {
        System.out.println("这个人的地理位置:  "+Position);
        return null;
    }

    @Override
    public String getHomeTelNumber(String HomeTelNumber) {
        System.out.println("这个人的家庭电话:  "+HomeTelNumber);
        return null;
    }
}
