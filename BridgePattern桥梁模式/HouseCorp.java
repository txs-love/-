package example.Design.BridgePattern桥梁模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 8:36
 */
public  class HouseCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("房地产公司生产 ");
    }

    @Override
    public void sell() {
        System.out.println("房地产公司销售;");
    }

    @Override
    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司大赚+++money   ");
    }
}
