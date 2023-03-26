package example.DesignPrinciples.SingleResponsibilityPrinciple;

/**
 * @author 汤修帅 on 9:06.
 */
public class singleResponsibleDemo03 {
    public static void main(String[] args) {
        Vehicle1 vehicle1=new Vehicle1();
        vehicle1.runRoad("摩托车");
        vehicle1.runRoad("汽车");
        vehicle1.runAir("飞机");
        vehicle1.runWater("船");

    }
}
class Vehicle1{       //利用其中的方法不同;
    public void runRoad(String vehicle){
        System.out.println(vehicle+"在公路上运行");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle+"在天空上运行");
    }

    public void runWater(String vehicle){
        System.out.println(vehicle+"在水里面运行");
    }
}