package example.Design.MediatorPattern中介者模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 18:54
 */
public class Client {
    /**
     * 在场景类中增加了一个中介者，然后分别传递到三个同事类中，三个类都具有相同的特性：只负责处
     * 理自己的活动（行为），与自己无关的活动就丢给中介者处理，程序运行的结果是相同的。从项目设计上来
     * 看，加入了中介者，设计结构清晰了很多，而且类间的耦合性大大减少，代码质量也有了很大的提升。
     */

    /**
     * 中介者模式也叫做调停者模式，是什么意思呢？一个对象要和 N 多个对象交流，是不是就像对象间的
     * 战争，很混乱，你中有我，我中有你，那怎么才能调停这种矛盾呢？加入一个中心，所有的类都和中心交流，中心说怎么处理就这么处理，我们举一些在开发和生活中经常会碰到例子
     * @param args
     */
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        //采购人员采购电脑
        System.out.println("------采购人员采购电脑--------");
        Purchase1 purchase = new Purchase1(mediator);
        purchase.buyIBMcomputer(100);

        //销售人员销售电脑
        System.out.println("\n------销售人员销售电脑--------");
        Sale1 sale = new Sale1(mediator);
        sale.sellIBMComputer(1);

        //库房管理人员管理库存
        System.out.println("\n------库房管理人员清库处理--------");
        Stock1 stock = new Stock1(mediator);
        stock.clearStock();
    }
    /**
     MVC 框架。大家都应该使用过 Struts 吧，MVC 框架，其中的 C（Controller）就是一个中介者，叫做前
     * 端控制器(Front Controller)，它的作用就是把 M(Model，业务逻辑)和 V（View，视图）隔离开，协调 M
     * 和 V 协同工作，把 M 运行的结果和 V 代表的视图融合成一个前端可以展示的页面，减少 M 和 V 的依赖关系。MVC 框架已经成为一个非常流行、成熟的开发框架，这也是中介者模式优秀的一个体现。
     *
     C/S 结构。C/S 结构的应用也是一个典型的中介者模式，比如 MSN,张三发一个消息给李四，其过程应该
     * 是这样的：张三发送消息，MSN 服务器(中介者)接受到消息，查找李四，把消息发送到李四，同时通知张三，
     * 消息已经发送，在这里 MSN 服务器就是一个中转站，负责协调两个客户端的信息交流，与此相反的就是 IPMSG
     * （也叫飞鸽）没有使用中介者，直接使用了 UDP 广播的方式，每个客户端既是客户端也是服务端。
     */

}

