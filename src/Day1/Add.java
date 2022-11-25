
//     Create a java class and add two numbers inside main method and show the result


package JavaBasics.src.Day1;
import java.util.Scanner;

public class Add {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter first number:");
        int b=sc.nextInt();
        int c;

       // int a=10, b=20, c;
        c=a+b;
        System.out.println("Sum of two numbers is :"+c);
    }
}
