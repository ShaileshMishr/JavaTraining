 // Create a method with variable arguments where if no parameter is passed
// then a welcome message will be displayed.
// for single parameter: add 10 and display
// for two parameters: average of the numbers
// for three parameters: sum of the numbers

package JavaBasics.src.Day9Java8;

public class Sample2 {

    public static void main(String[] args) {
        Sample2 obj = new Sample2();
        obj.getParam();
        obj.getParam(3);
        obj.getParam(2,4);
        obj.getParam(3,6,1);

    }

    void getParam(int... value) {
        if (value.length == 0)
            System.out.println("Welcome");

        else if (value.length==1)
            System.out.println("Addition of 10 in a number:"+value[0]+10);

        else if (value.length==2)
            System.out.println("Avg :"+((value[0]+value[1])/ value.length));

        else if (value.length==3)
            System.out.println("Sum of all 3 no: "+value[0]+value[1]+value[2]);

    }

}