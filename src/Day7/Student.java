package JavaBasics.src.Day7;

import java.util.Objects;

public class Student implements Cloneable, Comparable<Student>{

    //Attributes
      private String studName;   // Instance variable
      private int rollNo;        // Instance variable
      private char grade;// Instance variable

    public Student(String studName, int rollNo, char grade) {
        this.studName = studName;
        this.rollNo = rollNo;
        this.grade = grade;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && grade == student.grade && Objects.equals(studName, student.studName);
    }

    @Override
    public int hashCode() {
        return this.rollNo;
    }

    @Override
    public int compareTo(Student o) {
        // return this.studName.compareTo(o.getStudName());
        if(this.rollNo > o.getRollNo()) {
            return 1;
        } else if (this.rollNo < o.getRollNo()) {
            return -1;
        } else {
            return 0;
        }
    }

}


