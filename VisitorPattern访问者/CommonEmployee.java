package example.Design.VisitorPattern访问者;



/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 17:08
 * 者模式中，当您需要添加新操作时，只需创建一个新的访问者即可，并将其传递给需要执行该操作的元素。这样就避免了更改元素类以支持新操作所带来的风险。
 * 总之，访问者模式是一种非常有用的设计模式，可帮助您使代码更加灵活和可维护
 */
public class CommonEmployee extends Employee {        //小员工;

    //工作内容，这个非常重要，以后的职业规划就是靠这个了
    private String job;
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    protected String getOtherInfo(){
        return "小员工工作: "+ this.job + "\t";
    }

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }


    @Override
    protected IVisitor getOtherInfo(IVisitor visitor) {
        return visitor;
    }
}