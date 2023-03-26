package example.Design.AbstractFactoryPattern抽象工厂模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 14:06
 */

import java.util.HashMap;

/**
 * 编写一个抽象类，根据enum创建一个人类出来
 */
public  abstract class AbstractHumanFactory implements HumanFactory{
    private Human human;
    /*
     * 给定一个性别人种，创建一个人类出来 专业术语是产生产品等级
     */
    private HashMap<String,Human> hashMap = new HashMap<>();

    /**
     *  if (humanHashMap.containsKey(c.getSimpleName())){
     *                 human = humanHashMap.get(c.getSimpleName());
     *             }else {
     *                 human = (Human) Class.forName(c.getName()).newInstance(); //产生一个人种
     *                 humanHashMap.put(c.getSimpleName(),human);
     *  }
     * @param humanEnum
     * @return
     */
    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;

        //如果传递进来不是一个Enum中具体的一个Element的话，则不处理
        if (!humanEnum.getValue().equals("")) {
            try {
                //直接产生一个实例
                human = (Human)
                        Class.forName(humanEnum.getValue()).newInstance();
            } catch (Exception e) {
                //因为使用了enum，这个种异常情况不会产生了，除非你的enum有问题；
                e.printStackTrace();
            }
        }
        return human;
    }
    /**
     * 看到没，这就是引入 enum 的好处，createHuman(HumanEnum humanEnum)这个方法定义了输入参数必须
     * 是 HumanEnum 类型，然后直接使用 humanEnum.getValue()方法就能获得具体传递进来的值，这个不多说了，
     * 大家自己看程序领会，没多大难度，这个抽象类的目的就是减少下边实现类的代码量，我们看实现类
     */
}
