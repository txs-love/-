package example.DesignPrinciples.InterfaceSegregationPrinciple;


import org.jetbrains.annotations.NotNull;

/**
 * @author 汤修帅 on 10:24.
 */
public class SegregationDemo01 {
    public static void main(String[] args) {
// 类A实现 1 2 3 接口。      类B实现 1 4 5 接口   分成三个接口   一个为 1 接口   一个为 2 3 接口   一个为 4 5 接口
    }
}
//接口定义
interface Interface1{
    void operator1();
    void operator2();
    void operator3();
    void operator4();
    void operator5();
}
class B implements Interface1{

    @Override
    public void operator1() {
        System.out.println("B实现了operator1");
    }

    @Override
    public void operator2() {
        System.out.println("B实现了operator2");
    }

    @Override
    public void operator3() {
        System.out.println("B实现了operator3");
    }

    @Override
    public void operator4() {
        System.out.println("B实现了operator4");
    }

    @Override
    public void operator5() {
        System.out.println("B实现了operator5");
    }
}
class D implements Interface1{
    @Override
    public void operator1(){
        System.out.println("D实现了operator1");
    }

    @Override
    public void operator2(){
        System.out.println("D实现了operator2");
    }

    @Override
    public void operator3(){
        System.out.println("D实现了operator3");
    }

    @Override
    public void operator4() {
        System.out.println("D实现了operator4");
    }

    @Override
    public void operator5(){
        System.out.println("D实现了operator5");
    }
}
class A{  //A类通过接口Interface1依赖(使用) B类,但只用到1,2,3方法
    public void depend1(@NotNull Interface1 interface1){
     interface1.operator1();
    }
    public void depend2(@NotNull Interface1 interface1){
        interface1.operator2();
    }
    public void depend3(@NotNull Interface1 interface1){
        interface1.operator3();
    }
}

class C{ //C类通过接口Interface1依赖(使用) D类,但只用到1,4,5方法
    public void depend1(@NotNull Interface1 interface2){
        interface2.operator1();
    }

    public void depend4(@NotNull Interface1 interface2){
        interface2.operator4();
    }

    public void depend5(@NotNull Interface1 interface2){
        interface2.operator5();
    }
}