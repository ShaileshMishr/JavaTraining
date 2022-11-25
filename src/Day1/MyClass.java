package JavaBasics.src.Day1;    // Package in Java is like a folder in windows which will resolved any namespace conflicts.

import java.util.Scanner;

public class MyClass {   //Java class
    public static void main(String[] args) {   //Entry point for any java application

        Student stud1 = new Student();
        Student stud2 = new Student();

        Student.collegeName = "BBDITM";

        stud1.setStudName("Shailesh");
        stud1.setRollNo(101);
        stud1.setGrade('A');

        stud2.setStudName("Kishan");
        stud2.setRollNo(102);
        stud2.setGrade('B');

        System.out.println(stud1.getStudName());

//        MyClass m1 = new MyClass();
//        m1.getMessage();

        // String name1 = args[0];

      /*  Scanner sc = new Scanner(System.in);

        System.out.println("Enter name :");
        String name = sc.next();

        System.out.println("Enter age :");
        int age = sc.nextInt();

        System.out.println("Entered name is " + name + " " + "and age is " + age); */

//        int i = 89;
//        byte b = (byte)i; // Explicit  type conversion/ casting
//
//        String message = "This is my first java code ";  // Non primitive
//
//        Student stud1 = new Student();  // Non primitive - Reference type
//
//        System.out.println("Hello World");

    }


//        public void getMessage () {
//            System.out.println("Calling a method from main class");
//        }


    }




// JVM : Convert the bytecode to machine understandable code, memory management
// JRE : Java Runtime Environment: Provide you all the runtime libraries to run your code.
// JDK : Java Development Kit : Provides an environment to develop our java code.
// Type of variables
// Data types: primitives and non primitives
// Types of languages
// Java Architecture
// Access specifiers
// Java bean standard : getter and setters
// methods and how to access methods using objects


// 1- Create a java class and add two numbers inside main method and show the result