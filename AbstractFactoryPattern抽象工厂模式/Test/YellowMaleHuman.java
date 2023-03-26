package example.Design.AbstractFactoryPattern抽象工厂模式.Test;

import example.Design.AbstractFactoryPattern抽象工厂模式.AbstractYellowHuman;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 13:55
 */
public class YellowMaleHuman extends AbstractYellowHuman {
    public void sex() {
        System.out.println("该黄种人的性别为男....");
    }
}
