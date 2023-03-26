package example.Design.ChainOfResponsibilityPattern责任链模式;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 16:31
 */
public class Client {
    /**
     * 三从四德:    未嫁随父 + 嫁夫随父 + 夫死随子;
     * @param args
     * 责任链模式屏蔽了请求的处理过程，你发起一个请求到底是谁处理的，这个你不用关心，只要你把请求抛给责任链的第一个处理者，最终会返回一个处理结果
     * （当然也可以不做任何处理），作为请求者可以不用知道到底是需要谁来处理的，这是责任链模式的核心；同时责任链模式也可以做为一种补救模式来使用，
     *
     * 举个简单例子，如项目开发的时候，需求确认是这样的：一个请求（比如银行客户存款的币种），一个处理者（只处理人民币），但是随着业务的发展
     * （改革开放了嘛，还要处理美元、日元等等），处理者的数量和类型都有所增加，那这时候就可以在第一个处理者后面建立一个链，也就是责任链来处理请求，你是人民
     * 币，好，还是第一个业务逻辑来处理，你是美元，好，传递到第二个业务逻辑来处理，日元，欧元…，这些都不用在对原有的业务逻辑产生很大改变，
     * 通过扩展实现类就可以很好的解决这些需求变更的问题。责任链有一个缺点是大家在开发的时候要注意：调试不是很方便，特别是链条比较长，环节比较多的
     * 时候，由于采用了类似递归的方式，调试的时候逻辑可能比较复杂。
     */
    public static void main(String[] args) {
        //随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        /**
        for(int i=0;i<5;i++){
            arrayList.add(new Women(rand.nextInt(4),"我要出去逛街"));
        }
         */

        //定义三个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        /**
         * 违背迪米特法则:
         * 1.  迪米特法则(Demeter Principle)又叫最少知道原则，即一个类对自己依赖的类知道的越少越好。也就是说，对于
         *       被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。对外除了提供的 public 方法，不对外泄露任何信息
         * 2.  迪米特法则还有个更简单的定义：只与直接的朋友通信
         */

        for(IWomen women:arrayList){
            if(women.getType() ==1){ //未结婚少女，请示父亲
                System.out.println("\n--------女儿向父亲请示-------");
                father.HandleMessage(women);
            }else if(women.getType() ==2){ //已婚少妇，请示丈夫
                System.out.println("\n--------妻子向丈夫请示-------");
                husband.HandleMessage(women);
            }else if(women.getType() == 3){ //母亲请示儿子
                System.out.println("\n--------母亲向儿子请示-------");
                son.HandleMessage(women);
            }else{
                //暂时啥也不做
            }
        }


        //上面的不需要了，选择哪个阶段按照责任链来:

        //定义三个请示对象
        Handler father1 = new Father();
        Handler husband1 = new Husband();
        Handler son1 = new Son();

        //设置请示顺序
        father1.setNext(husband1);       //通过责任链来表示;
        husband1.setNext(son1);

        for(IWomen women:arrayList){
            father.HandleMessage(women);
        }
    }
}

