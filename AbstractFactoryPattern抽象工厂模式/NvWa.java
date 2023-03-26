package example.Design.AbstractFactoryPattern抽象工厂模式;

import example.Design.AbstractFactoryPattern抽象工厂模式.Test.YellowFemaleHuman;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 14:24
 */
public class NvWa {
    public static void main(String[] args) {
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory =new  MaleHumanFactory();
        //第一条生产线，女性生产线
        HumanFactory FemaleHumanfactory = new FemaleHumanfactory();

        Human YellowHuman = maleHumanFactory.createYellowHuman();    //生产一个黄色男的
        Human YellowFemale = FemaleHumanfactory.createYellowHuman(); //生产一个黄色女人

        YellowFemale.cry();
        YellowHuman.sex();
        YellowHuman.talk();


    }
}
