// Add dateOfJoining in the employee class with type Date. Whenever a new Employee object is created
// System date becomes the date of joining.
// while displaying Employee object convert this date into dd-MM-yyyy format.

package JavaBasics.src.Day6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

    private int id;
    private String name;
    private int age;
    private Date dateOfJoining;

    public Employee(int id, String name, int age, Date dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dateOfJoining=" + new SimpleDateFormat("dd-MM-yyyy").format(dateOfJoining) +
                '}';
    }
}
