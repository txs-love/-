package example.Design.CompositePattern组合模式;

import java.util.ArrayList;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 14:22
 */
@SuppressWarnings("all")
/**
 * 类图上有两个接口，ICorp 是公司所有人员的信息的接口类，不管你是经理还是员工，你都有名字，职
 * 位，薪水，这个定义成一个接口没有错，
 * 两个根结点和叶子结点可以集合成一个结点 + 三个信息集起来的可以合并成一个接口 比如说职位+姓名+工资
 */
public class Client {
    /**
     * 组合模式的优点有哪些呢？第一个优点只要是树形结构，就要考虑使用组合模式，这个一定记住，只
     * 要是要体现局部和整体的关系的时候，而且这种关系还可能比较深，考虑一下组合模式吧。组合模式有一
     * 个非常明显的缺点，看到我们在 Client.java 中的的定义了树叶和树枝使用时的定义了吗？如下：
     * 发现什么问题了吗？直接使用了实现类！这个在面向接口编程上是很不恰当的，这个在使用的时候要考虑清楚。
     * 组合模式在项目中到处都有，比如现在的页面结构一般都是上下结构，
     * 上面放系统的 Logo，下边分为两部分：左边是导航菜单，右边是展示区，左边的导航菜单一般都是树形的结构，比较清晰
     * 两个部分:   logo + 导航菜单 + 展示区;
     */
    //首先产生了一个根节点
    IRoot ceo = new Root("王大麻子","总经理",100000);

    //产生三个部门经理，也就是树枝节点
    IBranch developDep = new Branch("刘大瘸子","研发部门经理",10000);
    IBranch salesDep = new Branch("马二拐子","销售部门经理",20000);
    IBranch financeDep = new Branch("赵三驼子","财务部经理",30000);

    //再把三个小组长产生出来
    IBranch firstDevGroup = new Branch("杨三乜斜","开发一组组长",5000);

    IBranch secondDevGroup = new Branch("吴大棒槌","开发二组组长",6000);

    //剩下的及时我们这些小兵了,就是路人甲，路人乙
    ILeaf a = new Leaf("a","开发人员",2000);
    ILeaf b = new Leaf("b","开发人员",2000);
    ILeaf c = new Leaf("c","开发人员",2000);
    ILeaf d = new Leaf("d","开发人员",2000);
    ILeaf e = new Leaf("e","开发人员",2000);
    ILeaf f = new Leaf("f","开发人员",2000);
    ILeaf g = new Leaf("g","开发人员",2000);
    ILeaf h = new Leaf("h","销售人员",5000);
    ILeaf i = new Leaf("i","销售人员",4000);
    ILeaf j = new Leaf("j","财务人员",5000);
    ILeaf k = new Leaf("k","CEO秘书",8000);
    ILeaf zhengLaoLiu = new Leaf("郑老六","研发部副总",20000);

    //该产生的人都产生出来了，然后我们怎么组装这棵树
    //首先是定义总经理下有三个部门经理

    //该产生的人都产生出来了，然后我们怎么组装这棵树
    //首先是定义总经理下有三个部门经理


    //打印出来整个树形
      // getAllSubordinateInfo(ArrayList ceo);
    //遍历所有的树枝节点，打印出信息
    private static void getAllSubordinateInfo(ArrayList subordinateList){
        int length = subordinateList.size();
        for(int m=0;m<length;m++){ //定义一个ArrayList长度，不要在for循环中每次计算
            Object s = subordinateList.get(m);
            if(s instanceof Leaf){ //是个叶子节点，也就是员工
                ILeaf employee = (ILeaf)s;
                System.out.println(((Leaf) s).getInfo());
            }else{
                IBranch branch = (IBranch)s;
                System.out.println(branch.getInfo());
                //再递归调用
                getAllSubordinateInfo(branch.getSubordinateInfo());
            }
        }
    }
}
