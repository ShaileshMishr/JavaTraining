package JavaBasics.src.Day5;
import java.util.Scanner;

public class StudentTest {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Q to Quit");
        while (true) {
            System.out.println("Enter Student id :");
            int id = sc.nextInt();
            System.out.println("Enter Student name :");
            String name = sc.next();
            System.out.println("Enter Student grade :");
            char grade = sc.next().charAt(0);

            try {
                new Student(id,name,grade);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
           System.out.println("Q to quite");
            char choice = sc.next().charAt(0);
            if(choice=='Q' || choice=='q') {
                break;
            }
        }



    }


}
