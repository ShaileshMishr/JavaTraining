package JavaBasics.src.Day9Java8;

public class LambdaDemo {

    public static void main(String[] args) {

//        LambdaDemo obj = new LambdaDemo();
//        obj.getSum(10,20);
        MyInterface obj = (a, b) -> {
            return a + b;  // Return type of a lambda expression is a functional interface
        };

        System.out.println("Sum of two numbers is : " + obj.getSum(20, 30)
        );

//    int getSum(int a, int b) {
//        return a+b;
//    }

        // when only one statement is there in the method, no need for the curly braces

    }
}

// Create a functional interface tht takes two numbers and return a number.
// Associate it with  lambda expression where you compare two numbers and return a greater one.
