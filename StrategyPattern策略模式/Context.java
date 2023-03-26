package example.Design.StrategyPattern策略模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 9:05
 */
public class Context {
    private IStrategy iStrategy;
    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }
    public void openator(){
        this.iStrategy.openator();    //使用计墨;
    }
}
