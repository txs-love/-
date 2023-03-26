package example.Design.TemplateMethodPattern模板方法模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 16:13
 */
public class HummerH1 extends Mode {
    //设置是否有喇叭
    protected Boolean Alarm = false;
    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }
    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样在...");
    }
    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }
    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    protected boolean isAlarm() {
        return this.isAlarm();
    }
    public void setIsAlarm(){
        Alarm = this.isAlarm();
    }
}
