package example.Design.AbstractFactoryPattern抽象工厂模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 14:13
 */

/**
 * 创建女性工厂;
 */
public class FemaleHumanfactory extends AbstractHumanFactory{
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }
}
