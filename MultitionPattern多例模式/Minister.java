package example.Design.MultitionPattern多例模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/25 10:10
 */
public class Minister {
    Minister minister = new Minister();
    private static Integer maxMinister = 10;

    public static void main(String[] args) {

        for (int i =0;i<maxMinister;i++){
           Emperor emperor = Emperor.getInstance();      //随便生成一个皇帝
            System.out.println("第"+i+1+"个Minister是  ");
            emperor.emperorInfo(); //找到一个精神领导;
        }
    }
}
