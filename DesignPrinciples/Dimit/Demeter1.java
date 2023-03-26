package example.DesignPrinciples.Dimit;
import java.util.ArrayList;
import java.util.List;
/*  直接的朋友：每个对象都会与其他对象有耦合关系，只要两个对象之间有耦合关系，我们就说这两个对象之间
    是朋友关系。耦合的方式很多，依赖，关联，组合，聚合等。其中，我们称出现成员变量，方法参数，方法返
    回值中的类为直接的朋友，而出现在局部变量中的类不是直接的朋友。也就是说，陌生的类最好不要以局部变
    量的形式出现在类的内部。
*/
//客户端
/**
 * @author 汤修帅 on 12:16.
 */
public class Demeter1 {
    public static void main(String[] args) {
        //创建了一个 SchoolManager 对象
        SchoolManager schoolManager = new SchoolManager();
        //输出学院的员工 id 和 学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }
//学校总部员工类
static class Employee {     //员工;
        private String id;
        public void setId(String id) {
            this.id = id;
        }
        public String getId() {
            return id;
        }
    }

//学院的员工类
static class CollegeEmployee {       //学院全部员工;
        private String id;
        public void setId(String id) {
            this.id = id;
        }
        public String getId() {
            return id;
        }
    }

//管理学院员工的管理类
static class CollegeManager {
        //返回学院的所有员工
        //CollegeEmployee不是CollageMango的子类
        public List<CollegeEmployee> getAllEmployee() {
            List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
            for (int i = 0; i < 10; i++) { //这里我们增加了 10 个员工到 list
                CollegeEmployee emp = new CollegeEmployee();
                emp.setId("学院员工 id= " + i);
                list.add(emp);
            }
            return list;
        }
    }


    //学校管理类
    //分析 SchoolManager 类的直接朋友类有哪些 Employee、CollegeManager
    //CollegeEmployee 不是 直接朋友 而是一个陌生类，这样违背了迪米特法则
    static class SchoolManager {
        //返回学校总部的员工
        public List<Employee> getAllEmployee() {
            List<Employee> list = new ArrayList<Employee>();
            for (int i = 0; i < 5; i++) { //这里我们增加了 5 个员工到 list
                Employee emp = new Employee();
                emp.setId("学校总部员工 id= " + i);
                list.add(emp);
   }
            return list;
}
        //该方法完成输出学校总部和学院员工信息(id)
        void printAllEmployee(CollegeManager sub) {
          //分析问题
            /** 这里的 CollegeEmployee 不是 SchoolManager 的直接朋友
             CollegeEmployee 是以局部变量方式出现在 SchoolManager 违反了迪米特法则
             学院员工类违反了员工管理类;

             */
            //获取到学院员工
            List<CollegeEmployee> list1 = sub.getAllEmployee();
            System.out.println("------------学院员工------------");
            for (CollegeEmployee e : list1) {
                System.out.println(e.getId());
            }
        //获取到学校总部员工
            List<Employee> list2 = this.getAllEmployee();
            System.out.println("------------学校总部员工------------");
            for (Employee e : list2) {
                System.out.println(e.getId());
            }
        }
    }
}

