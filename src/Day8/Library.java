 // Another class as Library: library will have collection of Members and features like add a member,
// delete a member, or search for a member based on memberId. Lastly create a tester class with main
// method where you can test below functionalities: "Add new member", "Remove a member", "Search for a member"

package JavaBasics.src.Day8;

import java.util.ArrayList;
import java.util.List;

public class Library {
      //  List<Member> members = new ArrayList<>();

    private List<Member> memberList = new ArrayList<>();

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public void addMember(Member member) {

        memberList.add(member);

    }

    public void deleteMember(Member member) {
        memberList.remove(member);

    }

    public Member getMember(int id) {
        boolean flag=false;
        Member searchedMember= new Member();
        for(Member member :memberList) {
            if(member.getMemberId()==id){
                searchedMember=member;
                flag=true;
            }

    }
        if(flag) {
            return searchedMember;
        }

//        else if (memberList.isEmpty()) {
//            System.out.println("Member ID IS Invalid");
//        }
            else {
            return null;
        }
//    public void addMember(int memberId, String memberName, String Address){
//            Member m1 = new Member(memberId, memberName, Address);
//            members.add(m1);
//        }
//
//        public int RemoveMember(int memberId) {
//            members.remove(memberId);
//            return 1;
//        }
//
//        public int SearchMember(int memberId) {
//            if(members.contains(memberId)){
//                return 1;
//            } else {
//                return 0;
//            }


        }
}