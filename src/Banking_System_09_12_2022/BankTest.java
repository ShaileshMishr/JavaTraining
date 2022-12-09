package JavaBasics.src.Banking_System_09_12_2022;

public class BankTest {

    public static void main(String[] args){

        BankObject obj = new BankObject();

       BankDemo b1 = new BankDemo(obj,"OPEN NEW ACCOUNT");
       BankDemo b2 = new BankDemo(obj,"DEPOSIT");
       BankDemo b3 = new BankDemo(obj,"WITHDRAW");
       BankDemo b4 = new BankDemo(obj,"CLOSE ACCOUNT");



    }
}
