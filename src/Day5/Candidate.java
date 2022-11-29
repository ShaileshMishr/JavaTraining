// create a Candidate class with name, gender and salary field. name should have only alphabets
// or else it will throw "InputMismatchException", gender should be 'M' or 'F' or else it will also
// throw "InputMismatchException" and if the salary is less than 10000, it will throw user defined
// "InvalidSalaryException" with a message that "Salary can not be less than 10000"

package JavaBasics.src.Day5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Candidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Candidate name:");
        String name = sc.next();

        try {
            if (name.matches("^[a-zA-Z]*$*")) {
            } else {
                throw new InputMismatchException();
            }

//        catch (InputMismatchException e) {
//            System.out.println("InputMismatchException");
//            }

            System.out.println("Enter Candidate gender:");
            String gender = sc.next();
            //  try {
            if (gender.contains("M")) {
            } else if (gender.contains("F")) {
            } else {
                throw new InputMismatchException();
                //  }
            }
//        catch (InputMismatchException e) {
//            System.out.println("InputMismatchException");
//        }

            System.out.println("Enter Candidate Salary:");
            double salary = sc.nextDouble();
            //    try {
            if (salary < 10000) {
                throw new InvalidSalaryException("Salary can not be less than 10000");
                // }
            }
//        catch (InvalidSalaryException e) {
//            System.out.println("InvalidSalaryException");
//            System.out.println(e.getMessage());
//        }
        }
        catch(InputMismatchException | InvalidSalaryException e) {
            if(e instanceof InputMismatchException)
                System.out.println("InputMismatchException");
            else if(e instanceof InvalidSalaryException ) {
                System.out.println("InvalidSalaryException");
             System.out.println(e.getMessage());
            }
        }
        finally {
            System.out.println("Completed .....");
        }


        }

    }

