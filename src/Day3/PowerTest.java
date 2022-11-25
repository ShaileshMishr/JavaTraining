package JavaBasics.src.Day3;
import java.util.Scanner;
public class PowerTest {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Power Type :");
        String connection = sc.next();
        System.out.println("Enter Unit :");
        int u = sc.nextInt();

        Power power = new Power();
        power.setUnit(u);
        power.setPowerConnection(connection);

        if(connection.equalsIgnoreCase("Domestic")) {
            System.out.println(power.domesticPrice());
        }
        if(connection.equalsIgnoreCase("Industrial")) {
            System.out.println(power.industrialPrice());
        }
        else {
            System.out.println("Wrong Connection Type");
        }

       //domesticPrice dp = new dome

       // power.domesticPrice()




        }
}
