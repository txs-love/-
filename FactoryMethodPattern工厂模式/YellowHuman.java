package example.Design.FactoryMethodPattern工厂模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 12:54
 */
public class YellowHuman implements Human {
    public void cry() {
        System.out.println("黄色人种会哭");
    }

    public void laugh() {
        System.out.println("黄色人种会大笑，幸福呀！");
    }

    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节");
    }
}
