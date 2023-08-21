
// Member클래스가 Comparable 인터페이스를 구현하지않아 에러가 뜸
// 회원을 TreeSet에 추가할 때는 어떤 기준으로 비교할 것인지 구현해줘야 하고 이때 사용하는게 Comparable 인터페이스
// Member 클래스에 Comparable 인터페이스 구현 후에는 에러가 안뜸
package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1003, "박서훤");
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAll();
		
		Member memberHong = new Member(1003, "홍길동");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAll();

	}

}
