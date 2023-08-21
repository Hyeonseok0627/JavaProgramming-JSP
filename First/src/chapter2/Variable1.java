package chapter2;

public class Variable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int level; //정수형 변수 level을 선언
		level = 10; //level 변수에 값 10을 대입
		/*int level = 10; (두 줄을 이렇게 표현도 가능)
		 *(선언과 대입을 초기화 과정이라고 함)*/
		long level2 = 21000000000l; //long은 숫자 끝에 'L' or 'l'을 붙여줘야함
		char myChar = '가'; //char는 꼭 한글자만 선언 가능, char의 문자열은 ''로 표시
		System.out.println((int)myChar); //int를 붙여주면 문자에 해당하는 숫자가 출력, int 없으면 문자가 출력
//		System.out.println(level); //level 값 출력
		int charInt = 44032;
		System.out.println((char)charInt); //숫자에 해당하는 문자 출력
	}
}
