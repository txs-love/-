package example.Design.StrategyPattern策略模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 9:02
 */
public class BackDoor implements IStrategy{
    @Override
    public void openator() {
        System.out.println("One + 需要第一个妙计:::::");
    }
}
