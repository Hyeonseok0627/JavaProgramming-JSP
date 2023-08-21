package chapter2;

public class OperationEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2.0;
		System.out.println(avgScore); //int 값을 소수점 있는 2.0에 double형을 써서 묵시적 형 변환이 되어, 80.0 값이 나옴
		
		int avg1Score = totalScore / 2; //int로 묵시적 형 변환할거면 정수 2로 하고, double로 할거면 실수인 2.0으로 해줘야 값이 나옴
		System.out.println(avg1Score);
		
	}

}
