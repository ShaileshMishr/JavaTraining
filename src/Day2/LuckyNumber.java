
// Ask user to guess your lucky number, the number should be between 1 to 10, after
// every attempt you will count the no of attempts and when the user guess it right your
// output should display: "Great! you have guessed in right in <count> attempts. For incorrect
// guess, output should be "Not Really! Please Try Again!!"

package JavaBasics.src.Day2;
import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {

        int num=5, count=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess your lucky number, the number should be between 1 to 10 : ");
        while(num==5) {

            int lucky = sc.nextInt();
            if (lucky==num) {
                System.out.println("Great! you have guessed in right in"+" "+count+" "+"count");
                break;
            }
            else {
                System.out.println("Not Really! Please Try Again!!");
                count=count+1;
            }
        }



    }

}
