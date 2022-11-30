package JavaBasics.src.Day6;

import java.io.*;

public class StudentSerialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student1 stud1 = new Student1("Shailesh",22,'A');

        FileOutputStream out = new FileOutputStream("serial");

        ObjectOutputStream objectOut = new ObjectOutputStream(out);

        objectOut.writeObject(stud1);

        objectOut.flush();
        objectOut.close();

        Student1 newStudent;
        FileInputStream in = new FileInputStream("serial");

        ObjectInputStream objectIn = new ObjectInputStream(in);

        newStudent = (Student1) objectIn.readObject();

        objectIn.close();
        System.out.println(newStudent);
    }
}
