
//3. Create a class named Calculation add a method getSum(), use this method to calculate the sum of two numbers

package JavaBasics.src.Day1;

public class Calculation {
    public static void main (String[] args) {

        int num1=10;
        int num2=20;
        getSum(num1 , num2);

    }

    public static void getSum(int a, int b) {
        int result=a+b;
        System.out.println(result);

    }



}
