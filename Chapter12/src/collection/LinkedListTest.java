//LinkedList는 삽입이랑 삭제는 ArrayList보다 빠르므로 이럴때 주로 사용
//중간 중간에 데이터를 삽입할 때 LinkedList를 사용

package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<String>();
		
		//여기에서 출력값은 요소 자체가 toString은 아니라 기본 toString인 
		//LinkedList 클래스 자체 toString만 구현이 됨(vector toString형태)
		myList.add("A");
		myList.add("B");
		myList.add("C");
	
		System.out.println(myList);
		
		//ArrayList와 다르게 추가하면 추가한 만큼 자리수가 늘어남
		//ArrayList는 추가해도 전체 자리수는 보존이 됨
		myList.add(1, "D"); //1번 자리에 "D" 추가
		System.out.println(myList);
		
		myList.addFirst("0"); //첫번째 자리에 "0" 추가
		System.out.println(myList);
		
		System.out.println(myList.removeLast()); //제일 마지막 자리에 있는 삭제할 요소만 출력
		System.out.println(myList); //제거 후 전체 출력
	}

}
