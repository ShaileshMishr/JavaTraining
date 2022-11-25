
// Ask the user to input a number between 1 to 12
//   and output corresponding month.
//   for example: input: 1 output: January
//                input: 3 output: March
//   You should use Enum in this program.

package JavaBasics.src.Day3;

import java.util.Scanner;

public enum Months {

    January(1),
    Febraury(2),
    March(3),
    April(4),
    May(5),
    june(6),
    july(7),
    august(8),
    september(9),
    october(10),
    november(11),
    december(12);
    private int month;
    private Months(int month)
    {
        this.month=month;
    }




    public static void main(String[] args) {

        System.out.println("Enter month : ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(Months monthName:Months.values())
        {
            if( monthName.month==num)
            {
                System.out.println(monthName);
            }
        }

    }