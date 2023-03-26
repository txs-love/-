package example.Design.AdapterPattern适配器模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 15:41
 */
public class AppDemo {
    public static void main(String[] args) {
        IUserInfo user = new UserInfo();
        //老板一想不对呀，兔子不吃窝边草，还是找人力资源的员工好点
        /**
         * 使用了适配器模式只修改了一句话，其他的业务逻辑都不用修改就解决了系统对接的问题，
         * 而且在我们实际系统中只是增加了一个业务类的继承，就实现了可以查本公司的员工信息，也可以查人力
         * 资源公司的员工信息，尽量少的修改，通过扩展的方式解决了该问题。
         */
        IUserInfo youngGirl = new OuterUserInfo(); //我们只修改了这一句好
        for (int i=0;i<101;i++){
            youngGirl.getHomeAddress("xxx"+i);
        }
    }
}
