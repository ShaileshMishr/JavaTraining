package JavaBasics.src.Day10Thread;

public class ThreadDemo2 extends Thread{

    ThreadDemo2() {
        super("Demo Thread 2");
        System.out.println("Child Thread "+this);
        start();
    }

    public void run() {
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("Child thread: " + i);
                Thread.sleep(2000);  // Go to Sleep state : waiting
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child Thread Exiting....");
    }
}
