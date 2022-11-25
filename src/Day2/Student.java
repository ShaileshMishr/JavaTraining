package JavaBasics.src.Day2;

public class Student {

    Student(String studName, int rollNo, char grade) {
        this.studName = studName;
        this.rollNo = rollNo;
        this.grade = grade;
    }
    Student() {

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
}
