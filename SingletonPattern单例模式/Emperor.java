package example.Design.SingletonPattern单例模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 9:45
 */
@SuppressWarnings("all")
public class Emperor {     //定义一个皇帝,并且只有一个皇帝;
    private static Emperor emperor = null;    //定义一个皇帝;

    Emperor(){    //定义一个构造方法;

    }
    public static Emperor getInstance(){
        if (emperor==null){
            emperor = new Emperor();      //如果为空，创建一个新皇帝
        }
        return emperor;
    }

    public void emperorInfo(){
        System.out.println("  我是xxx皇帝上朝 ");
    }

}
