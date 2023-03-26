package example.Design.StrategyPattern策略模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 9:06

 *  *问题来了：赵云实际不知道是那个策略呀，他只知道拆第一个锦囊，
 *  *而不知道是BackDoor这个妙计，咋办？ 似乎这个策略模式已经把计谋名称写出来了
 *  *
 *  * 错！BackDoor、GivenGreenLight、BlockEnemy只是一个代码，你写成first、second、
 *    third，没人会说你错!
 *  *
 *  * 策略模式的好处就是：体现了高内聚低耦合的特性呀，缺点嘛，这个那个，我回去再查查
 *  */
public class ZhaoYun {
    Context context;       //装入计划的口袋;
    public static void main(String[] args) {
        System.out.println("拿到第一个demo1");
        Context context1 = new Context(new BackDoor());
        context1.openator();      //操作第一个;

        System.out.println("...............");
        System.out.println("拿到第二个demo2");
        Context context2 = new Context(new GivenGreenLight());
        context2.openator();      //操作第二个

        System.out.println("...............");
        System.out.println("拿到第三个demo3");
        Context context3 = new Context(new BlockEnemy());
        context3.openator();      //操作第二个


    }
}
