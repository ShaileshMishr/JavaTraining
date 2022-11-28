package JavaBasics.src.Day4;

public class Sam1 {
    public static void main(String[] args) {
        String msg = "Hello";  // String are immutable : cannot be changed once created

       // msg.concat("There");
        // System.out.println(msg); output == Hello

        msg=msg.concat("There");
        System.out.println(msg);  // HelloThere
    }
}
