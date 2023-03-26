package example.Design.VisitorPattern访问者;
import java.util.List;
import java.util.ArrayList;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 17:15
 */
public class Client {
    public static void main(String[] args) {
        for(Employee emp:mockEmployee()){
            emp.report();
        }
    }
    //模拟出公司的人员情况，我们可以想象这个数据室通过持久层传递过来的
    public static List<Employee> mockEmployee(){
        List<Employee> empList = new ArrayList<Employee>();

        //产生张三这个员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);

        //产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工，审美素质太不流行了！");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);

        //再产生一个经理
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);
        return empList;

        /**
         * ，我作为一个访客（Visitor）到朋友家（Visited Class）去拜访，朋
         * 友之间聊聊天，喝喝酒，再相互吹捧吹捧，炫耀炫耀，这都正常，聊天的时候，朋友告诉我，他今年加官
         * 进爵了，工资也涨了 30%，准备再买套房子，那我就在心里盘算（Visitor-self-method）“你个龟儿子，这
         * 么有钱，老子去年要借 10W 你都不借”，我根据被朋友的信息，执行了自己的一个方法。
         * 接下来我们来思考一下，访问者可以用在什么地方。在这种地方你一定要考虑到使用访问者模式：业
         * 务规则要求遍历多个不同的对象。这本身也是访问者模式出发点，迭代器模式只能访问同类或同接口的数
         * 据，（当然了，你使用 instanceof 的话，能访问所有的数据，这个不争论），而访问者模式是对迭代器模式
         * 的扩充，可以遍历不同的对象，然后执行不同的操作，也就是针对访问的对象不同，执行不同的操作。访
         * 问者模式还有一个用途，就是充当拦截器（Interceptor）角色，这个我们在后边来讲。
         * 访问者模式有哪些优点呢？首先是符合单一职责原则，具体元素角色也就是 Employee 这个类的两个子
         * 类负责数据的加载，而 Visitor 类则负责报表的展现，两个不同的职责非常明确的分离开来，各自演绎而
         * 变化；其次，由于职责分开，继续增加对数据的操作是非常快捷的，例如现在要增加一个给最大老板的一
         * 份报表，这份报表格式又有所不同，容易处理吧，直接在 Visitor 中增加一个方法，传递过来数据后进行
         * 整理打印；最后，数据汇总，就以刚刚我们说的 Employee 的例子，如果我现在要统计所有员工的工资之和，
         * 怎么计算？把所有人的工资 for 循环加一遍？是个办法，那我再提个问题，员工工资*1.2，部门经理*1.4，
         * 总经理*1.8，然后把这些工资加起来，你怎么处理？1.2，1.4，1.8 是什么？我 K，你没看到领导不论什么
         * 时候都比你拿的多，工资奖金就不说了，就是过节发个慰问劵也比你多，就是这个系数在作祟。我们继续
         * 说你先怎么统计？使用 for 循环，然后使用 instanceof 来判断是员工还是经理？可以解决，但不是个好办
         * 法，好办法是通过访问者模式来实现，把数据扔给访问者，由访问者来进行统计计算。
         * 访问者模式的缺点也很明显，访问者要访问一个类就必然要求这个类公布一些方法，也就是说访问者
         * 关注了其他类的内部细节，这是迪米特法则所不建议的；还有一个缺点就是，具体角色的增加删除修改都
         * 是比较苦难的，就上面那个例子，你想想，你要是想增加一个成员变量，比如年龄 age，Visitor 就需要修
         * 改，如果 Visitor 是一个还好说，多个呢？业务逻辑再复杂点呢？访问者模式是有缺点的，是事物都有缺
         * 点，但是这仍然掩盖不了它的光芒，访问者模式结合其他模式比如模版方法模式、状态模式、解释器模式、
         * 代理模式等就会非常强大，这个我们放在模式混编中来讲解。
         * 访问者模式是会经常用到的模式，虽然你不注意，有可能你起的名字也不是什么 Visitor，但是这个是
         * 非常容易使用到的，在这里我提出三个扩展的功能共大家参考
         */

    }
}
