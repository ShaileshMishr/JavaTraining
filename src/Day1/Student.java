package JavaBasics.src.Day1;

public class Student {

    //Attributes
      private String studName;   // Instance variable
      private int rollNo;        // Instance variable
      private char grade;        // Instance variable

    static String collegeName;

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

    //Access Specifiers:
// 1. Public: This can be accessed from anywhere
// 2. Protected: This can be accessible from within the same package and from any subclass outside of the package
// 3. Default: It can be accessible only within the same package
// 4. Private: It can be accessed within the same class.

// Java bean Standard