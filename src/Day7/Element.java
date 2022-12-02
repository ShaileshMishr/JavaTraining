// create an ArrayList of integers and add 5 elements to it.
// Iterate the collection using enhanced for loop and display only odd numbers
//Calculate the sum of odd numbers in the list

package JavaBasics.src.Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Element {

    public static void main(String[] args){

        int sum=0;
        List<Integer> emp = new ArrayList<>();
      //  List<Integer> num = Arrays.asList(2,3,4,5,6);
        emp.add(5);
        emp.add(11);
        emp.add(4);
        emp.add(3);
        emp.add(2);

       // System.out.println("Odd number :");
        System.out.println("Sum of Odd numbers :");
        for (Integer e : emp) {
            if(e%2!=0)
                sum=sum+e;
           // System.out.println(e);
        }
        System.out.println(sum);
     //   System.out.println(num);

    }
}
