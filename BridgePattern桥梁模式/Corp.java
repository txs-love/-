package example.Design.BridgePattern桥梁模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 8:33
 */

/**
 * 销售一个房地产公司 + 一个服装厂公司;
 */
public abstract class Corp {     //定义一个公司的抽象类;
    //生产方法
    protected abstract void produce();
    //销售方法
    protected abstract void sell();
    //赚钱方法;
    //公司是干什么的？赚钱的呀，不赚钱傻子才干
    public void makeMoney(){

        //每个公司都是一样，先生产
        this.produce();

        //然后销售
        this.sell();
    }
}
