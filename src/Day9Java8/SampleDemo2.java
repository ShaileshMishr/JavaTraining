//Create a collection of Student object then stream through it and filter out only the 'A' grade students.

package JavaBasics.src.Day9Java8;

import java.util.Arrays;
import java.util.List;

public class SampleDemo2 {
    public static void main(String[] args) {

        Student s1 = new Student("Shailesh",'A');
        Student s2 = new Student("Suyash",'B');
        Student s3 = new Student("Suyash",'C');
        Student s4 = new Student("Sam",'A');

        List<Student> student = Arrays.asList(s1,s2,s3,s4);
        student.stream().filter(n->n.getGrade()=='A').forEach(x->System.out.println(x.getName()));
    }

}
