package example.Design.IteratorPattern迭代器模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 13:43
 */
public interface IProject {
    //增加项目
    public void add(String name,int num,int cost);

    //从老板这里看到的就是项目信息
    public String getProjectInfo();

    //获得一个可以被遍历的对象
    public IProjectIterator iterator();
}
