package example.Design.AbstractFactoryPattern抽象工厂模式.Test;

import example.Design.AbstractFactoryPattern抽象工厂模式.AbstractBlackHuman;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 13:56
 */
public class BlackFemaleHuman extends AbstractBlackHuman {
    public void sex() {       //子类当中添加其方法;
        System.out.println("该黑种人的性别为女...");
    }
}
