package chapter2;

public class BreakExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0;
		
		for(num=0; ; num++) {
			sum += num;
			if(sum >= 100) {
			} // for문에서 조건식 삭제하는 대신 코드블럭에 if문 넣어줌
				break; // 본인이 안에 있는 반복문까지만 영향을 줌
		}
		System.out.println("num :" + num);
		System.out.println("sum :" + sum);
	}

}
