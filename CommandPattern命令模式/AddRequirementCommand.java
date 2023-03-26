package example.Design.CommandPattern命令模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 9:15
 */
public class AddRequirementCommand extends Command{
    @Override
    public void execute() {
        super.rg.add();      //add
        super.rg.delete();   //delete
        super.rg.change();   //change
        super.rg.find();     //find;
    }
}
