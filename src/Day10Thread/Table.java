//Use synchronized method to display table of 5 and table of 8 in the same way that we did in last example

package JavaBasics.src.Day10Thread;

public class Table implements Runnable{

    String threadName;
    TableObject obj;
    Thread t;

    public Table(TableObject obj , String threadName) {
        this.obj = obj;
        this.threadName = threadName;
        t=new Thread(this,this.threadName);
        t.start();
    }

    @Override
    public void run() {
        obj.tableMethod(threadName);
    }
}
