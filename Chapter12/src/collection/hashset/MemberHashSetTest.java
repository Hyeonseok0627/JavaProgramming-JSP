package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAll();
		
		Member memberHong = new Member(1003, "홍길동");
		memberHashSet.addMember(memberHong);
		//HashSetTest 클래스에서는 중복값이 안나오고, 여기에선 나오는 이유
		//HashSetTest 클래스에서는 String 클래스(해당 클래스는 객체가 동일한 경우에 중복값 적용안하는 HashSet이 이미 적용됨)
		//즉, String 클래스는 이미 equals(),hashCode() 매서드 재정의가 되어 있어 hashSet 인터페이스가 바로 적용이 된 것
		//Member 클래스는 미리 HashSet이 적용이 안되서 중복값이 나옴
		//Member 클래스에서 equals(),hashCode() 매서드 재정의를 하면 hashSet 인터페이스 구현되어 중복값 허용안함
		memberHashSet.showAll();
		
	}

}
