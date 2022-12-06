package JavaBasics.src.Day10Thread;

public class TableObject {

    synchronized void tableMethod(String threadName) {

        try{
            if(threadName.equalsIgnoreCase("FIRST")){
                int a = 5;
                System.out.println("Table of 5 is :");
                for (int i = 1; i < 11; i++) {
                    Thread.sleep(2000);
                    System.out.println(i+"*"+"5"+"="+(a * i));

                }

                System.out.println("Table of 5 Exiting....");
                Thread.sleep(5000);

            }
            if(threadName.equalsIgnoreCase("SECOND")){
                int b = 8;
                System.out.println("Table of 8 is :");

                for (int i = 1; i < 11; i++) {
                    Thread.sleep(2000);
                    System.out.println(i+"*"+"8"+"="+(b * i));
                }
                System.out.println(" Table of 8 Exiting....");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
