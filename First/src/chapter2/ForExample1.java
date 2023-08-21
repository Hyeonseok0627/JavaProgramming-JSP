package chapter2;

public class ForExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; //int i = 1; 
		int sum; //int sum = 0; : for뮨에 초기값을 쓰지 않을 때는 여기에 초기값을 입력해줘야 함
		//i=1, sum=0; : 초기값(실행순서 1번), i<=10; : 조건식(2번), sum+=i; : 실행문(3번), i++ : 증가감식(4번) 
		for(i=1, sum=0; i<=10; i++) {
//			if(i>=10) {
//				break; : if문일 때는 참이 될때 break가 되므로 for문과는 부등호가 반대여야함
//			} : for문에 조건식을 쓰지않을 때는 코드블록에 써줘야함
//			i = i+1 : for문에 증가감식을 쓰지않을 때는 코드블록에 써줘야함
			sum+=i;
		}
		System.out.println("1부터10까지의 합은 " +sum+"입니다.");
	}

}
