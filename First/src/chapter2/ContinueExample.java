package chapter2;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int num;
		
		for(num=1; num<=100; num++) {
			if(num%2 == 0) {
				continue;// if조건문에 조건이 맞으면 continue에 의해 뒤에 total += num이 진행안되고 바로 증가감식으로 진행
			}
			total += num;
		}
		System.out.println("1부터 100까지의 홀수의 합은: " + total + "입니다.");
	}
}
