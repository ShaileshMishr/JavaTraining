// Create a Student class with fields studId, studName, age and collegeName.
// Create at least 6 student objects and then ask user to enter collegeName and then
// display all students belong to that college
// add student objects into an ArrayList.
// Iterate over it and if the collegeName matches then add those student objects into a new ArrayList

package JavaBasics.src.Day7;

import java.util.Objects;

public class Student1 {

    private int studId;
    private String studName;
    private int age;
    private String collegeName;

    public Student1(int studId, String studName, int age, String collegeName) {
        this.studId = studId;
        this.studName = studName;
        this.age = age;
        this.collegeName = collegeName;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", age=" + age +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student1 student1 = (Student1) o;
//        return studId == student1.studId && age == student1.age && Objects.equals(studName, student1.studName) && Objects.equals(collegeName, student1.collegeName);
//    }
//
//    @Override
//    public int hashCode() {
//       return Objects.hash(studId, studName, age, collegeName);
//       // return Objects.hash(collegeName);
    //}
}
