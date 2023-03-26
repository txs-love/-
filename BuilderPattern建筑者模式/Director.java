package example.Design.BuilderPattern建筑者模式;

import java.util.ArrayList;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 8:19
 */
public class Director {
    /**
     * 实现同一个品牌车的不同类型功能;
     */
        private ArrayList<String> sequence = new ArrayList();
        private BenzBuilder benzBuilder = new BenzBuilder();
        private BMWBulider bmwBuilder = new BMWBulider();

        /*
         * A类型的奔驰车模型，先start,然后stop,其他什么引擎了，喇叭一概没有
         */
        public BenzModel getABenzModel(){
            //清理场景，这里是一些初级程序员不注意的地方
            /**
             *  * 上面每个方法都一个 this.sequence.clear()，这个估计你一看就明白，但是做为一个系统分析师或是
             *  * 技术经理一定要告诉告诉项目成员，ArrayList 和 HashMap 如果定义成类的成员变量，那你在方法中调用一
             *  * 定要做一个 clear 的动作，防止数据混乱，这个如果你发生过一次问题的话，比如 ArrayList 中出现一个“出
             *  * 乎意料”的数据，而你又花费了几个通宵才解决这个问题，那你会有很深刻的印象。
             */
            this.sequence.clear();

            //这只ABenzModel的执行顺序
            this.sequence.add("start");
            this.sequence.add("stop");

            //按照顺序返回一个奔驰车
            this.benzBuilder.setSequence(this.sequence);
            return (BenzModel)this.benzBuilder.getCarModel();

        }

        /*
         * B型号的奔驰车模型，是先发动引擎，然后启动，然后停止，没有喇叭
         */
        public BenzModel getBBenzModel(){
            this.sequence.clear();

            this.sequence.add("engine boom");
            this.sequence.add("start");
            this.sequence.add("stop");

            this.benzBuilder.setSequence(this.sequence);
            return (BenzModel)this.benzBuilder.getCarModel();
        }

        /*
         * C型号的宝马车是先按下喇叭（炫耀嘛），然后启动，然后停止
         */
        public BMWModel getCBMWModel(){
            this.sequence.clear();

            this.sequence.add("alarm");
            this.sequence.add("start");
            this.sequence.add("stop");
            this.bmwBuilder.setSequence(this.sequence);
            return (BMWModel)this.bmwBuilder.getCarModel();
        }

        /*
         * D类型的宝马车只有一个功能，就是跑，启动起来就跑，永远不停止，牛叉
         */
        public BMWModel getDBMWModel(){
            this.sequence.clear();

            this.sequence.add("start");

            this.bmwBuilder.setSequence(this.sequence);
            return (BMWModel) this.bmwBuilder.getCarModel();
        }
        /*
         * 这里还可以有很多方法，你可以先停止，然后再启动，或者一直停着不动，静态的嘛
         * 导演类嘛，按照什么顺序是导演说了算
         */
    }
