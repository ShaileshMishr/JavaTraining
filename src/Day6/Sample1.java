package JavaBasics.src.Day6;

import java.io.FileOutputStream;
import java.io.IOException;

public class Sample1 {
    public static void main(String[] args) throws IOException {
       // System.err.println("An error occured");
        FileOutputStream out = new FileOutputStream("output.txt");
        String str = "Writing to a file";
        byte[] data = str.getBytes();
        out.write(data);
        out.close();
        System.out.println("Successfully Written to file");

//        int i;
//        while((i = System.in.read()) != -1) {
//            System.out.print((char) i);
//        }
    }

}

// Input/Output in Java
// Standard IO: System.out., System.in, System.err
// Stream: Sequence of data in bytes
// OutputStreams: where the data will be written (Target)
// InputStream: from where the data will be read (Source)
// FileOutputStream