package JavaBasics.src.Day2;

public class AccountFactory {

    public static Account getAccount(String accountType) {
        Account account = null;
        if (accountType.equalsIgnoreCase("saving")) {
            account = new SavingAccount(1000);
        }
        else {
            account = new CheckingAccount(5000);
        }
        return account;
    }
}
