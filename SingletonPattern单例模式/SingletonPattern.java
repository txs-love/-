package example.Design.SingletonPattern单例模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 9:56
 */
@SuppressWarnings("all")
public class SingletonPattern {
    private static SingletonPattern singleton = null;

    SingletonPattern(){ }
    private static SingletonPattern getInstance1(){
        /**
         * 我们来看黄色的那一部分，假如现在有两个线程 A 和线程 B，线程 A 执行到 this.singletonPattern  = new SingletonPattern()，正在申请内存分配，
         * 可能需要 0.001 微秒，就在这 0.001 微秒之内，线程 B 执行到 if(this.singletonPattern == null)，你说这个时候这个判断条件是 true 还是 false？是 true，
         * 那然后呢？线程 B 也往下走，于是乎就在内存中就有两个 SingletonPattern 的实例了，看看是不是出问题了？
         */
        if (singleton==null){          //这里可能两个线程进来，一个没有获取到导致冲突;
            singleton = new SingletonPattern();
        }
        return singleton;
    }

    /**
     * 下面是解决办法
     */
    private static final SingletonPattern singletonPatten = new SingletonPattern();

    /**
    public SingletonPattern(){}
*/

    public synchronized static SingletonPattern getInstance2(){
        return new SingletonPattern();       //利用synchronized来生成一个单例模式;
    }
    public void singletonInfo(){
        System.out.println(" 我是皇帝xxx ");
    }
}
