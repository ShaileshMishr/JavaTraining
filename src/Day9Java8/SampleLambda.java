//Write lambda expressions that will return BiPredicate, Supplier, IntConsumer, DoubleFunction

package JavaBasics.src.Day9Java8;

import java.util.function.BiPredicate;
import java.util.function.DoubleFunction;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class SampleLambda {

    public static void main(String[] args) {

        //BiPredicate:  It operates on two objects and returns a predicate value based on that condition
        BiPredicate<Integer,Integer> bi = (x,y) -> {
            if(x==y){
                return true;
            } else {
                return false;
            }
        };
        System.out.println(bi.test(12,12));

        // Supplier:  It represents a function which does not take in any argument but produces a value of type T.
        // T: denotes the type of the result
       // Supplier is a functional interface whose functional method is get(). The Supplier interface represents
        // an operation that takes no argument and returns a result.

       Supplier<Double> sup = () -> Math.random();
               System.out.println(sup.get());

       // IntConsumer: Represents an operation that accepts a single int -valued argument and returns
        // no result. This is the primitive type specialization of Consumer for int .

        IntConsumer in = a -> System.out.println(a);
        in.accept(5);

        // DoubleFunction : It represents a function which takes in a double-valued argument
        // and produces a result of type R.
        //R: denotes the type of the output of this function
        // The lambda expression assigned to an object of DoubleFunction type is used to define
        // its apply() which eventually applies the given operation on its only argument.
        // It is similar to using an object of type Function<Double, R>.

        DoubleFunction<Integer> df = b -> (int)(b*10);
                System.out.println(df.apply(3.6));

//        DoubleFunction<Integer> ob = a -> (int)(a * 10);
//        System.out.println(ob.apply(3.2));
    }

    }
