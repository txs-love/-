package example.Design.BuilderPattern建筑者模式;

import java.util.ArrayList;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 16:59
奔驰、宝马都是一个产品，他们有共有的属性，牛叉公司关心的是单个模型，奔驰模
型 A 是先有引擎声音，然后再启动；奔驰模型 B 呢是先启动起来，然后再有引擎声音，这才是牛叉公司要
关关心的，那到我们老大这边呢，就是满足人家的要求，要什么顺序就立马能产生什么顺序的模型出来，
我呢就负责把老大的要求实现掉，而且还要是批量的，看不懂？没关系，继续看下去，首先由我生产出 N
多个奔驰和宝马车辆模型，这些车辆模型的都有 run 方法，但是具体到每一个模型的 run 方法可能中间的
执行任务的顺序是不同的，老大说要啥顺序，我就给啥顺序，最终客户买走后只能是既定的模型，还是没
听明白，我们继续，我们先把我们最基本的对象 Product 在类图中表明出来：
*/
public abstract class CarModel {
    //这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();
    /*
     * 模型是启动开始跑了
     */
    protected abstract void start();

    //能发动，那还要能停下来，那才是真本事
    protected abstract void stop();

    //喇叭会出声音，是滴滴叫，还是哔哔叫
    protected abstract void alarm();

    //引擎会轰隆隆的响，不响那是假的
    protected abstract void engineBoom();

    //那模型应该会跑吧，别管是人推的，还是电力驱动，总之要会跑
    final public void run() {     //调用模型;

        //循环一遍，谁在前，就先执行谁
        for(int i=0;i<this.sequence.size();i++){
            String actionName = this.sequence.get(i);

            if(actionName.equalsIgnoreCase("start")){ //如果是start关键字，
                this.start(); //开启汽车
            }else if(actionName.equalsIgnoreCase("stop")){ //如果是stop关键字
                this.stop(); //停止汽车
            }else if(actionName.equalsIgnoreCase("alarm")){ //如果是alarm关键字
                this.alarm(); //喇叭开始叫了
            }else if(actionName.equalsIgnoreCase("engine boom")){ //如果是engine
                this.engineBoom(); //引擎开始轰鸣
            }

        }

    }

    //把传递过来的值传递到类内
    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }
}
