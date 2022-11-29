package JavaBasics.src.Day5;
import java.util.Scanner;
public class SampleExceptionn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = sc.nextInt();

        if (age < 18) {
            throw new ArithmeticException();
        } else if (age > 60) {
            throw new ArithmeticException("Person is retired");
        }
        try {
            for (int i = 0; i <= args.length; i++) {
                System.out.println(args[i]);
            }
            //  try {
            int x = 2;
            int y = 5 / x;
            System.out.println("Value of y is :" + y);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("Arithmetic Exception");
                System.out.println(e.getMessage());
            } else if (e instanceof ArrayIndexOutOfBoundsException)
                System.out.println("ArrayIndexOutofBoundsException");
        }
//        catch(Exception e) {
//            System.out.println("Exception encountered :::");
//        }
        // Release the resources in finally block
        // Ex. - close file , close open db connection

        finally {
            System.out.println("Inside Finally ::");
        }

        System.out.println("Program continues.....");
    }
}
