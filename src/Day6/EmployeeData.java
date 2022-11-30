package JavaBasics.src.Day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeData {

    public static void main(String[] args) throws IOException {

        String line = "";
        BufferedReader reader = new BufferedReader(new FileReader("data.csv"));
        while((line= reader.readLine())!=null){

            String[] employee = line.split(",");
            System.out.println("Employee[FirstName ="+employee[0]+",LastName = "+employee[1]+
                    ",Designation = "+employee[2]+ ",Phone Number = "+employee[3]+ ",Salary = "+employee[4]+
                    ",Address = "+employee[5]);
        }
    }
}
