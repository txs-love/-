package example.Design.StrategyPattern策略模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 9:04
 */
public class BlockEnemy implements IStrategy{
    @Override
    public void openator() {
        System.out.println("thread: 孙芙蓉来兵;");
    }
}
