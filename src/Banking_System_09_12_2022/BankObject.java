package JavaBasics.src.Banking_System_09_12_2022;

import java.util.Scanner;

public class BankObject {

    synchronized void BankMethod(String threadName) {

        try {
            if (threadName.equalsIgnoreCase("OPEN NEW ACCOUNT")) {
                System.out.println("Enter details for opening account.......");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter AccNo :");
                Long accNo = sc.nextLong();
                System.out.println("Enter AccHolderName :");
                String name = sc.next();
                System.out.println("Enter Account Type :");
                String type = sc.next();
                System.out.println("Deposit 1000 for open new account :");
                double balance = sc.nextDouble();
                System.out.println("Account is created......");
                System.out.println(name + " ," + accNo + "," + type + "," + balance);

                Thread.sleep(3000);

            }

            else if (threadName.equalsIgnoreCase("DEPOSIT")) {

                double balance = 1000;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter account no for deposit :");
                Long accNo = sc.nextLong();
                System.out.println("Enter amount for deposit : ");
                double bal = sc.nextDouble();
                balance = balance + bal;
                System.out.println("Total Balance after Deposit :" + balance);

                Thread.sleep(3000);

            }

            else if (threadName.equalsIgnoreCase("WITHDRAW")) {

                double balance = 1000;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter account no for Withdraw :");
                Long accNo = sc.nextLong();
                System.out.println("Enter amount for withdraw : ");
                double bal = sc.nextDouble();
                balance = balance - bal;
                System.out.println("Total Balance after Withdraw :" + balance);

                Thread.sleep(3000);

            }

            else if (threadName.equalsIgnoreCase("CLOSE ACCOUNT")) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter account no for closing Account :");
                Long accNo = sc.nextLong();
                System.out.println("Enter AccHolderName :");
                String name = sc.next();
                System.out.println("Account is closed ...." + name + "," + accNo);


            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
