package example.Design.TemplateMethodPattern模板方法模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 16:18
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 在父类当中尽量不要调用子类方法;
         */
        HummerH2 h2 = new HummerH2();
        h2.run(); //H2型号的悍马跑起来

        HummerH1 h1 = new HummerH1();
        h1.Alarm = true;     //这里可以设置喇叭
        h1.run();  //H1型号的悍马跑起来
    }
}
