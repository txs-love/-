package example.Design.ChainOfResponsibilityPattern责任链模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 16:42
 */
public class Husband extends Handler implements IHandler{
    public Husband() {
        super(2);
    }

    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("老婆的请求是: "+women);
        System.out.println("老公说同意::: ");
    }

    @Override
    public void response(IWomen women) {
        System.out.println("--------老婆向老公请示-------");
        System.out.println(women.getRequest());
        System.out.println("老公的答复是:同意\n");
    }
}
