package JavaBasics.src.FridayTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneBookTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PhoneBook phone = new PhoneBook();
        PhoneBook allData = new PhoneBook();
        System.out.println("Enter 5 for quit .....");

        try {
        while (true) {
            System.out.println("Enter 1 for Add new contact, 2 for Delete , 3 for update , 4 for search , 5 for All Contacts and 6 for quit :");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter New Contact Name :");
                String contactName = sc.next();
                if (contactName.matches("^[a-zA-Z]*$*")){}
                else {
                    throw new InputMismatchException();
                }
                System.out.println("Enter Contact Number :");
                double contactNumber = sc.nextDouble();

                System.out.println("Enter Address :");
                String address = sc.next();


                    PhoneBook phoneBook = new PhoneBook(contactName, contactNumber, address);

                    phone.addContact(phoneBook);
                    System.out.println("Contact Added Successfully");

                } else if (ch == 2) {
                    System.out.println("Enter contact number which you want to delete :");
                    double contactNumber = sc.nextDouble();
                    PhoneBook phoneBook = phone.getContact(contactNumber);
                    phone.deleteContact(phoneBook);
                    System.out.println("Contact Deleted Successfully");
                } else if (ch == 3) {

                System.out.println("enter the index of the contact number which you want to update :");
                int index = sc.nextInt();

                System.out.println("enter your choice to Update 1:Phone number 2:Name");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter your New phone Number to update :");
                        double newContactNumber = sc.nextDouble();
                        phone.updateContactViaNumber(newContactNumber, index);
                        System.out.println("Contact Number updated Successfully.....");
                        break;
                    case 2:
                        System.out.println("Enter your new Name to update :");
                        String newContactName = sc.next();
                        phone.updateContactViaName(index, newContactName);
                        System.out.println("Contact Name updated Successfully.....");
                        break;
                }

                } else if (ch == 4) {
                    System.out.println("Enter contact number which you want to search :");
                    double contactNumber = sc.nextDouble();
                    PhoneBook phoneBook = phone.getContact(contactNumber);
                    System.out.println(phoneBook);

                } else if (ch == 6) {
                    System.out.println("Program Ended ......");
                    break;

                }
            else if (ch == 5) {
                for(PhoneBook alldata : phone.getPhoneBookList()) {

                        System.out.println(alldata);

                }

            }else {
                    ch = 1;
                }
            }

        } catch (InputMismatchException | NumberFormatException  e) {
            if(e instanceof NumberFormatException)
                System.out.println("NumberFormat Exception");
            else if(e instanceof InputMismatchException)
                System.out.println("Input Format is wrong");

        }


    }
}
