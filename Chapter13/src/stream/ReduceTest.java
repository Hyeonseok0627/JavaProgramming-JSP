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

		String[] greetings = {"�ȳ��ϼ���~~~", "hello", "Good morning", "�ݰ����ϴ�^^"};
		
		//getBytes: �ȳ��ϼ���~~~ �̰� Byte�� ��ȯ�ؼ� �ҷ����� ��(UTF-8 ����: �ѱ� �� ���ڴ� 3Byte, Ư�����ڶ� ���� �� ���ڴ� 1Byte)
		//"": �ʱⰪ, (s1, s2)�� greetings ������ ���� ���� ���, "�ȳ��ϼ���~~~" �̰� ���������� ���Ƽ� �ش� ���� ����� �� 
		//reduce() �ż��� ����(�Ű������� ���� ���ٽ� ���� ���)
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2)-> 
		                          {if (s1.getBytes().length >= s2.getBytes().length) 
				                                  return s1;
		                          else return s2;})); 
		
		//reduce() �ż��� ����(Binary Operator �������̽��� ������ Ŭ���� ����ϴ� ���)
		String str = Arrays.stream(greetings).reduce(new CompareString()).get(); //BinaryOperator�� ������ Ŭ���� �̿�
		System.out.println(str);
		                          
	}
}
