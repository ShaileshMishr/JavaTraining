package JavaBasics.src.Day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("output.txt");
        int i =0;
        while((i=in.read())!=-1){
            System.out.print((char)i);
        }
    }
}
