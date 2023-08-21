package lambda;

//람다식을 사용하기위한 인터페이스
interface PrintString{
	
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {

		PrintString lambdaStr = s->System.out.println(s);  //람다식의 해당 매서드(s->System.out.println(s);)를 변수(String str)에 대입
		lambdaStr.showString("hello lambda_1");
		
		showMyString(lambdaStr);                          //인터페이스인 lambdaStr을 메서드 매개변수로 전달
		
		PrintString reStr = returnString();  
		reStr.showString("hello ");
		
	}
	
	public static void showMyString(PrintString p) {
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() {         //반환 값으로 사용
		return s->System.out.println(s + "world");
	}
}
