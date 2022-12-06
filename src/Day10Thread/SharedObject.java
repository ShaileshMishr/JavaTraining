package JavaBasics.src.Day10Thread;

public class SharedObject {

    synchronized void sharedMethod(String str) {
        System.out.print("[");
        System.out.print(str);
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();

        }
        System.out.print("]");
        System.out.println();
    }
}


//[Sprit]
//[Of]
//[ABC]
