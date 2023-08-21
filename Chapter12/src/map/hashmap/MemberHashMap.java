package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {

	//Map은 요소가 두 개 : key, value 이며, value는 여러개라도 괜찮지만 key는 무조건 하나여야함(중복안됨)
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	//HashMap에 회원을 추가하는 매서드
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member); //put : 데이터 넣는 것 
	}
	
	//HashMap에서 회원을 삭제하는 매서드
	//고유하게 하나만 존재하는 key값인 memberId만 비교하면 되서, key값만 매개변수로 옴
	public boolean removeMember(int memberId) {
		// memberId라는 key의 객체가 hashMap 테이블에 있느냐를 판별
		// HashMap에 매개변수로 받은 키 값인 회원아이디가 있다면 'true'로 변환하면서 해당 회원 삭제
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId); //remove(): 제거하는 매서드
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	// Iterator를 사용하여 전체 회원을 출력하는 매서드
	// key와 value가 쌍으로 존재하는 것이라 향상된 for문은 사용불가(for문은 for(자료형 변수 : ~)이런 형태라 변수가 하나만 있어야 가능한데, 변수가 두 개이고 이에 따라 자료형도 두 개가 되는 것이라 하나로 정의를 못 내려서 에러가 뜸)
	
	public void showAll() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) { //다음 key가 있으면
			int key = ir.next(); //key값을 가져와서
			Member member = hashMap.get(key); //key로부터 value 가져오기
			System.out.println(member);
		}
		System.out.println();
	}
}
