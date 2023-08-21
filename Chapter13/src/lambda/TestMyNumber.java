package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		//MyNumber 인터페이스의 max 클래스
		/*(x, y) ->{
			if (x>=y) return x;
			else return y;}*/
		//람다식 구현한게 위에 형식이고 이것을 더 간단하게 쓴 표현이 밑에 형태
		MyNumber max = (x, y)->(x>= y)? x:y; // 람다식을 인터페이스 자료형 max 변수에 대입

		System.out.println(max.getMax(10, 20));// 인터페이스 자료형 변수로 함수 호출
		
	//	MyNumber max2 = (x, y)-> x>=y ?x:y;
	//	System.out.println(max2.getMax(10, 20));
	}
}
