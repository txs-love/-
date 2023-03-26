package example.Design.ChainOfResponsibilityPattern责任链模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 16:34
 */
public class Women implements IWomen{
    private int type=0;

    //妇女的请示
    private String request = "";
    public Women(int type,String request){
        this.request = request;
        this.type =type;
    }
    /**
     * ，1 是未结婚，2 是已经结婚的，而且丈夫建在，3 是丈夫去世了的。
     * @return
     */
    @Override
    public int getType() {       //获取类型
        return this.type;
    }
    @Override
    public String getRequest() {     //获取请求  看电影,逛街;
        return this.request;
    }


    /*
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1---未出嫁
     * 2---出嫁
     * 3---夫死
     */
    private int type0=0;
    private String _request1;

    //妇女的请示
    private String request0 = "";

    //构造函数传递过来请求
    /**
     * 责任链的模式构造;
     */
    /**
    public Women(int _type1,String _request1){
        this.type0 = _type1;
        this._request1 = _request1;

        //为了显示好看点，我在这里做了点处理
        switch(this.type0){
            case 1:
                this.request0 = "女儿的请求是：" + _request1;
                break;
            case 2:
                this.request0 = "妻子的请求是：" + _request1;
                break;
            case 3:
                this.request0 = "母亲的请求是：" + _request1;

        }
    }
     */
}
