 // Create Employee class with fields empId, empName and salary
// While creating employee object if the empId already exist then
// throw a custom exception "IDExistException"
// and display a message "emp Id already exist"
// Steps: When you create new employee object, first create an EmpList ArrayList
// check EmpList to see if id already exist
// If it's there then throw the exception
// if id is not there then add a new object to the collection

package JavaBasics.src.Day7;

 public class Employee2 {

    private int empId;
    private String empName;
    private double salary;

     public Employee2(int empId, String empName, double salary) {
         this.empId = empId;
         this.empName = empName;
         this.salary = salary;
     }

     public int getEmpId() {
         return empId;
     }

     public void setEmpId(int empId) {
         this.empId = empId;
     }

     public String getEmpName() {
         return empName;
     }

     public void setEmpName(String empName) {
         this.empName = empName;
     }

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }

     @Override
     public String toString() {
         return "Employee2{" +
                 "empId=" + empId +
                 ", empName='" + empName + '\'' +
                 ", salary=" + salary +
                 '}';
     }
 }
