package example.Design.BridgePattern桥梁模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 8:40
 */
public class ClothesCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("服装厂公司生产    ");
    }

    @Override
    protected void sell() {
        System.out.println("服装厂公司销售      ");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装厂小赚money  ");
    }
}
