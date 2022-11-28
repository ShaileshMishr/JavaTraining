package JavaBasics.src.Day4;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];

        String[] aNames = new String[5];

        System.out.println("Enter five names: ");

        for (int i=0;i<names.length;i++) {
            names[i]=sc.next();
        }

        // Nmaes start with a
        int k=0;
        for (int i=0;i<names.length;i++) {
            if(names[i].startsWith("A")){
                aNames[k]=names[i];
                k++;
            }
        }
        System.out.println("Length of new array :"+ aNames.length);

        System.out.println("All the names are : ");
        for(int i=0;i< aNames.length;i++){
            System.out.println(aNames[i]);
        }

//     System.out.println("All the names are : ");
//    for(int i=0;i< names.length;i++){
//        System.out.println(names[i]);
//    }

    }

}
