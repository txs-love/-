package example.Design.ObserverPattern观察者模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 15:04
 */
public class LiSi implements ILiSI{

    //首先李斯是个观察者，一旦韩非子有活动，他就知道，他就要向老板汇报
    public void update(String str){
        System.out.println("李斯:观察到韩非子活动，开始向老板汇报了...");
        this.reportToQiShiHuang(str);     //this调用本类当中的方法;
        System.out.println("李斯：汇报完毕，秦老板赏给他两个萝卜吃吃...\n");
    }

    //汇报给秦始皇
    private void reportToQiShiHuang(String reportContext){
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->"+reportContext);
    }
}
