package JavaBasics.src.Day2;
import java.util.Scanner;
public class AccountTest {

    public static void main(String[] args) {
       // SavingAccount sa1 = new SavingAccount(1000);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Type :");
        String accountType = sc.next();
        Account account = AccountFactory.getAccount(accountType);  // Account account = new SavingAccount();

        System.out.println("Enter 1 Deposit 2 Withdraw");
        int option =sc.nextInt();
        if(option==1) {
            System.out.println("Enter Amount for Deposit :");
            int depo = sc.nextInt();
            account.deposit(depo);
        }
        else{
            System.out.println("Enter Amount for Withdraw :");
            int withd = sc.nextInt();
            account.withdraw(withd);
        }

        //  account.deposit(500);

      //  System.out.println("Account balance is: "+sa1.balance);

        System.out.println(account.getDetails());
    }
}
