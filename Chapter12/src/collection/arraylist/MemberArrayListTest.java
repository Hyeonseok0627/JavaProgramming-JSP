package collection.arraylist;

import collection.Member; //외부 패키지에 있는 Member 클래스를 불러오도록 하는 것

public class MemberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
	    memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
//		memberArrayList.insertMemeber(memberLee); //나혼자코딩 내용
		
		memberArrayList.showAll();
		
		//memberArrayList.removeMember(memberHong.getMemberId());
		//나혼자코딩 내용
		//memberArrayList.insertMember(memberHong, 0);
		memberArrayList.showAll();
	}

}
