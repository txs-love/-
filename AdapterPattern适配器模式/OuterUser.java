package example.Design.AdapterPattern适配器模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 15:44
 */

/**
 * OuterUser是这个外部员工加进来的类;
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {   //  baseInfo 基本信息，比如名称，性别，手机号码了等
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("UserAddress", "北京市");
        baseInfoMap.put("Position", "C++开发");
        return null;
    }

    @Override
    public Map getUserOfficeInfo() {   //officeInfo
        HashMap officeInfoMap = new HashMap();
        officeInfoMap.put("座机电话","10086");
        officeInfoMap.put("移动电话","18314125502");
        return null;
    }

    @Override
    public Map getUserHomeInfo() {        //homeInfo;
        HashMap homeInfoMap = new HashMap();
        homeInfoMap.put("UserName", "汤修帅");
        homeInfoMap.put("家庭电话","4627900");
        homeInfoMap.put("xxx","工作后面");
        return null;
    }
}
