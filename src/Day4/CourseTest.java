package JavaBasics.src.Day4;
import java.util.Scanner;

public class CourseTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course[] course = new Course[5];
        boolean isCourseAvailable = false;


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter CourseName " + (i + 1));
            String courseName = sc.next();
            System.out.println("Enter CourseId " + (i + 1));
            int courseId = sc.nextInt();
            System.out.println("Enter Course fee " + (i + 1));
            double fee = sc.nextDouble();
            course[i] = new Course(courseId, courseName, fee);
        }

            System.out.println("1: Search by courseId  2: Search by courseName");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter courseId :");
                int searchById = sc.nextInt();

                for (int i = 0; i < 5; i++) {
                    if (searchById == course[i].getCourseId()) {
                        System.out.println(course[i]);
                        isCourseAvailable = true;
                    }
                }
            } else if (choice == 2) {

                String searchByName = sc.next();
                for (int i = 0; i < 5; i++) {
                    if (searchByName.equalsIgnoreCase(course[i].getCourseName())) {
                        System.out.println(" Course is Available :" + course[i]);
                        isCourseAvailable = true;

                    }
                }

                } else {
                    System.out.println("Invalid Input");
                }
            if(isCourseAvailable == false) {
                System.out.println("Course Not Available");
            }


            }
        }

