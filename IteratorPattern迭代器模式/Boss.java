package example.Design.IteratorPattern迭代器模式;

import java.util.ArrayList;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 13:46
 */
public class Boss {
    public static void main(String[] args) {
        /**
         * 简化我们代码和设计的复杂度、耦合程度
    java.util.Iterable 接口只有一个方法：iterator()，也就说通过 iterator()这个方法去遍历集合类中的所有方法或属性
         */
        ArrayList<IProject> iProjectArrayList = new ArrayList<>();
        iProjectArrayList.add(new Project("txs",10,1000));
        iProjectArrayList.add(new Project("ald",9,313));
        iProjectArrayList.add(new Project("skd",310,3102));

        for (int i=4;i<104;i++){
            iProjectArrayList.add(new Project("第"+i+"个项目",i*2,i*302));
        }
        for (IProject project:iProjectArrayList){
            System.out.println(project.getProjectInfo());
        }


        //定义一个List，存放所有的项目对象
        Project project = new Project();

        //增加星球大战项目
        project.add("星球大战项目ddddd",10,100000);
        //增加扭转时空项目
        project.add("扭转时空项目",100,10000000);
        //增加超人改造项目
        project.add("超人改造项目",10000,1000000000);

        //这边100个项目
        for(int i=4;i<104;i++){
            project.add("第"+i+"个项目",i*5,i*1000000);
        }
        //遍历一下ArrayList，把所有的数据都取出
        IProjectIterator projectIterator = project.iterator();
        while(projectIterator.hasNext()){
            IProject p = (IProject)projectIterator.next();
            System.out.println(p.getProjectInfo());

        }
    }
}

