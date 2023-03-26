package example.Design.IteratorPattern迭代器模式;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.ArrayList;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 13:44
 */
public class Project implements IProject {       //实现了接口;
    //项目名称
    private String name = "";

    //项目成员数量
    private int num = 0;

    //项目费用
    private int cost = 0;

    //定义一个项目列表;
    private ArrayList<IProject> arrayList =new ArrayList<>();

    public Project(String name, int num,int cost){
        this.cost = cost;
        this.name = name;
        this.num = num;
    }
    public Project(){

    }


    @Override
    public void add(String name, int num, int cost) {
        arrayList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";

        //获得项目的名称
        info = info+ "项目名称是：" + this.name;
        //获得项目人数
        info = info + "\t项目人数: "+ this.num;
        //项目费用
        info = info+ "\t 项目费用："+ this.cost;

        return info;
    }
    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.arrayList);
    }
}
