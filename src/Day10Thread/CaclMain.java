package JavaBasics.src.Day10Thread;

public class CaclMain {

    public static void main(String[] args) throws InterruptedException {

        Calculation c1 = new Calculation("FIRST");
        c1.t.join();
        Calculation c2 = new Calculation("SECOND");
        c2.t.join();


        try {

//            c1.t.join();
//            c2.t.join();

            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main Thread Exiting...");

    }
}
