package example.Design.FacadePattern门面模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 14:47
 */
public class Client {
    public static void main(String[] args) {
        //创建一个处理信件的过程
        LetterProcess letterProcess = new LetterProcessImpl();

        //开始写信
        letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your old lover. I'd like to....");

        //开始写信封
        letterProcess.fillEnvelope("Happy Road No. 666,God Province,Heaven");

        //把信放到信封里，并封装好
        letterProcess.letterInotoEnvelope();

        //跑到邮局把信塞到邮箱，投递
        letterProcess.sendLetter();



        /**
         * 下面是现代化邮件的实现方式
         你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作；
         */
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        String context = "I love";
        String address = "北京市";
        modenPostOffice.sendLetter(context,address);

    }
}
