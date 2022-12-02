package JavaBasics.src.Day8;
import JavaBasics.src.Day7.Student1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MemberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Library lib = new Library();
        System.out.println("Enter 5 to quit ");
       //  List<Member> members = new ArrayList<>();

        while (true) {
            System.out.println("Enter 1 for Add new member, 2 for Delete , 3 for Search and 5 for quit :");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter member Id :");
                int memberId = sc.nextInt();
                System.out.println("Enter member name :");
                String memberName = sc.next();
                System.out.println("Enter Address :");
                String Address = sc.next();

                Member member = new Member(memberId,memberName,Address);

                // lib.addMember(memberId,memberName,Address);

                lib.addMember(member);
                System.out.println("Member Added Successfully");


            }

            else if (ch == 2) {
                System.out.println("Enter member Id which you want to delete :");
                int memberId = sc.nextInt();
                Member member= lib.getMember(memberId);
                lib.deleteMember(member);
                System.out.println("Member Deleted Successfully");
                //  lib.RemoveMember(memberId);

            }
            else if (ch == 3) {
                System.out.println("Enter member Id which you want to search :");
                int memberId = sc.nextInt();
                Member member = lib.getMember(memberId);
                    System.out.println(member);

                //  lib.SearchMember(memberId);

            }
            else if(ch==5){
                System.out.println("Program Ended ......");
                break ;

            }
            else {
                ch=1;
            }

            }
        }

    }

