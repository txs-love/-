package example.Design.CommandPattern命令模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 9:08
 */
public class Client {
    /**
     * Command 抽象类：客户发给我们的命令，定义三个工作组的成员变量，供子类使用；定义一个抽象方法
     * execute，由子类来实现；
     * Invoker 实现类:项目接头人，setComand 接受客户发给我我们的命令，action 方法是执行客户的命令
     * （方法名写成是 action 是与 command 的 execute 区分开，避免混淆）
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("客户要求增加一项需求");
        Group group = new RequirementGroup();     //客户要求增加一项需求;
        group.add();
        group.change();
        System.out.println("-------");
        System.out.println("客户要求美化一个页面 ");
        Group group1 = new PageGroup();
        group1.change();
        group1.find();

        //下达名
        Command command = new AddRequirementCommand();  //add一个需求
        Invoker invoker = new Invoker();                //add一个接头人;
        invoker.setCommand(command);                    //接头人知道这个命令;
        invoker.action();                               //接头人执行命令;
    }
    /**
     * Receiver 角色：这个就是干活的角色，命令传递到这里是应该被执行的，具体到上面我们的例子中就是
   Group 的三个实现类；
     * Command 角色：就是命令，需要我执行的所有命令都这里声明；
     * Invoker 角色：调用者，接收到命令，并执行命令，例子中我这里项目经理就是这个角色；
     */
}
