package JavaBasics.src.Day10Thread;

public class Producer implements Runnable{

    MyQueue q;

    Producer(MyQueue q){
        this.q=q;
        Thread t1 = new Thread(this,"Producer");
        t1.start();
    }

    @Override
    public void run() {
        int i=0;
        while (true){
            q.put(i++);
        }

    }
}
