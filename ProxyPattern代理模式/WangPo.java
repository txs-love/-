package example.Design.ProxyPattern代理模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 9:26
 */
public class WangPo implements KindWomen{
    private KindWomen kindWomen;
    public WangPo(){ //默认的话，是潘金莲的代理
        this.kindWomen = new PanJinLian();
    }

    //她可以是KindWomen的任何一个女人的代理，只要你是这一类型
    public WangPo(KindWomen kindWomen){
        this.kindWomen = kindWomen;
    }


    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();    //自己干不懂，交给代理
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();          //自己干不动，交给代理;
    }
}
