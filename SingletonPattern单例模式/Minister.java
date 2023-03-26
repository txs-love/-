package example.Design.SingletonPattern单例模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 9:50
  看到没，大臣天天见到的都是同一个皇帝，不会产生错乱情况，反正都是一个皇帝，是好是坏就这一
  个，只要提到皇帝，大家都知道指的是谁，清晰，而又明确。问题是这是通常情况，还有个例的，如同一
  个时期同一个朝代有两个皇帝，怎么办？
  单例模式很简单，就是在构造函数中多了加一个构造函数，访问权限是 private 的就可以了，这个模
  式是简单，但是简单中透着风险，风险？什么风险？在一个 B/S 项目中，每个 HTTP Request 请求到 J2EE
  的容器上后都创建了一个线程,每个线程都要创建同一个单例对象,怎么办?,好,我们写一个通用的单例程
  序,然后分析一下:
*/
public class Minister {
    public static void main(String[] args) {
        Emperor emperor0 = Emperor.getInstance();   //如果有两个皇帝就会导致冲突;
        emperor0.emperorInfo();

        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo();

        Emperor emperor2 = Emperor.getInstance();
        emperor1.emperorInfo();
    }
}
