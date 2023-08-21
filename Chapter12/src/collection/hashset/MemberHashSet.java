package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {

		private HashSet<Member> hashSet;

		public MemberHashSet() {
			hashSet = new HashSet<Member>();
		}
		public void addMember(Member member) {
			hashSet.add(member);
		}

		public boolean removeMember(int memberId) {
		
			//set인터페이스는 순서 및 위치(index)가 없어서 for문을 못 써서 while를 가져옴
			Iterator<Member> iterator = hashSet.iterator();
			while(iterator.hasNext()) {
				Member member = iterator.next();
				
				int tempId = member.getMemberId();
				if(memberId == tempId) {
					hashSet.remove(member);
					return true;
				}
			}
			
			System.out.println(memberId + "가 존재하지 않습니다.");
			return false;
		}
		public void showAll() {
			for(Member member : hashSet) {
				System.out.println(member);
			}
				System.out.println();
		}
}
