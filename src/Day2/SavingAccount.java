package JavaBasics.src.Day2;

public class SavingAccount implements Account {

    double balance;

    SavingAccount(double balance) {
        this.balance=balance;
    }
    SavingAccount() {

    }

    @Override
    public void deposit(double amount) {
        balance = balance+amount;
    }

    @Override
    public void withdraw(double amount) {
        balance = balance-amount;

    }

    @Override
    public String getDetails() {
        return "Saving Account Balance is :"+ balance;
    }
}
