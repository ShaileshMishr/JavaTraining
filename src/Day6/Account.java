// Create an account class with fields like account number, account name and balance and methods like deposit
// and withdraw. Need to create an object which will represent a day's transaction let say "Nov20Trans"
// you will then create 2 cloned objects that represent "Nov21Trans" and "Nov22Trans"

package JavaBasics.src.Day6;

public class Account implements Cloneable {

    public void daytransaction(int day) {
            System.out.println("Nov"+day+"Trans");
        }

    public double deposit(double deposit) {
        this.balance=balance+deposit;
        return balance;
    }

    public double withdraw(double withdraw) {
        this.balance=balance-withdraw;
        return balance;
    }

    private double accountNumber;
    private String accountName;
    private double balance;

    public Account(double accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Account() {

    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
