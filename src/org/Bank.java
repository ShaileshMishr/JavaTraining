// Simulate a banking application where multiple accounts can be created a user can do following activities:
//Open a new account
//Deposit money to an account
//Withdraw money from the account
//Close the account

package JavaBasics.src.org;

public class Bank {

    private String AccHolderName;
    private int AccNo;
    private String AccType;
    private double balance;

    public Bank(String accHolderName, int accNo, String accType, double balance) {
        AccHolderName = accHolderName;
        AccNo = accNo;
        AccType = accType;
        this.balance = balance;
    }

    public Bank() {

    }

    public String getAccHolderName() {
        return AccHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        AccHolderName = accHolderName;
    }

    public int getAccNo() {
        return AccNo;
    }

    public void setAccNo(int accNo) {
        AccNo = accNo;
    }

    public String getAccType() {
        return AccType;
    }

    public void setAccType(String accType) {
        AccType = accType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
