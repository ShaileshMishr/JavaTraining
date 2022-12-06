package JavaBasics.src.Day10Thread;

public class ThreadDemo3 implements Runnable{

    String threadName;
    Thread t;

    ThreadDemo3(String threadName) {
        this.threadName = threadName;
        t=new Thread(this,this.threadName);
        t.getName();
        System.out.println("Created Thread: "+t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 4; i++) {
                System.out.println("Child thread: " + i);
                Thread.sleep(1000);  // Go to Sleep state : waiting
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child Thread Exiting...."); // Thread is terminated


    }
}
