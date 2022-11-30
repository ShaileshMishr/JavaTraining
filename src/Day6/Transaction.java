package JavaBasics.src.Day6;
import java.util.Scanner;

public class Transaction {

    public static void main(String[] args) {

        Account dt = new Account();

        Account acc1 = new Account(101,"Shailesh",20000);
        Account acc2 = null;
        Account acc3 = null;
        try {
            dt.daytransaction(21);
            acc2=(Account)acc1.clone();
            acc3=(Account)acc2.clone();
            acc1.deposit(5000);
            acc2.withdraw(300);
            acc3.deposit(500);
            dt.daytransaction(22);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);

    }
}
