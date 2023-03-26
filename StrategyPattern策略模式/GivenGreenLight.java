package example.Design.StrategyPattern策略模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 9:03
 */
public class GivenGreenLight implements IStrategy{
    @Override
    public void openator() {
        System.out.println("Two + 开一个green灯;;;;;;");
    }
}
