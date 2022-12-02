// create a list of employees and display those employees whose name starts with 'S'
// In the Employee list add a new employee at 3rd position
package JavaBasics.src.Day7;

import java.util.ArrayList;
import java.util.List;

public class Employee1 {
    public static void main(String[] args) {

        List<SamEmployee> emp = new ArrayList<>();
        emp.add(new SamEmployee(101,"Shailesh",21,500));
        emp.add(new SamEmployee(102,"Kishan",22,200));
        emp.add(new SamEmployee(103,"Vikas",23,600));
        emp.add(new SamEmployee(104,"Suyash",21,100));

       emp.add(2,new SamEmployee(111,"Ram",30,1000));
        for (SamEmployee e : emp) {
           // if(e.getEmpName().startsWith("S"))
            System.out.println(e);
        }
    }
}
