package example.Design.AdapterPattern适配器模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 15:43
 */

import java.util.Map;

/**
 * 外部员工系统添加到钙元素;
 */
@SuppressWarnings("all")
public interface IOuterUser {
    //基本信息，比如名称，性别，手机号码了等
    public Map getUserBaseInfo();

    //工作区域信息
    public Map getUserOfficeInfo();

    //用户的家庭信息
    public Map getUserHomeInfo();
}
