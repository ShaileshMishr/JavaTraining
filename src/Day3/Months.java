
// Ask the user to input a number between 1 to 12
//   and output corresponding month.
//   for example: input: 1 output: January
//                input: 3 output: March
//   You should use Enum in this program.

package JavaBasics.src.Day3;
import java.time.Month;
import java.util.Scanner;
enum day{
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
}
public class Months {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number from 1 to 12: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println(Month.JANUARY);
                break;

            case 2:
                System.out.println(Month.FEBRUARY);
                break;
            case 3:
                System.out.println(Month.MARCH);
                break;
            case 4:
                System.out.println(Month.APRIL);
                break;
            case 5:
                System.out.println(Month.MAY);
                break;
            case 6:
                System.out.println(Month.JUNE);
                break;
            case 7:
                System.out.println(Month.JULY);
                break;
            case 8:
                System.out.println(Month.AUGUST);
                break;
            case 9:
                System.out.println(Month.SEPTEMBER);
                break;
            case 10:
                System.out.println(Month.OCTOBER);
                break;
            case 11:
                System.out.println(Month.NOVEMBER);
                break;
            case 12:
                System.out.println(Month.DECEMBER);
                break;
            default:
                System.out.println("You have entered wrong Input");


        }
    }
}

