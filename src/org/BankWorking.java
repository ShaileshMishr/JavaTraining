package JavaBasics.src.org;

import JavaBasics.src.org.Bank;

public class BankWorking {

             Bank b = new Bank();

    public void newAccount(String accHolderName, int accNo, String accType, double balance) {
        b.setAccNo(accNo);
        b.setAccHolderName(accHolderName);
        b.setAccType(accType);
        b.setBalance(balance);

        System.out.println("Account Open Successfully......");
        System.out.println("Account no :"+b.getAccNo()+", Account Holder Name :"+b.getAccHolderName()+
                ", Account Type :"+b.getAccType()+", Balance :"+b.getBalance());
    }

    public void deposit(double bal){
       double balance = bal+ b.getBalance();
    }

    public double withdraw(double bal) {
        double balance ;
        if(b.getBalance()>bal){
        balance= b.getBalance()-bal;
        return balance;}
        else return -1;
    }

    public void closeAccount(String accHolderName, int accNo, String accType) {
        System.out.println("Your Account is closed.......");
        System.out.println("Thank you.....");

    }
}
