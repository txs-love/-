package example.Design.ObserverPattern观察者模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 15:00
 */
public class HanFeiZi implements IHanFeiZi{
    /**
     把李斯声明出来
     */

    private ILiSI liSi =new LiSi();
    //韩非子是否在吃饭，作为监控的判断标准
    private boolean isHaveBreakfast = false;
    //韩非子是否在娱乐
    private boolean isHaveFun = false;

    //韩非子要吃饭了
    @Override
    public void haveBreakfast(){
        System.out.println("韩非子:开始吃饭了...");
        liSi.update("李斯报告皇帝,韩非子:开始吃饭了");
        this.isHaveBreakfast =true;
    }

    //韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多
    @Override
    public void haveFun(){
        System.out.println("韩非子:开始娱乐了...");
        liSi.update("李斯报告皇帝,韩非子:开始打游戏了");
        this.isHaveFun = true;
    }

    //以下是bean的基本方法，getter/setter，不多说
    public boolean isHaveBreakfast() {
        return isHaveBreakfast;
    }
    public void setHaveBreakfast(boolean isHaveBreakfast) {
        this.isHaveBreakfast = isHaveBreakfast;
    }
    public boolean isHaveFun() {
        return isHaveFun;
    }
    public void setHaveFun(boolean isHaveFun) {
        this.isHaveFun = isHaveFun;
    }


}
