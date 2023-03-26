package example.Design.BuilderPattern建筑者模式;

import java.util.ArrayList;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 7:59
 * 按照顺序返回一个宝马车;
 */
public class BMWBulider extends CarBuilder{
    private BMWModel bmwModel = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }
    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
