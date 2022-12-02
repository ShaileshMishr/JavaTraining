package JavaBasics.src.Day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class EmployeeTest {

    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee(101,"Shailesh",21,500));
        emp.add(new Employee(102,"Kishan",22,200));
        emp.add(new Employee(103,"Vikas",23,600));
        emp.add(new Employee(104,"Suyash",21,100));


        Collections.sort(emp);
        for (Employee e : emp) {
            System.out.println(e);
        }

    }
}
