package example.Design.ProxyPattern代理模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 9:25
 */
public class PanJinLian implements KindWomen{
    @Override
    public void makeEyesWithMan() {
        System.out.println("潘金莲和man干那个");
    }
    @Override
    public void happyWithMan() {
        System.out.println("抛媚眼。。。。。");
    }
}
