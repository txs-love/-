package example.Design.FactoryMethodPattern工厂模式;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 12:57
 */
public class HumanFactory {
    //定一个烤箱，泥巴塞进去，人就出来，这个太先进了
    private static HashMap<String,Human> humanHashMap = new HashMap<>();
    public static Human createHuman(Class c){
        /**
         * 工厂方法模式还有一个非常重要的应用，就是延迟始化(Lazy initialization)，什么是延迟始化呢？
         * 一个对象初始化完毕后就不释放，等到再次用到得就不用再次初始化了，直接从内存过中拿到就可以了，
         * 怎么实现呢
         */
        Human human=null; //定义一个类型的人类

        try {
            /**
             * 如果查找到hashMap当中有就不需要再去查询元素;
             */
            if (humanHashMap.containsKey(c.getSimpleName())){
                human = humanHashMap.get(c.getSimpleName());
            }else {
                human = (Human) Class.forName(c.getName()).newInstance(); //产生一个人种
                humanHashMap.put(c.getSimpleName(),human);
            }
        } catch (InstantiationException e) {//你要是不说个人种颜色的话，没法烤，要白的黑，你说话了才好烤

            System.out.println("必须指定人种的颜色");
        } catch (IllegalAccessException e) { //定义的人种有问题，那就烤不出来了，这是...
            System.out.println("人种定义错误！");
        } catch (ClassNotFoundException e) { //你随便说个人种，我到哪里给你制造去？！
            System.out.println("混蛋，你指定的人种找不到！");
        }
        return human;
    }

    //女娲生气了，把一团泥巴塞到八卦炉，哎产生啥人种就啥人种
    public static Human createHuman1(){
        Human human=null; //定义一个类型的人类

        //首先是获得有多少个实现类，多少个人种
        List<Class> concreteHumanList =
                ClassUtils.getAllClassByInterface(Human.class); //定义了多少人种
        //八卦炉自己开始想烧出什么人就什么人
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());

        human = createHuman(concreteHumanList.get(rand));
        return human;
    }
}
