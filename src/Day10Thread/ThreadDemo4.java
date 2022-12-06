//Create 3 threads named "ADD", "SUBTRACT", MULTIPLY
//When ADD thread runs it will add two given numbers
// When SUBTRACT thread runs it will subtract two given numbers
//and so on....

package JavaBasics.src.Day10Thread;
import java.util.Random;
import java.util.Scanner;
public class ThreadDemo4 implements Runnable {

    String Result;
    Thread cal;

    public ThreadDemo4(String Result) {
        this.Result = Result;

        cal = new Thread(this, this.Result);
        cal.start();
    }

    @Override
    public void run() {
        if (cal.getName() == "ADD") {

           int a = 5, b = 8;
            System.out.println("Addition is :" + (a + b));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Add Thread Exiting....");
        }
        else if(cal.getName()=="SUBTRACT"){
            int a = 10, b = 8;
            System.out.println("Subtraction is :" + (a - b));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Subtract Thread Exiting....");
        }
        else if(cal.getName()=="MULTIPLY"){
            int a = 10, b = 8;
            System.out.println("Multiply is :" + (a * b));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Multiply Thread Exiting....");
        }

    }
}
