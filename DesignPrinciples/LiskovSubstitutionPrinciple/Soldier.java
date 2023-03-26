package example.DesignPrinciples.LiskovSubstitutionPrinciple;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/20 20:30
 */
public class Soldier {
    public static void main(String[] args) {
        Demo soldier = new Demo();      //产生士兵;
        soldier.killEnemy(new HandGun());
        /**
         * 士兵不需要知道是哪个子类。我们在类中调用其他类是务必要使用父类或接口，如果不能使用
         * 父类或接口，则说明类的设计已经违背了 LSP 原则。
         */
        System.out.println();
        soldier.killEnemy(new G3());
        System.out.println();
        soldier.killEnemy(new ToyGun());;
        System.out.println();
      //  soldier.killEnemy((G3)new BuGun());    这里会报错,向下转型是不安全的;
    }
}

/**
 * 父类的一个方法返回值是一个类型 T，子类相同方法(重载或重写)返回值为 S，那么里氏替换法则就要求 S 必须小于等于 T，也就是说要么
 * S 和 T 是同一个类型，要么 S 是 T 的子类，为什么呢？分两种情况，如果是重写，方法的输入参数父类子类
 * 是相同的，两个方法的范围值 S 小于等于 T，这个是重写的要求，这个才是重中之重，子类重写父类的方法，
 * 天经地义；如果是重载，则要求方法的输入参数不相同，在里氏替换法则要求下就是子类的输入参数大于
 * 等于父类的输入参数
 */
abstract class AbstractGun {
    //枪用来干什么的？射击杀戮！
    public abstract void shoot();
}

class MachineGun extends AbstractGun{
    public void shoot(){
        System.out.println("机枪扫射...");
    }
}

class HandGun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("手枪开始散射：：：");
    }
}

class BuGun extends AbstractGun{

    @Override
    public void shoot() {
        System.out.println("步枪开始射击；；；");
    }
}

class G3 extends BuGun{

    public void seePeople(){
        System.out.println("    G3查看是否有敌人 ");      //子类在继承;
    }
    @Override
    public void shoot() {
        System.out.println("G3 射击  ");
    }
}

class ToyGun extends AbstractGun{      //这里可以调用两层;
    @Override
    public void shoot() {
         //什么都不实现，因为玩具枪不shoot人;
        throw new RuntimeException("玩具枪不能杀人:  ");
    }
}

class Demo {
    public void killEnemy(AbstractGun gun) {
        System.out.println("士兵开始杀人...");
        gun.shoot();
    }
}
