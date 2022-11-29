// Ask user to input number of elements for an array. If user inputs a value other than number
// then an exception occurs. after getting the array size from the user, construct an array of int of
// that size, now ask user to input values in that integer and then search for a given index, if the index value
// exceeds the maximum index then also an exception will be thrown. Handle both the exceptions in your code.

package JavaBasics.src.Day5;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Sample1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter number of elements for an array :");
            int num = sc.nextInt();
            int[] arr = new int[num];
            System.out.println("Enter elements for an array :");

            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the index for which you want value :");
            int val = sc.nextInt();
            int c=0;
            for(int i=0;i< arr.length;i++) {
                c = arr[val];
            }
                System.out.println("Value is :"+c);


        }
        catch(ArrayIndexOutOfBoundsException | NumberFormatException | InputMismatchException e) {
            if(e instanceof NumberFormatException)
                System.out.println("NumberFormat Exception");
            else if(e instanceof ArrayIndexOutOfBoundsException)
                System.out.println("ArrayIndexOutofBoundsException");
            else if(e instanceof InputMismatchException)
                System.out.println("Input Format is wrong");
        }
        finally {
            System.out.println("Program end .....");
        }
        }

    }

