package example.DesignPrinciples.DependenceInversionPrinciple;

/**
 * @author 汤修帅 on 12:33.
 */
public class DependInversionDemo01 {
    public static void main(String[] args) {
        Person person=new Person();
        Emila emila = new Emila();

    }
}
//方式一容易实现
//如果我们获取的对象是微信或者短信, 同时需要用Person,那么也需要增加相应的方法
//解决思路:引入一个抽象类接口 IReceive 表示接收人
//因为Email .WeiXi等等属于接口的范围。他们各自实现IReceive 接口就OK 符号依赖倒转原则
class Emila{
    public String getInfo(){
        return "电子邮件消息: Holle Word";
    }
}

//完成Person接收消息的功能
class Person{
    public void receive(Emila emila){
        System.out.println(emila.getInfo());
    }
}