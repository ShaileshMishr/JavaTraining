// While creating employee object if the empId already exist then
// throw a custom exception "IDExistException"
// and display a message "emp Id already exist"
// Steps: When you create new employee object, first create an EmpList ArrayList
// check EmpList to see if id already exist
// If it's there then throw the exception
// if id is not there then add a new object to the collection

package JavaBasics.src.Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee2Test {

    public static void main(String[] args) throws IDExistException {

        List<Employee2> EmpList = new ArrayList<>();

        EmpList.add(new Employee2(101, "Shailesh", 5000));
        EmpList.add(new Employee2(102, "Kishan", 2200));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Id :");
            int EmpId = sc.nextInt();
            System.out.println("Enter Name :");
            String empName = sc.next();
            System.out.println("Enter Salary :");
            double salary = sc.nextDouble();

            ArrayList<Employee2> EmpList1 = new ArrayList<>();
            for (Employee2 emp : EmpList) {

                try {
                    if (emp.getEmpId() == EmpId) {
                        throw new IDExistException("emp Id already exist");
                    } else {
                        EmpList1.add(new Employee2(EmpId, empName, salary));
                      //  System.out.println(EmpList1);
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }



        System.out.println("Q to quite ");
        char choice = sc.next().charAt(0);
        if (choice == 'Q' || choice == 'q') {
            break;
        }
            System.out.println(EmpList1);

    }


    }
}

