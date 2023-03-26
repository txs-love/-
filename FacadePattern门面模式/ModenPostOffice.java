package example.Design.FacadePattern门面模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 14:48
 */
public class ModenPostOffice {
    private LetterProcess letterProcess;
    private letterPolice police;

    /**
     * 这个类是什么意思呢，就是说现在又一个叫 Hell Road PostOffice（地狱路邮局）提供了一种新型的
     * 服务，客户只要把信的内容以及收信地址给他们，他们就会把信写好，封好，并发送出去，这种服务提出
     * 时大受欢迎呀，这简单呀，客户减少了很多工作，那我们看看客户是怎么调用的
     * @param context
     * @param address
     */
    void sendLetter(String context, String address){     //我们只需要发送内容和地址才操作;
        letterProcess.writeContext(context);   //写;
        letterProcess.fillEnvelope(address);   //地址；
        letterProcess.letterInotoEnvelope();   //包装
        /**
         * 这里警察突击检测，很easy;
         */
        police.checkLetter(letterProcess);

        letterProcess.sendLetter();      //发送;
    }
    }
