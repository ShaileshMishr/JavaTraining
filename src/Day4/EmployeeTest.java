package JavaBasics.src.Day4;
import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] main) {


        Scanner sc = new Scanner(System.in);
       Employee[] emp = new Employee[5];

//        emp[0] = new Employee(101,"Shailesh",21);
//        emp[1] = new Employee(102,"Suyash",22);
//        emp[2] = new Employee(103,"Kishan",23);
//        emp[3] = new Employee(104,"Vikas",20);
//        emp[4] = new Employee(105,"Ram",24);


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Emp Name " + (i + 1));
            String empName = sc.next();
            System.out.println("Enter empId " + (i + 1));
            int empId = sc.nextInt();
            System.out.println("Enter emp age " + (i + 1));
            int age = sc.nextInt();
            emp[i] = new Employee(empId,empName,age);
        }

       int Avgage = ((emp[0].getEmpAge()+emp[1].getEmpAge()+emp[2].getEmpAge()+emp[3].getEmpAge()+emp[4].getEmpAge())/5);

        System.out.println("Avg age of employee is :"+Avgage);

    }
}
