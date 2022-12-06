package JavaBasics.src.Day10Thread;

public class ThreadDemo4Main {

    public static void main(String[] args) {


        new ThreadDemo4("ADD");
        new ThreadDemo4("SUBTRACT");
        new ThreadDemo4("MULTIPLY");

        try{

            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread Exiting...");

    }
    }
