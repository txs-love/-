package example.Design.MediatorPattern中介者模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 18:59
 */
public class Purchase1 extends AbstractColleague{

    public Purchase1(AbstractMediator _mediator){
        super(_mediator);
    }
    //采购IBM型号的电脑
    public void buyIBMcomputer(int number){
        super.mediator.execute("purchase.buy", number);
    }

    //不在采购IBM电脑
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
