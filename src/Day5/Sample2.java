package JavaBasics.src.Day5;
import java.util.Scanner;
public class Sample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age :");
        int age = sc.nextInt();
        try {

            if (age < 18) {
              //  throw new MyException("Age should not be less than 18");
            }
            Sample2 sample2 = new Sample2();

            sample2.update();

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("Arithmetic Exception");
                System.out.println(e.getMessage());
            } else if (e instanceof ArrayIndexOutOfBoundsException)
                System.out.println("ArrayIndexOutofBoundsException");
//            else if (e instanceof MyException)
//                System.out.println(e.getMessage());
            }


     finally{
                System.out.println("Inside Finally ::");
            }

            System.out.println("Program continues.....");
        }

        public void update () throws ArithmeticException, NumberFormatException {
            int x = 0;
            int y = 5 / x;
            System.out.println(y);
        }
    }

