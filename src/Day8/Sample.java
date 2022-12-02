package JavaBasics.src.Day8;

import JavaBasics.src.Day7.Employee;
import JavaBasics.src.Day7.Student;

import java.util.*;

public class Sample {
    public static void main(String[] args) {

        // Linked List
        List<String> nameList = new LinkedList<String>();

        nameList.add("Kishan");
        nameList.add("Ram");
        nameList.add("Gaurav");

        nameList.add(2,"Suyash");

        System.out.println("Linked List here .....");
        for(String name:nameList) {
            System.out.println(name);
        }

        // Map
        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"One");
        myMap.put(2,"Two");
        myMap.put(3,"Three");
        myMap.put(4,"Four");

        System.out.println("Map is here .....");
       // System.out.println(myMap.get(3));

        for(Map.Entry<Integer,String> entry : myMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key is :"+key+ "Value is : "+value);

        }

        System.out.println("Map for Employee object  .....");
        Employee emp1 = new Employee(111,"Shailesh",21,50000);
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(emp1.getEmpId(), emp1);

        System.out.println(employeeMap.get(111));

        System.out.println("Map for student object .....");

        Student student1 = new Student("Rohan", 27,'A');
        Student student2 = new Student("Priya", 28,'B');
        Student student3 = new Student("John", 22,'C');

        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Map<Integer, List<Student>> studMap = new HashMap<>();

        studMap.put(27, studentList);

        System.out.println(studMap);

    }
        }

