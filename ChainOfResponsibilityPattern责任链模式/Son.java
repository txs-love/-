package example.Design.ChainOfResponsibilityPattern责任链模式;

import javax.swing.*;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 16:44
 */
public class Son extends Handler implements IHandler{
    public Son() {
        super(3);
    }

    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("妈妈的请求是: "+ women.getRequest());
        System.out.println("儿子同意;   ");
    }

    @Override
    public void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是:同意\n");
    }
}
