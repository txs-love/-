package example.Design.StatePattern状态模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 17:38
 */
public class Client {      //客户;
    public static void main(String[] args) {
        /**
         * Client 调用类太简单了，只要定义个电梯的初始状态，然后调用相关的方法，就完成了，完全不用考虑电梯的状态;
         * Context定义出电梯当前的状态并且使其元素带环境当中，我们直接调用Context来完成元素;
         *
         * 当一个对象内在状态
         * 改变时允许其改变行为，这个对象看起来像是改变了其类。也就是说状态模式封装的非常好，状态的变更
         * 引起了行为的变更，从外部看起来就好像这个对象对应的类发生了改变一样。状态模式的通用实现类如下：
         *
         * 状态模式使用于当某个对象在它的状态发生改变时，它的行为也随着发生比较大的变化，也就是说行
         * 为是受状态约束的情况下可以使用状态模式，而且状态模式使用时对象的状态最好不要超过五个，防止你
         * 写子类写疯掉。
         *
         * 状态模式 + 建造者模式 = 很好的封装性;
         */
        ILift lift = new Lift();

        //电梯的初始条件应该是停止状态
        lift.setState(ILift.STOPPING_STATE);

        //首先是电梯门开启，人进去
        lift.open();

        //然后电梯门关闭
        lift.close();

        //再然后，电梯跑起来，向上或者向下
        lift.run();

        //最后到达目的地，电梯挺下来
        lift.stop();

    }
}
