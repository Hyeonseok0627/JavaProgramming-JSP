package interfaceex;

public interface Calc {
	double PI = 3.14; // 자동적으로 앞에 final이 붙어있음(보이진않지만)
	int ERROR = -999999999;
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		//myMethod(); //static 매서드 안에는 static인 것만 넣어야함, 지금처럼 static이 아닌 것을 넣으면 에러가 뜸
		return total;
	}
	
	//private은 외부클래스에서 못 불러옴
	private void myMethod() {
		System.out.println("private 메서드입니다.");
	}
	private static void myStaticMethod() {
		System.out.println("private static 메서드입니다.");
	}
	
	//자동적으로 앞에 abstract가 붙어있음(보이진않지만)
	//class가 아닌 interface라서 이렇게만 표현해도 사용가능함
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
//	int square(int num); //나혼자코딩 내용
}
