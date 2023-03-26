package example.Design.ObserverPattern观察者模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 14:58
 */

/**
 * 李斯，秦国的丞相，最终被残忍的车裂的那位，李斯和韩非子都是荀子的学生，李斯是师兄，韩非子是师弟，
 * 若干年后，李斯成为最强诸侯秦国的上尉，致力于统一全国，于是安插了间谍到各个国家的重要人物的身边，以获取必要的信息，
 * 韩非子作为韩国的重量级人物，身边自然没少间谍了，韩非子早饭吃的什么，中午放了几个 P，晚上在做什么娱乐，李斯都了如指掌，
 * 那可是相隔千里！怎么做到的呢？间谍呀！
 */
public class client {
    public static void main(String[] args) throws InterruptedException {
        LiSi liSi = new LiSi();    //定义李斯
        HanFeiZi hanFeiZi = new HanFeiZi();    //定义韩非子
        Watch watchBreakfast = new Watch(hanFeiZi,liSi,"haveBreakfast");
        watchBreakfast.start();    //启动;
        System.out.println("--------");

        Watch watchFun = new Watch(hanFeiZi,liSi,"haveFun");
        watchFun.start();         //启动;

        Thread.sleep(1000);
        hanFeiZi.haveBreakfast();

        Thread.sleep(1000);
        hanFeiZi.haveFun();
    }
}
