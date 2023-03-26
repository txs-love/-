package example.DesignPrinciples.DependenceInversionPrinciple;//package 设计模式原则.依赖倒转原则;

/**
 * @author 汤修帅 on 12:44.
 */
public class DependInversionDemo02 {
    public static void main(String[] args) {
        //客户端无需改变
        Person1 person=new Person1();
        person.receive(new Emila1());
        person.receive(new WeiXi());

    }
}
interface  IReceive{
    public String getInfo();
}

class Emila1 implements IReceive{

    @Override
    public String getInfo() {
        return "电子邮件: Holle Word";
    }
}

class WeiXi implements IReceive{

    @Override
    public String getInfo() {
        return "微信: 女朋友";
    }
}


//完成Person接收消息的功能
class Person1{
    public void receive(IReceive iReceive){
        System.out.println(iReceive.getInfo());
    }
}