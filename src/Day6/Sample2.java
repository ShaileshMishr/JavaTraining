package JavaBasics.src.Day6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sample2 {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your dob (dd-MM-yyyy) : ");
        String dob = sc.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(dob);
        System.out.println("Converting to : yyyy-MM-dd ");
        String newFormat = new SimpleDateFormat("yyyy-MM-dd").format(date);
        System.out.println(newFormat);
    }
}
