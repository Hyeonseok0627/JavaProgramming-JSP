package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memberArrayList = new MemberArrayList();
		Member lee = new Member(1001, "이지원");
		Member son = new Member(1002, "손민국");
		Member park = new Member(1003, "박서훤");
		Member hong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(lee);
		memberArrayList.addMember(son);
		memberArrayList.addMember(park);
		memberArrayList.addMember(hong);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(hong.getMemberId());
		memberArrayList.showAllMember();
		
		memberArrayList.insertMember(hong, 0);
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember2(1004);
		memberArrayList.showAllMember();
	}

}














