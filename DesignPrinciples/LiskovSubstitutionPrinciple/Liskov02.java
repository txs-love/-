package example.DesignPrinciples.LiskovSubstitutionPrinciple;

/**
 * @author 汤修帅 on 7:53.
 */

/**
 *  里氏替换原则是针对继承而言的，如果继承是为了实现代码重用，也就是为了共享方法，那么共享的父类方法就应该保持不变，不能被子类重新定义。
 *  子类只能通过新添加方法来扩展功能，父类和子类都可以实例化，而子类继承的方法和父类是一样的，父类调用方法的地方，子类也可以调用同一个继承得来的，
 *  逻辑和父类一致的方法，这时用子类对象将父类对象替换掉时，当然逻辑一致，相安无事。
 *
 *  如果继承的目的是为了多态，而多态的前提就是子类覆盖并重新定义父类的方法，为了符合LSP，我们应该将父类定义为抽象类，并定义抽象方法，
 *  让子类重新定义这些方法，当父类是抽象类时，父类就是不能实例化，所以也不存在可实例化的父类对象在程序里。也就不存在子类替换父类实例（根本不存在父类实例了）
 *  时逻辑不一致的可能。
 */
public class Liskov02 {
    public void main(String[] args) {
       {
            A a= new A();
           System.out.println("11-3="+a.func1(11,3));
            System.out.println("1-8="+a.func1(1,8));

            System.out.println("--------------------");

            B b= new B();
            //因为B类不在继承A类,因此调用者,不会是func1的减法
            System.out.println("11-3="+b.func1(11,3));
            System.out.println("1-8="+b.func1(1,8));  //继承了类的方法
            System.out.println("11+3+9="+b.func2(11,3));

            //使用组合可以使用A的组合方法
           System.out.println("11-3="+b.func3(11,3));

        }
    }

    static class Base{      //让A和B都继承Base类

    }
    static class A extends Base{
        //返回两个数的差
        public int func1(int number1, int number2){
            return number1-number2;
        }
    }

    static class B extends Base {      //继承可能导致错乱;
        //如果B需要使用A类当中的方法,使用组合关系
        private final A a= new A();
        //如果仍然想用A当中的方法
        public int func3(int a,int b){
            return this.func1(a,b);
        }

        public int func1(int a, int b) {
            return a+b;
      }
        public int func2(int a,int b){
            return func1(a,b)+9;
      }
    }
}
