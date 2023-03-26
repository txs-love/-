package example.Design.PrototypePattern原型模式;

import java.util.Random;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 18:05
 */
public class Client {
    //发送账单的数量，这个值是从数据库中获得
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        //模拟发送邮件
          int i=0;
        //把模板定义出来，这个是从数据库中获得

        Mail mail = new Mail(new AdvTemplate());        //单个线程   + 多个线程会引起覆盖元素;
        mail.setTail("XX银行版权所有");
        while(i<MAX_COUNT){
            //以下是每封邮件不同的地方
            Mail cloneMail = mail.clone();       //这里通过
            /**
             * 运行结果不变，一样完成了电子广告信的发送功能，而且 sendMail 即使是多线程也没有关系，看到
             * mail.clone()这个方法了吗？把对象拷贝一份，产生一个新的对象，和原有对象一样，然后再修改细节的
             * 数据，如设置称谓，设置收件人地址等等。这种不通过 new 关键字来产生一个对象，而是通过对象拷贝来
             * 实现的模式就叫做原型模式，
             */
            mail.setAppellation(getRandString(5)+" 先生（女士）");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8)+".com");

            // 这里下面只用拷贝，上面的需要new出一个对象;速度慢，空间小;
            cloneMail.setAppellation(getRandString(5)+" 先生（女士）");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8)+".com");

            //然后发送邮件
            sendMail(mail);
            i++;
        }
    }

    //发送邮件
    public static void sendMail(Mail mail){
        System.out.println("标题："+mail.getSubject() + "\t收件人："+mail.getReceiver()+"\t发送成功");
    }


    //获得指定长度的随机字符串
    public static String getRandString(int maxLength){
        String source ="abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i=0;i<maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();

    }
}

