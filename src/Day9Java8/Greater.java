package JavaBasics.src.Day9Java8;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Greater {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a1 = sc.nextInt();
        System.out.println("Enter second number :");
        int a2 = sc.nextInt();
        System.out.println("Enter Number for check number is odd or not :");
        int a3 = sc.nextInt();

        Consumer<String> con = n -> System.out.println(n);
        con.accept("Hello");

        Predicate<Integer> obj1 = x -> x%2 != 0;

        System.out.println(obj1.test(a3));

        GreaterInterface obj = (a, b) -> {
            if (a > b) {
                return a;
            }
        else{
                return b;
            }
        };

        System.out.println("Greater number is :"+obj.getGreater(a1,a2));
    }
}
// A Functional Interface is an Interface which allows only one Abstract method within the Interface scope.
// There are some predefined functional interface in Java like Predicate, consumer, supplier etc.

// Inbuilt Functional Interface
// Predicate : In mathematics, a predicate is commonly understood to be a boolean-valued function 'P:X ? {true, false}', called the predicate on X.
// Consumer :  It is a functional interface defined in java.util.function package. It contains an abstract accept() and a default andThen() method.
// It can be used as the assignment target for a lambda expression or method reference.

// java.util.function