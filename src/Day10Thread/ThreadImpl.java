package JavaBasics.src.Day10Thread;

public class ThreadImpl {
    public static void main(String[] args){

        new ThreadDemo1();

        try{
            for (int i = 1; i < 6; i++) {
                System.out.println("Main thread: " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread Exiting...");
    }
}
