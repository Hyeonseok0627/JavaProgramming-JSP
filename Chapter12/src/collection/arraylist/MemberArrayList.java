package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member; //Member 클래스는 collection 패키지인 외부에 있으므로 import함

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	public void addMember(Member member) {
		arrayList.add(member); //index가 없기 때문에 제일 마지막에 넣는 방식이 됨
	}
	
	//나혼자코딩 내용
//	public void insertMemeber(Member member, int index) {
//		arrayList.add(index, member); //자신이 원하는 순서에 넣을 수 있는 것
//	}
	
	//remove 매서드 : 일렬로 배열되어 있는 데이터에서 순서대로 하나씩 빼서
	//해당 변수를 비교해가며 맞는 것 나올때까지 반복한 후 나오면 삭제하는 매서드
	public boolean removeMember(int memberId) {
	
		for(int i = 0; i < arrayList.size(); i++ ) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();//getMemberId() : MemberId를 가지고 오는 매서드
			//회원아이디가 매개변수와 일치하면 해당 회원 삭제, true로 반환
			if(memberId == tempId) {
				arrayList.remove(i); //i : index를 의미
				return true;
			}
		}
		
		//위에 반복문 대신 사용할 수 있는 iterator
		//iterator는 순서가 없는 set 인터페이스의 클래스에 사용됨
		//순서가 없는 클래스에선 for문과 get을 못 써서 반복을 못 시킴
		//그래서 iterator를 써서 각 요소를 순회하게 해서 반복을 시키는 것
		/*Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				arrayList.remove(member);
				return true;
			}
		}*/
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	public void showAll() {
		//향상된 for문
		for(Member member : arrayList) {
			System.out.println(member);
		}
			System.out.println();
		// 'member'의 toString이랑 vector의 toString이 함께 출력됨 
		// 'member'의 toString 결과: 이순신 회원님의 아이디는 101입니다. 이런 종류
		// vector의 toString 결과: [member 요소1, 요소2, 요소3] 이렇게 [, ,] 이런식으로 나옴
		// ArrayList 클래스에는 이미 toString이 반영이 되어 있음(vector toString 형식)
		//System.out.println(arrayList); 
	}
}
