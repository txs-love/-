package example.DesignPrinciples.SingleResponsibilityPrinciple;

/**
 * @author 汤修帅 on 9:06.
 * 里式替换原则 :
 */
public class singleResponsibleDemo02 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle=new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle=new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle=new WaterVehicle();
        waterVehicle.run("船");

    }
    /*
    1.遵守单一原则
    2.但是修改动作很大,将类分解,又修改了客户端
    3.改进,直接修改 Vehicle类，改动的代码比较少——>Demo03
    */
}
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上运行");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在天空上运行");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在水上运行");
    }
}
