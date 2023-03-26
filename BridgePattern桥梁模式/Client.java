package example.Design.BridgePattern桥梁模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 8:42
 * 或者说业务抽象角色的部分实现是由业务实现角色完成的，很简单，别想那么复杂了。
 * 桥梁模式的优点就是类间解耦，我们上面已经提到，两个角色都可以自己的扩展下去，不会相互影响，这个也符合 OCP 原则。
 *
 * 降低耦合度;
 * 对类的继承有什么看法吗？继承的优点有很多，可以把公共的方法
 * 或属性抽取，父类封装共性，子类实现特性，这是继承的基本功能，缺点有没有？有，强关联关系，父类有个方
 * 法，你子类也必须有这个方法，是不可选择的，那这会带来扩展性的问题，我举个简单的例子来说明这个问题：
 * Father 类有一个方法 A，Son 继承了这个方法，然后 GrandSon 也继承了这个方法，问题是突然有一天 Son
 * 要重写父类的这个方法，他敢做吗？绝对不敢！GrandSon 可是要用从 Father 继承过来的方法 A，你修改了，
 * 那就要修改 Son 和 GrandSon 之间的关系，那这个风险就大了去。
 * 今天讲的这个桥梁模式就是这一问题的解决方法，桥梁模式描述了类间弱关联关系，还说上面的那个例子，
 * Fater 类完全可以把可能会变化的方法放出去，Son 子类要有这个方法很简答，桥梁搭过去，获得这个方法，
 * GrandSon 也一样，即使你 Son 子类不想使用这个方法了，也没关系，对 GrandSon 不产生影响，他不是从你
 * Son 中继承来的方法！
 * 继承不能说它不好，非常好，但是有缺点的，我们可以扬长避短，对于比较明确不发生变化的，则通过继承
 * 来完成，若不能确定是否会发生变化的，那就认为是会发生变化，则通过桥梁模式来解决，这才是一个完美的世
 * 界。
 */
public class Client {
    public static void main(String[] args) {
        HouseCorp house = new HouseCorp();
        System.out.println("房地产公司::");
        house.makeMoney();


        System.out.println("------");
        ClothesCorp clothes = new ClothesCorp();
        System.out.println("服装厂公司::");
        clothes.makeMoney();
        /**
         * 生产山寨产品，什么产品呢？就是市场上什么牌子的东西火爆我生产什么牌子的东西，甭管是打火机还是电脑，
         * 只要它火爆，我就生产，赚过了高峰期就换个产品，打一枪换一个牌子，不承担售后成本、也不担心销路问题，
         * 我只有正品的十分之一的价格，你买不买？哈哈，赚钱呀！
         */
        //  ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
        //  ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
    }
}
