package example.Design.BuilderPattern建筑者模式;

import example.algorithm.递归算法.递归八皇后算法;

import java.util.ArrayList;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 7:46
 这个可以实现开始的顺序问题，要是开始得慢，是先启动引擎还是鸣喇叭
*/

/**
 * 大家看一下程序中有很多 this 调用，这个我一般是这样要求项目组成员的，如果你要调用类中的成员变量
 * 或方法，需要在前面加上 this 关键字，不加也能正常的跑起来，但是不清晰，加上 this 关键字，我就是要调
 * 用本类中成员变量或方法，而不是本方法的中的一个变量，还有 super 方法也是一样，是调用父类的的成员变
 * 量或者方法，那就加上这个关键字，不要省略，这要靠约束，还有就是程序员的自觉性，他要是死不悔改，那咱
 * 也没招。
 */
public class Client {
    public static void main(String[] args) {
        BMWModel bmwModel = new BMWModel();
        ArrayList<String> sequence = new ArrayList<String>();    //存放run的顺序
        sequence.add("engine boom");    //启动引擎;
        sequence.add("alarm");
        sequence.add("start");
        sequence.add("stop");
        bmwModel.setSequence(sequence);
        bmwModel.run();
        System.out.println("------------");

        ArrayList<String> sequence1 = new ArrayList<>();
        sequence1.add("stop");
        sequence1.add("start");
        sequence1.add("alarm");
        sequence1.add("engine boom");
        BenzBuilder benzBuilder = new BenzBuilder();
        //把顺序给这个builder类，制造出这样一个车出来
        benzBuilder.setSequence(sequence1);
        //制造出一个奔驰车
        BenzModel benz = (BenzModel)benzBuilder.getCarModel();
        //奔驰车跑一下看看
        benz.run();

        System.out.println("-------------");

        BMWBulider bmwBulider = new BMWBulider();
        //把顺序给这个builder类，制造出这样一个车出来
        bmwBulider.setSequence(sequence1);
        //制造出一个宝马车
        BMWModel benzModel= (BMWModel)bmwBulider.getCarModel();
        //宝马车跑一下看看
        benzModel.run();

    }
}
