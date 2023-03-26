package example.Design.AdapterPattern适配器模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 15:34
 */
public interface IUserInfo {       //得到接口实现类;
    //获得用户姓名
    public String getUserName(String name);

    //获得家庭地址
    public String getHomeAddress(String address);

    //手机号码，这个太重要，手机泛滥呀
    public String getMobileNumber(String MobileNumber);

    //办公电话，一般式座机
    public String getOfficeTelNumber(String OfficeTelNumber);

    //这个人的职位是啥
    public String getJobPosition(String Position);

    //获得家庭电话，这个有点缺德，我是不喜欢打家庭电话讨论工作
    public String getHomeTelNumber(String HomeTelNumber);
}
