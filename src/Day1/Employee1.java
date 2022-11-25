
// Create 4 Employee objects with different designations and calculate the salary of each employee
// based on the designation: if employee is manager then salary = hourWorked 2000, for Consultant
// salary = hoursWorked * 1500, for developer, salary = hoursWorked * 1000 and for
// trainee, salary = hoursWorked * 500

package JavaBasics.src.Day1;

public class Employee1 {

    private int empId;
    private String empName;
    private String designation;
    private int hoursWorked;
    private double salary1;

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


    public double getSalary1() {
        return salary1;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary1 +
                '}';
    }

    public void setSalary1() {
        if (designation.equals("Manager")) {
            this.salary1 = hoursWorked * 2000;
        }
        if (designation.equals("Consultant")) {
            this.salary1 = hoursWorked * 1500;
        }
        if (designation.equals("Developer")) {
            this.salary1 = hoursWorked * 1000;
        }
        if (designation.equals("Trainee")) {
            this.salary1 = hoursWorked * 500;
        }


    }

}

