package JavaBasics.src.Day7;

public class SamEmployee {

    private int empId;
    private String empName;
    private int empAge;
    private double salary;

    public SamEmployee(int empId, String empName, int empAge, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
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

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SamEmployee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", salary=" + salary +
                '}';
    }


}
