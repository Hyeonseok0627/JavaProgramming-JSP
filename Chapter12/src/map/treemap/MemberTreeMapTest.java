package map.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		Member memberPark = new Member(1003, "박서훤");
		Member memberLee = new Member(1001, "이지원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberSon = new Member(1002, "손민국");

		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);
	
		memberHashMap.showAll();
		
		//key값으로 쓰인 회원 아이디는 Integer형이라 이미 equals(), hashcode() 매서드가 재정의되어 있음
		memberHashMap.removeMember(1004); //회원 아이디가 1004인 회원 삭제
		memberHashMap.showAll();
	}
}
