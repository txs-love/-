package example.Design.MediatorPattern中介者模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 18:55
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    //构造函数
    public AbstractMediator(){
        purchase = new Purchase();
        sale = new Sale();
        stock = new Stock();
    }

    //中介者最重要的方法，叫做事件方法，处理多个对象之间的关系
    public abstract void execute(String str,Object...objects);
}
