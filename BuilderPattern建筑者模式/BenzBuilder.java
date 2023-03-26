package example.Design.BuilderPattern建筑者模式;

import java.util.ArrayList;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 7:57
 * 按照排序返回一个奔驰车;
 */
public class BenzBuilder extends CarBuilder{
    private BenzModel benzModel = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }
    @Override
    public BenzModel getCarModel() {
       return this.benzModel;
    }
}
