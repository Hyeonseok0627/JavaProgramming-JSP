package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}
}

public class ReduceTest {

	public static void main(String[] args) {

		String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
		
		//getBytes: 안녕하세요~~~ 이걸 Byte로 변환해서 불러오는 것(UTF-8 기준: 한글 한 글자는 3Byte, 특수문자랑 영어 한 글자는 1Byte)
		//"": 초기값, (s1, s2)에 greetings 값들이 들어가서 조건 결과, "안녕하세요~~~" 이게 최종적으로 남아서 해당 값만 출력이 됨 
		//reduce() 매서드 사용법(매개변수에 직접 람다식 쓰는 방법)
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2)-> 
		                          {if (s1.getBytes().length >= s2.getBytes().length) 
				                                  return s1;
		                          else return s2;})); 
		
		//reduce() 매서드 사용법(Binary Operator 인터페이스를 구현한 클래스 사용하는 방법)
		String str = Arrays.stream(greetings).reduce(new CompareString()).get(); //BinaryOperator를 구현한 클래스 이용
		System.out.println(str);
		                          
	}
}
