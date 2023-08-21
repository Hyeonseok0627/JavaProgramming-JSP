package chapter2;

public class WhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while 반복문 형식(조건이 부합하지않으면(:false) while이 실행이 안됨)
		//선언문
		//while(조건식) {
			//실행문;
			//증가감식;
		//}
		
		int num = 1;
		int sum = 0;
		
		//while(true) : 무한 반복이 됨
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
		
		
		//do-while 반복문(조건에 부합하지 않아도(: false) {}이 실행이 됨)
		int num1 = 1;
		int sum1 = 0;
		
		do {
			sum1 += num1;
			num++;
		}
		while(num <= 10);
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
		
	}

}
