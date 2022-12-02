package JavaBasics.src.Day7;
import java.util.*;

public class Student1Test {
    public static void main(String[] args) {


       // Set<Student1> students = new HashSet<>();
        List<Student1> students = new ArrayList<Student1>();

        Student1 s1 =new Student1(101, "Shailesh", 21, "BBDITM");
        Student1 s2 =new Student1(102, "Kishan", 22, "JNU");
        Student1 s3 =new Student1(103, "Vikas", 20, "IIT");
        Student1 s4 =new Student1(104, "Suyash", 23, "BBDITM");
        Student1 s5 =new Student1(105, "Ram", 26, "NIT");
        Student1 s6 =new Student1(106, "Gaurav", 21, "BBDITM");

        // add student objects into an ArrayList.

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

      List<Student1> sameCollegeList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter College name :");
        String cname = sc.next();

        System.out.println("Students from "+ cname + " college are :" );
        for(Student1 s : students)
            if (cname.equalsIgnoreCase(s.getCollegeName())){
               sameCollegeList.add(s);

                   // System.out.println(s.getStudName());

        }

        for(Student1 stud:sameCollegeList){
            System.out.println(stud);
        }
        }
    }

//}
