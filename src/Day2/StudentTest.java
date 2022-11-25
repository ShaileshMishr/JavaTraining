package JavaBasics.src.Day2;

public class StudentTest {

    public static void main(String[] arge) {

        Student stud1 = new Student("Shailesh", 101, 'A');
        Student stud2 = new Student("Kishan", 102, 'B');

        switch (stud2.getGrade()) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
        }

        System.out.println(stud1.getStudName());
    }
}