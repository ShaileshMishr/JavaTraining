
//  Calculate a class named Employee with fields like empId, empName, designation,
//  hoursWorked and salary using java bean standard

package JavaBasics.src.Day1;

public class Employee {

    private int empId;
    private String empName;
    private String designation;
    private int hoursWorked;
    private int salary;

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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.setEmpId(101);
        e1.setEmpName("Shailesh");
        e1.setDesignation("Developer");
        e1.setSalary(80000);
        e1.setHoursWorked(9);

        System.out.println(e1.getEmpId()+" " +e1.getEmpName()+" "+e1.getDesignation()+" "+e1.getSalary()+" "+e1.getHoursWorked());
    }

}
