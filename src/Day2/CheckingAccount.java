package JavaBasics.src.Day2;

public class CheckingAccount implements Account{

    double balance;

    CheckingAccount(double balance) {
        this.balance=balance;
    }

    @Override
    public void deposit(double amount) {
        balance = balance+amount;
    }
    @Override
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    @Override
    public String getDetails() {
        return "Checking Account Balance is :"+ balance;
    }

}
