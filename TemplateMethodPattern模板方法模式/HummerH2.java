package example.Design.TemplateMethodPattern模板方法模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 16:14
 */
public class HummerH2 extends Mode{
    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }
    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样在...");
    }
    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }
    @Override
    public void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    protected boolean isAlarm() {
        return false;   //默认是否会灯响应;
    }
}
