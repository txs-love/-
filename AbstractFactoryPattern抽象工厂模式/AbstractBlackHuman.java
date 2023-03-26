package example.Design.AbstractFactoryPattern抽象工厂模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 12:56
 */
public abstract class  AbstractBlackHuman implements Human {
    public void cry() {
    System.out.println("黑人会哭");
     }
    public void laugh() {
        System.out.println("黑人会笑");
    }
    public void talk() {
        System.out.println("黑人可以说话，一般人听不懂");
    }

}
