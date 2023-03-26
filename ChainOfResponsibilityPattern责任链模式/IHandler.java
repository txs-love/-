package example.Design.ChainOfResponsibilityPattern责任链模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 16:40
 * 父系社会，那就是男性有至高权利，handler控制权
 */
public interface IHandler {

    //一个女性（女儿，妻子或者是母亲）要求逛街，你要处理这个请求
    public void HandleMessage(IWomen women);

}