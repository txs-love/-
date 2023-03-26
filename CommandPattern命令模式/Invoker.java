package example.Design.CommandPattern命令模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 9:18
 */
public class Invoker {
    //接头人,项目经理
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void action(){
        this.command.execute();   //重写字类方法;
    }
}
