// Take 5 students objects in an array and filter out only those students who got grade "A"

package JavaBasics.src.Day4;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] student = new String[5];
        String[] names = new String[5];
        String[] grade = new String[5];

        System.out.println("Enter 5 student name and his grade");
        System.out.println("Student Name: ");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }
        System.out.println("Student Grade: ");
        for (int i = 0; i < grade.length; i++) {
            grade[i] = sc.next();
        }

        int k = 0;
        for (int i = 0; i < names.length; i++) {
            if (grade[i].startsWith("A")) {
                student[k] = grade[i];
                k++;
            }
        }
        System.out.println("All the names who got A grades are : ");
        for (int i = 0; i < student.length; i++)
{
            System.out.println(names[i] + " : " + student[i]);


        }
    }

    }

