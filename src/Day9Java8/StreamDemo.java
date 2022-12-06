package JavaBasics.src.Day9Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 4, 55, 6, 7,8,3);
        Stream<Integer> numbersStream = numbers.stream(); // This will create streams for numbers collection

       // numbersStream.filter(x-> x%2==0).map(x->x*10).sorted().forEach(n->System.out.println(n));
       numbersStream.filter(x-> x%2==0).map(x->x*10).sorted().forEach(System.out:: println);

      // List<Integer> sortedNumbers = numbersStream.filter(x->x%2==0).map(x->x*10).sorted().collect(Collectors.toList());



    }
}