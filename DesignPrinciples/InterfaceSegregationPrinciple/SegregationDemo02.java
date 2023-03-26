package example.DesignPrinciples.InterfaceSegregationPrinciple;


import org.jetbrains.annotations.NotNull;

/**
 * @author 汤修帅 on 10:33.
 * 客户端不应该依赖他的接口
 * 类的接口应该在最小依赖中间;
 */
public class SegregationDemo02 {
    public static void main(String[] args) {
        A1 a1=new A1();   //A1类通过接口去依赖B
        a1.depend1(new B1());
        a1.depend2(new B1());
        a1.depend3(new B1());


        C1 c1=new C1();
        c1.depend1(new D1());
        c1.depend4(new D1());
        c1.depend5(new D1());
    }
}
interface Interface01{
    void operator1();
}

interface Interface02{
    void operator2();
    void operator3();
}

interface Interface03{
    void operator4();
    void operator5();
}
class B1 implements Interface01,Interface02{ //A1类通过接口Interface1依赖(使用) B类,但只用到1,2,3方法

    @Override
    public void operator1() {

    }

    @Override
    public void operator2() {

    }

    @Override
    public void operator3() {

    }
}

class D1 implements Interface01,Interface03{

    @Override
    public void operator1() {

    }

    @Override
    public void operator4() {

    }

    @Override
    public void operator5() {

    }
}
class A1{
    public void depend1(@NotNull Interface01 interface01){
        interface01.operator1();
    }

    public void depend2(@NotNull Interface02 interface01){
       interface01.operator2();
    }

    public void depend3(@NotNull Interface02 interface01){
        interface01.operator3();
    }
}

class C1{
    public void depend1(Interface01 interface01){
        interface01.operator1();
    }

    public void depend4(Interface03 interface01){
        interface01.operator4();
    }
    public void depend5(Interface03 interface01){
        interface01.operator5();
    }
}