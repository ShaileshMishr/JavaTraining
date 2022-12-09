package JavaBasics.src.Banking_System_09_12_2022;

import java.util.Scanner;

public class BankDemo implements Runnable {


    String bank;
    BankObject obj;
    Thread t;

    public BankDemo(BankObject obj, String bank) {
        this.obj = obj;
        this.bank = bank;
        t=new Thread(this,this.bank);
        t.start();

    }

    @Override
    public void run() {
    obj.BankMethod(bank);
    }

        }

