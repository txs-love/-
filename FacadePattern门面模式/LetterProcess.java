package example.Design.FacadePattern门面模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 14:44
 */

/**
 * 先写信的内容，然后写信封，然后把信放到信封中，封好，投递到信箱中进行邮递，这个过程还是比较简单的，虽然简单，这四个步骤都是要跑的呀
 定义四个接口过程;

 */
public interface LetterProcess {
    //首先要写信的内容
    public void writeContext(String context);

    //其次写信封
    public void fillEnvelope(String address);

    //把信放到信封里
    public void letterInotoEnvelope();

    //然后邮递
    public void sendLetter();
}
