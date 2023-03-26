package example.Design.ProxyPattern代理模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 9:35
 */
public class JiaSi implements KindWomen{
    @Override
    public void makeEyesWithMan() {
        System.out.println("  家室跑眼睛; ");
    }
    @Override
    public void happyWithMan() {
        System.out.println("家室正常在happy当中  ");
    }
}
