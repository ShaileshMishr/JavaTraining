package JavaBasics.src.Day4;
import java.util.Scanner;
public class EmailTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name and Email for 4 Users :");

        Email[] emails = new Email[4];
        Email[] gmail = new Email[4];
        Email[] yahoo = new Email[4];

        for(int i=0; i<4; i++) {
            System.out.println("Enter Name for User "+(i+1));
            String name = sc.next();
            System.out.println("Enter Email for User "+(i+1));
            String email = sc.next();

            emails[i] = new Email(name, email);
            System.out.println("Email array is created ::");
        }

        int k=0, m=0;
        for(int i=0; i<4; i++) {
            if(emails[i].getEmail().contains("gmail")) {
                gmail[k] = emails[i];
                k++;
            }
            else if(emails[i].getEmail().contains("yahoo")) {
                yahoo[m]=emails[i];
                m++;
            }
        }

        System.out.println("Gmail::");
        for(int i=0; i<4; i++) {
            System.out.println(gmail[i].getEmail());
        }
        System.out.println("Yahoo::");
        for(int i=0; i<4; i++) {
            System.out.println(yahoo[i].getEmail());
        }
//
//        for(int i=0; i<4; i++) {
//            if(gmail[i]==null) {
//                continue;
//            }
//            System.out.println(gmail[i]);
//        }
//
//        for(int i=0; i<4; i++) {
//            if(yahoo[i]==null) {
//                continue;
//            }
//            System.out.println(yahoo[i]);
//        }


    }
}
