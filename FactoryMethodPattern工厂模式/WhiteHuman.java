package example.Design.FactoryMethodPattern工厂模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 12:55
 */
public class WhiteHuman implements Human{
    public void cry() {
        System.out.println("白色人种会哭");
    }
    public void laugh() {
        System.out.println("白色人种会大笑，侵略的笑声");
    }
    public void talk() {
        System.out.println("白色人种会说话，一般都是但是单字节！");
    }
}
