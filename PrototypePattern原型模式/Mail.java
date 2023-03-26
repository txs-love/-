package example.Design.PrototypePattern原型模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 18:04
 */
public class Mail implements Cloneable{
    //收件人
    private String receiver;
    //邮件名称
    private String subject;

    //称谓
    private String appellation;

    //邮件内容
    private String contxt;

    //邮件的尾部，一般都是加上“XXX版权所有”等信息
    private String tail;

    //构造函数
    public Mail(AdvTemplate advTemplate){
        this.contxt = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    public Mail clone(){        //重写了clone方法
        /**
         * 运行结果不变，一样完成了电子广告信的发送功能，而且 sendMail 即使是多线程也没有关系，看到
         * mail.clone()这个方法了吗？把对象拷贝一份，产生一个新的对象，和原有对象一样，然后再修改细节的
         * 数据，如设置称谓，设置收件人地址等等。这种不通过 new 关键字来产生一个对象，而是通过对象拷贝来
         * 实现的模式就叫做原型模式，
         */
        Mail mail =null;
        try {
            mail = (Mail)super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return mail;
    }

    /**
     * 在 clone()方法上增加了一个注解@Override，没有继承一个类为什么可以重写呢？在 Java 中所有类的
     * 老祖宗是谁？对嘛，Object 类，每个类默认都是继承了这个类，所以这个用上重写是非常正确的。
     * 原型模式虽然很简单，但是在 Java 中使用原型模式也就是 clone 方法还是有一些注意事项的，我们通
     * 过几个例子一个一个解说（如果你对 Java 不是很感冒的话，可以跳开以下部分）。
     * 对象拷贝时，类的构造函数是不会被执行的。一个实现了 Cloneable 并重写了 clone 方法的类 A,有一
     * 个无参构造或有参构造 B，通过 new 关键字产生了一个对象 S，再然后通过 S.clone()方式产生了一个新的
     * 对象 T，那么在对象拷贝时构造函数 B 是不会被执行的，
     * @return
     */

    //以下为getter/setter方法
    public String getReceiver() {
        return receiver;
    }
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getAppellation() {
        return appellation;
    }
    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }
    public String getContxt() {
        return contxt;
    }
    public void setContxt(String contxt) {
        this.contxt = contxt;
    }
    public String getTail() {
        return tail;
    }
    public void setTail(String tail) {
        this.tail = tail;
    }

}
