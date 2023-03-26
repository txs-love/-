package example.Design.ChainOfResponsibilityPattern责任链模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 16:41
 */
public class Father extends Handler implements IHandler  {
    public Father() {
        super(1);
    }//implements IHandler{



    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请求是: "+women.getRequest());
        System.out.println("老爸的请求同意::::  ");
    }

    @Override
    public void response(IWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
