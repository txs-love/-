package example.Design.AbstractFactoryPattern抽象工厂模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 13:52
 */
public enum HumanEnum {
    //把世界上所有人类型都定义出来
    YelloMaleHuman("example.Design.AbstractFactoryPattern抽象工厂模式.Test.YelloMaleHuman"),

    YelloFemaleHuman("example.Design.AbstractFactoryPattern抽象工厂模式.Test.YelloFemaleHuman"),

    WhiteFemaleHuman("example.Design.AbstractFactoryPattern抽象工厂模式.Test.WhiteFemaleHuman"),

    WhiteMaleHuman("example.Design.AbstractFactoryPattern抽象工厂模式.Test.WhiteMaleHuman"),

    BlackFemaleHuman("example.Design.AbstractFactoryPattern抽象工厂模式.Test.BlackFemaleHuman"),

    BlackMaleHuman("example.Design.AbstractFactoryPattern抽象工厂模式.Test.BlackMaleHuman");

    private String value = "";
    //定义构造函数，目的是Data(value)类型的相匹配
    private HumanEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    /**
     * /*
     *  * java enum类型尽量简单使用，尽量不要使用多态、继承等方法
     *  * 毕竟用Clas完全可以代替enum
     *  */

}
