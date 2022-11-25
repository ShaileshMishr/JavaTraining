package JavaBasics.src.Day3;

import java.util.Scanner;
public class AgencyTest {

    public static void main(String[] args) {


       Agency a1 = new Agency();

      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Item name :");
        String item = sc.next();
        a1.setItem(item);
        System.out.println("Enter the quantity:");
        int quantity = sc.nextInt();
        a1.setQuantity(quantity);

        a1.setPrice();


      System.out.println("Price of the"+" "+item+" "+"for quantity"+" "+quantity+" "+"is :"+" "+ a1.getPrice());


    }
}
