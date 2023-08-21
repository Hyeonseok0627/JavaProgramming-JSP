package object;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		
		//즉, 자료형 String, Integer의 값만 비교하고 싶을 때는 '==' 쓰는게 아닌 equals를 써야함(그래야 값만 비교하는 것이라 정확하게 나옴) true값이 나옴
		System.out.println(str1 == str2); //주소까지 같아야 true가 나옴
		System.out.println(str1.equals(str2)); //String 값만 비교하도록 하는것이라 true가 나옴, 그래서 String의 내용물만 비교하고싶을 때는 equals를 사용해야함
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		//비교 대상 둘다 직접값이면 '=='써도 됨
		//하지만 대상 하나라도 str1과 같이 변수값이면 'equals'를 써야함
		System.out.println(1 == 123);
		System.out.println("abc" == "abc");
		
		
//		<String 선언방법>
//		String str1 = new String("abc"); //new로 하면 힙메모리에 저장 (힙메모리 안에 서로 다른 인스턴스 주소로 저장)
//		String str2 = new String("abc");
//		//그래서 위에 방식은 '=='로 출력하면 주소를 비교하게 되니 false, 'equals'로 출력하면 값만 비교하게 되니 true
//		
//		String str3 = 'abc'; //상수풀에 저장 (둘다 상수풀이라는 동일한 주소에 저장)
//		String str4 = 'abc';
//		//위에 방식은 '=='로 출력하면 주소를 비교하게 되니 true, 'equals'로 출력하면 값만 비교하니 true
		
		//다른 클래스와는 달리 String클래스의 equals() 매서드는 재정의 안해도 문자열만 같아도 true가 나오는 이유는 미리 재정의되어 있어서이다.
		//다른 클래스들은 문자열과 주소가 둘다 동일해야 equals() 매서드가 true가 나오므로, 문자열만 같을 때 true가 나오도록 재정의를 하는 것
		//생성자 new를 만들면 두 개의 인스턴스는 같은 주소가 아닌 서로 다른 주소에 메모리가 저장됨
	}

}
