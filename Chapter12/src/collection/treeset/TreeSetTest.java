package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//treeSet : 중복 허용하지않고, 자동으로 정렬을 해줌
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		
		
		//treeSet 클래스는 오름차순으로 정렬이 된다는 것을 확인 가능
		//treeSet 클래스의 데이터를 읽는 순서는 왼쪽 자식 노드 -> 부모 노드 -> 오른쪽 자식 노드 순으로 읽어감(이렇게 해서 전체 숫자데이터는 오름차순으로 출력)
		//treeSet 클래스 데이터를 읽는 방식은 문자열인 경우에는 첫자부터 ㄱㄴㄷ~순으로 정렬하고, 그 뒤에는 두번째 글자를 ㄱㄴㄷ~순으로 정렬하는 이런 방식으로 진행  
		TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
		treeSet2.add(23);
		treeSet2.add(10);
		treeSet2.add(48);
		treeSet2.add(15);
		treeSet2.add(7);
		treeSet2.add(22);
		treeSet2.add(56);
		
		for(int i : treeSet2) {
			System.out.print(i + ","); //print : 가로로 정렬 , println : 세로로 정렬
		}
		
	}

}
