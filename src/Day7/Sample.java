package JavaBasics.src.Day7;

import java.util.*;

public class Sample {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();


        names.add(new String("Shailesh"));
        names.add(new String("Kishan"));
        names.add(new String("Shailesh"));
        names.add(new String("Vikas"));

       // String[] namesStr = (String[]) names.toArray();  // convert to array
       List<Integer> num = Arrays.asList(2,3,4,5,6);

       for (String name : names) {
            System.out.println(name);
        }

        List<Student> students = new ArrayList<>();
         // Set<Student> students = new TreeSet<>();
          //  Set<Student> students = new HashSet<>();

            students.add(new Student("Adam", 21, 'A'));
            students.add(new Student("Pete", 23, 'B'));
            students.add(new Student("Katie", 25, 'C'));
            students.add(new Student("Adam", 21, 'A'));

            Collections.sort(students);
            for (Student student : students) {
                System.out.println(student);
            }

        List<String> items = new ArrayList<>();
            items.add("Laptop");
            items.add("Desktop");
            items.add("Mouse");
            items.add("Laptop");

            items.add(2,"Keyboard");
            System.out.println("Removed item is: "+items.remove(1));


            items.set(3,"Mic");  // for replacing the value

            for(String item: items) {
                System.out.println(item);
            }

         //   System.out.println(items.get(2));

                // Set names = new HashSet();
//        names.add("Shailesh");
//        names.add(101);
//        names.add('A');
//        names.add(true);
//        names.add(new Student());

//        Iterator itr = names.iterator();
//        while(itr.hasNext()){
//
//           // System.out.println(itr.next());
//            String str = itr.next();

                //  String str = (String) itr.next();

            }
        }

// We should not put heterogeneous data in a collection.
// Generics are compile time type safety
