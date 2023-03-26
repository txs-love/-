package example.Design.VisitorPattern访问者;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 17:22
 */
public interface IVisitor { //定义一个访问者;
    public void visit(CommonEmployee employee);
    public void visit(Manager manager);
}
