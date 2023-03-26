package example.Design.CompositePattern组合模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 14:18
 */
@SuppressWarnings("all")
public class Leaf implements ILeaf {//获取叶子结点的信息;

    //叶子叫什么名字
    private String name = "";
    //叶子的职位
    private String position = "";
    //叶子的薪水
    private int salary = 0;

    //通过构造函数传递信息
    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {  //最小的小兵只能获得自己的信息了
        String info = "";
        info = "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}

