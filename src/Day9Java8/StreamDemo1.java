 // create a Stream of String Collection and filter all the names that start with 'S'
// and then append 'Moris' to all those names and then display

package JavaBasics.src.Day9Java8;

 import java.util.Arrays;
 import java.util.List;
 import java.util.stream.Collectors;
 import java.util.stream.Stream;

 public class StreamDemo1 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Shailesh","Viaks","Gaurav","Suyash");

        names.stream().filter(n->n.startsWith("S") || n.startsWith("s")).map(x->x+" Moris").sorted().forEach(System.out::println);


    }
}
