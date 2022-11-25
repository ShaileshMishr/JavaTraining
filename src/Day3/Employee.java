
// Create an Employee class with fields like empName, salary, and netSalary.
// Create a PermanentEmployee class that extends from Employee class and has
// pfPercent field. Based on the pfPercent calculate the netSalary of the Employee

package JavaBasics.src.Day3;

public class Employee {
    String empName;
    double Salary;
    double netSalary;



    public String getEmployeeSalary(){
        return empName+ ": " + netSalary;
    }
}



