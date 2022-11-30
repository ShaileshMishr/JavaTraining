package JavaBasics.src.Day6;

public class Student implements Cloneable {

    public Student(String studName, int rollNo, char grade) {
        this.studName = studName;
        this.rollNo = rollNo;
        this.grade = grade;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

   public Student() {

    }
    private String studName;  // Instance variable
    private int rollNo;
    private char grade;

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studName='" + studName + '\'' +
                ", rollNo=" + rollNo +
                ", grade=" + grade +
                '}';
    }
}
