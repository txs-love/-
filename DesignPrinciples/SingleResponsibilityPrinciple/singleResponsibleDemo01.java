package example.DesignPrinciples.SingleResponsibilityPrinciple;

/**
 * @author 汤修帅 on 9:06.
 */
public class singleResponsibleDemo01 {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.run("汽车");
        vehicle.run("摩托车");
        vehicle.run("飞机");
        vehicle.run("船");
    }
}
//在此方法当中违背了单一职责原则,解决方法很简单,分解成不同类即可。
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上运行");
    }
}