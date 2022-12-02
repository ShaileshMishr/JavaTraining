// Create separate Maps of student where the key will represent the grade and value will be all
// students who has that grade

package JavaBasics.src.Day8;

import JavaBasics.src.Day7.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student1 {
    public static void main(String[] args) {

        Student student1 = new Student("Rohan", 27,'A');
        Student student2 = new Student("Priya", 28,'B');
        Student student3 = new Student("John", 22,'B');
        Student student4 = new Student("Pete", 29,'D');
        Student student5 = new Student("Pooja", 20,'A');

        List<Student> studentList = new ArrayList<>();

        List<Student> studentListA = new ArrayList<>();
        List<Student> studentListB = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        for(Student student : studentList) {
            if(student.getGrade() == 'A') {
                studentListA.add(student);
            } else if (student.getGrade() == 'B') {
                studentListB.add(student);

            }
        }

        Map<Character, List<Student>> studMap = new HashMap<>();

        studMap.put('A', studentListA);
        studMap.put('B', studentListB);

        System.out.println("Student of Grade A : ------");
        System.out.println(studentListA);
        System.out.println("Student of Grade B : ------");
        System.out.println(studentListB);



    }
}