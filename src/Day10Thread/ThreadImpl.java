package JavaBasics.src.Day10Thread;

public class ThreadImpl {
    public static void main(String[] args){

     // new ThreadDemo1();
      //  new ThreadDemo2();

        ThreadDemo3 t1 = new ThreadDemo3("ONE");
        ThreadDemo3 t2 = new ThreadDemo3("TWO");
        ThreadDemo3 t3 = new ThreadDemo3("THREE");

        System.out.println("Thread one is alive:"+t1.t.isAlive());
        System.out.println("Thread two is alive:"+t2.t.isAlive());
        System.out.println("Thread three is alive:"+t3.t.isAlive());
        try{

               System.out.println("Waiting for child thread to finish...");
               t1.t.join();  // Will let the t1 thread to finish before the other one start.
               t2.t.join();
               t3.t.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread one is alive:"+t1.t.isAlive());
        System.out.println("Thread two is alive:"+t2.t.isAlive());
        System.out.println("Thread three is alive:"+t3.t.isAlive());

        System.out.println("Main Thread Exiting...");
    }
}
