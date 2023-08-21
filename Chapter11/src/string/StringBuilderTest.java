package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소 :" + System.identityHashCode(javaStr) );
	
		StringBuilder buffer = new StringBuilder(javaStr); //기본으로 jdk에 있는 StringBuilder 클래스를 가지고 오는 것이라 생성자를 따로 안 만들어도 이미 생성자가 만들어져있어서 바로 가지고 올 수 있음
		System.out.println("연산 전 buffer 메모리 주소:" + System.identityHashCode(buffer));
		
		buffer.append(" and"); //append : 추가해주는 함수
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("연산 후 buffer 메모리 주소:" + System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr 문자열 주소 :" + System.identityHashCode(javaStr) );
		
		//Integer 클래스
		Integer i = 1;
		System.out.println(i.intValue());
		
		int number1 = Integer.valueOf("123"); //valueOf : 문자열을 숫자로 만들어줌, parseInt : 문자열을 숫자로 만들어줌
		System.out.println(number1);
		
		Integer num1 = new Integer(100);
		int num2 = 200;
		int sum = num1 + num2; //클래스인 Integer를 자료형인 int로 변경해줌(언박싱)
		Integer num3 = num2; //자료형인 int를 클래스인 Integer로 변경해줌(오토박싱)
		
		Double d = 3.14;
		d.toString();
		Double.parseDouble("12.3"); //parse는 static이라 변수말고 클래스 자체를 가지고올 수 있음
		
		//Class 클래스 : 저장된 project -> bin -> 여기에 있는 클래스는 클래스안에 생성시켰던 클래스들도 저장되어있음
	}
}
