package example.Design.ObserverPattern观察者模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 15:07
 */

/**
 * 监控韩非子的一举一动;
 */
public class Watch extends Thread {
    private HanFeiZi hanFeiZi;    //韩非子
    private LiSi liSi;     //李斯;
    private String type;   //活动类型;
    public Watch(HanFeiZi hanFeiZi,LiSi liSi,String type){
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
        this.type = type;
    }
    @Override
    public void run() {
        while (true){
            if (this.type.equals("haveBreakfast")){    //监控其是否在吃早餐;
                if (this.hanFeiZi.isHaveBreakfast()){
                    this.liSi.update(" 报告皇帝  韩非子在吃早餐; ");
                    //重置状态，继续监控
                    hanFeiZi.setHaveBreakfast(false);
                }
            }
            if (this.type.equals("haveFun")){
                if (this.hanFeiZi.isHaveFun()){
                    this.liSi.update("报告皇帝  韩非子在玩游戏; ");
                    //重新放置线程状态
                    hanFeiZi.setHaveFun(false);
                }
            }
        }
    }
}
