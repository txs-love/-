package example.Design.IteratorPattern迭代器模式;

import java.util.ArrayList;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 14:01
 */
public class ProjectIterator implements IProjectIterator{
    //所有的项目都放在这里ArrayList中
    private ArrayList<IProject> projectList = new ArrayList<IProject>();

    private int currentItem = 0;

    //构造函数传入projectList
    public ProjectIterator(ArrayList<IProject> projectList){
        this.projectList = projectList;
    }
    @Override
    public boolean hasNext() {
        //定义一个返回值
        boolean b = true;
        if(this.currentItem>=projectList.size() ||
                this.projectList.get(this.currentItem) == null){
            b =false;
        }
        return b;
    }
    @Override
    public IProject next() {
        return (IProject)this.projectList.get(this.currentItem++);
    }

    //删除一个对象
    public void remove() {
        //暂时没有使用到
    }
}
