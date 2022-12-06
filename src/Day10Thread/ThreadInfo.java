package JavaBasics.src.Day10Thread;

public class ThreadInfo {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread is "+t);
        t.setName("demo thread");
        System.out.println("New Name of the thread is :"+t);
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread is exiting....");
    }
}

// There are two ways two create thread
// 1. By Implementing Runnable Interface
// 2. By extending Thread class