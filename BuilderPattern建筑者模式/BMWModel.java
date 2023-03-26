package example.Design.BuilderPattern建筑者模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 7:44
 */
public class BMWModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("宝马车的开启是这个样子的...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车的停止是这个样子的...");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声音是这个样子的...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎++++ 是这个样子的...");
    }
}
