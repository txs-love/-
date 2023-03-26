package example.Design.FacadePattern门面模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 14:45
 */
//具体实现类
public class LetterProcessImpl implements LetterProcess{       //需要分别实现原理;
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容...." + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址及姓名...." + address);
    }

    @Override
    public void letterInotoEnvelope() {
        System.out.println("把信放到信封中....");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件...");
    }
}
