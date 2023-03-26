package example.DesignPrinciples.DependenceInversionPrinciple;//package 设计模式原则.依赖倒转原则;

/**
 * @author 汤修帅 on 13:02.
 */
public class DependInversionDemo03 {
    public static void main(String[] args) {

    }
}
//方式一  通过接口实现依赖
//开关的接口
interface ITV{
     default void play(){
    }
}
interface IOpenAndClose{
     void open(ITV tv);
}
class OPenAndClose implements IOpenAndClose{

    @Override
    public void open(ITV tv) {
     tv.play();
    }
}



//第二种  通过构造方法
interface IOpenAndClose1{
    void open();
}
interface ITV1{
    default void play(){
    }
}
class OPenAndClose1 implements IOpenAndClose1{
    public ITV1 itv1;
    public OPenAndClose1(ITV1 itv1){   //构造器
        this.itv1=itv1;
    }
    @Override
    public void open() {
        this.itv1.play();
    }
}


//第三种  通过setter
interface IOpenAndClose2{
    void open();
    public void setTv(ITV2 itv2);
}
interface ITV2{
    default void play(){
    }
}
class OPenAndClose2 implements IOpenAndClose1{

    private ITV2 itv2;

    public void  setItv1(ITV2 itv2){   //构造器
        this.itv2=itv2;
    }
    @Override
    public void open() {
        this.itv2.play();
    }
}
