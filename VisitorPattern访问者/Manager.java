package example.Design.VisitorPattern访问者;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 17:12
 */
public class Manager extends Employee{
    private String performance;   //管理者需要的是业绩

    public String getPerformance() {    //角色;
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
    protected String getOtherInfo() {
        return "管理者manager工作 :"+ this.performance+"\t" ;
    }
    public void accept(IVisitor visitor){
        visitor.visit(this);
    }

    @Override
    protected IVisitor getOtherInfo(IVisitor visitor) {
        return visitor;
    }
}
