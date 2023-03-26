package example.Design.AbstractFactoryPattern抽象工厂模式;

import static example.Design.AbstractFactoryPattern抽象工厂模式.HumanEnum.YelloMaleHuman;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 14:10
 */

/**
 * 创建男性工厂
 */
public class MaleHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }

    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
}
