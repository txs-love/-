package example.DesignPrinciples.LiskovSubstitutionPrinciple;

/**
 * @author 汤修帅 on 7:41.
 */
public class Liskov01 {
    public static void main(String[] args) {
        A a= new A();
        System.out.println("111-3="+a.func1(111,3));
        System.out.println("1-8="+a.func1(1,8));

        System.out.println("--------------------");

        B b=new B();
        System.out.println("11-3="+b.func1(11,3));
        System.out.println("1-8="+b.func1(1,8));  //继承了类的方法
        System.out.println("11+3+9="+b.func2(11,3));

    }
}
class A{
    //返回两个数的差
    public int func1(int number1, int number2){
        return number1-number2;
    }
}

class B extends A {
    //重写了A类当中的方法,可能是无意识的

    @Override
    public int func1(int number1, int number2) {
        return number1+number2;          //这里可能造成错误;
    }

    public int func2(int a, int b){
        return func1(a,b)+9;
    }
}
