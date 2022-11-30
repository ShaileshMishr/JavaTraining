package JavaBasics.src.Day6;

public class Sample {

    public static void main(String[] args) {
//        Integer i =new Integer(9);
//       int s = i+21;   // Autoboxing  : primitive to object
//
//        Integer i1 = new Integer('A');
//        System.out.println(i1.intValue());  // unboxing : object to primitive


        Student stud1 = new Student("Shailesh",101,'A');
        Student stud2 = null;
        try {
            stud2 = (Student) stud1.clone();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        stud2.setRollNo(11);
        System.out.println(stud1);
        System.out.println(stud2);
    }
}
