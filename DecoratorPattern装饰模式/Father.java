package example.Design.DecoratorPattern装饰模式;

/**
 * @author txssherry@gmail.com
 * @date 2023/3/26 9:42
 */
public class Father {    //Father拿到成绩单,不签名
        public static void main(String[] args) {
            //成绩单拿过来
            SchoolReport sr = new FouthGradeSchoolReport();
            //看成绩单
            sr.report();

            //签名？休想！
            System.out.println("-------------");
            SchoolReport src = new FouthGradeSchoolReport();
            src.report();    //看成绩单并且报告
            src.sign("Father老王");
    }
}
