// Create 2 threads as FIRST and SECOND the first thread calculates and displays table of 5
// while the second thread calculates and displays table to 8. every iteration of the table
// should take 2 seconds to display and once the first table is done, second table will start only after 5 seconds


package JavaBasics.src.Day10Thread;

public class Calculation implements Runnable{

    String threadName;
    Thread t;

    public Calculation(String threadName) {
        this.threadName = threadName;

        t= new Thread( this,this.threadName);
        t.start();
    }

    @Override
    public void run() {
        try {

        if(t.getName()=="FIRST") {
            int a = 5;
            System.out.println("Table of 5 is :");
            for (int i = 1; i < 11; i++) {
                Thread.sleep(2000);
                System.out.println(i+"*"+"5"+"="+(a * i));

            }

            System.out.println("Table of 5 Exiting....");
            Thread.sleep(5000);
        }
        if (t.getName() == "SECOND") {
                int b = 8;
                System.out.println("Table of 8 is :");

                for (int i = 1; i < 11; i++) {
                    Thread.sleep(2000);
                    System.out.println(i+"*"+"8"+"="+(b * i));
                }
                System.out.println(" Table of 8 Exiting....");
            }

            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

