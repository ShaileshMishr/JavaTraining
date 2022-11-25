
// Create Employee object with empId and empName using constructor and
// create another object with empId, empName and designation using constructor

package JavaBasics.src.Day2;

public class Employee {
    String empName;
    int empId;
    String desigNation;

    Employee(String empName, int empId) {
        this.empName=empName;
        this.empId=empId;
        System.out.println(empName+empId);

    }


    Employee(String empName, int empId, String desigNation) {
        this.empName=empName;
        this.empId=empId;
        this.desigNation=desigNation;
        System.out.println(empName+ " " +empId+ " "+ " " +desigNation);

    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Shailesh",101,"Developer");
    }
}


