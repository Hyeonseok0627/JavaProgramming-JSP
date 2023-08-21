package collection;

//상속에서는 extends를 하면 상속 상위클래스의 추상 매서드를 하위클래스에서 재정의(오버라이드)하여 해당 매서드를 구현 안 해주면 에러가 뜸
//인터페이스에서도 implements를 하면 해당 인터페이스의 매서드를 재정의(오버라이드)하여 구현해주지 않으면 에러가 뜸
//재정의를 안하면 상위클래스, 인터페이스의 매서드를 구현을 못하므로, 재정의를 해야됨 / 단, integer,string 클래스는 자동적으로 매서드들이 재정의되어있어, 따로 재정의 안해도 사용 가능

//Comparable 인터페이스 구현
public class Member implements Comparable<Member> {

//public class Member {

	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
	
	
	//Member 클래스에 equals(),hashCode() 매서드 재정의하여
	//회원 아이디가 같으면 같은 회원임을 구현하여 요소 중복허용하지않는 hashset 인터페이스 구현
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//obj instanceof Member : obj가 Member인지 아닌지 판별
		//instanceof: 해당 연산자는 어느 객체 변수가 어느 클래스 타입인지 판별해 true/false를 반환
		//사용시 주의할 점은 instanceof 연산자는 객체에 대한 클래스(참조형) 타입에만 사용할 수 있다는 점
		if(obj instanceof Member) {
			Member member = (Member)obj; //다운캐스팅
			if(this.memberId == member.memberId)
				return true;
			else
				return false;
		}
		return false;	
	}
	
	//Comparable 인터페이스 구현(compareTo()매서드 재정의)
	@Override
		public int compareTo(Member member) {
			// TODO Auto-generated method stub
		//this.memberId: 새로 추가한 회원 아이디, member.memberId: compartTo() 매서드의 매개변수로 전달된 회원 아이디
			return (this.memberId - member.memberId); //오름차순 정렬
		  //return (this.memberId - member.memberId) *(-1); //내림차순 정렬
	}
}
