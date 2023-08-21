package string;

//<String 선언방법>
//String str1 = new String("abc"); //new로 하면 힙메모리에 저장 (힙메모리 안에 서로 다른 인스턴스 주소로 저장)
//String str2 = new String("abc");
////그래서 위에 방식은 '=='로 출력하면 주소를 비교하게 되니 false, 'equals'로 출력하면 값만 비교하게 되니 true
//
//String str3 = 'abc'; //상수풀에 저장 (둘다 상수풀이라는 동일한 주소에 저장)
//String str4 = 'abc';
////위에 방식은 '=='로 출력하면 주소를 비교하게 되니 true, 'equals'로 출력하면 값만 비교하니 true


public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc");
		String str2 = new String("abc");
	
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}

}
