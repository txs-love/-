package example.Design.CommandPattern命令模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 9:12
 */
public abstract class Command {
    protected PageGroup pg = new PageGroup();  //美工组
    protected RequirementGroup rg = new RequirementGroup();   //需求组
    protected CodeGroup cg = new CodeGroup();       //代码组;

    //只要一个方法，你要我做什么事情
    public abstract void execute();
}
