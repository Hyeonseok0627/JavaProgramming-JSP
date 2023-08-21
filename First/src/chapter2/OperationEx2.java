package chapter2;

public class OperationEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gameScore = 150;
		
		int lastScore1 = ++gameScore; //++가 =(대입연산자)보다 먼저 실행이 되어서 lastScore1값이 150+1인 151이 나옴
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;//--가 =(대입연산자)보다 먼저 실행이 되어서 lastScore1값이 151-1인 150이 나옴
		System.out.println(lastScore2);
		
		int gameScore1 = 150;
		
		int lastScore3 = gameScore1++; //++보다 =(대입연산자)가 먼저 실행이 되어서 lastScore1값이 150이 나옴
		System.out.println(lastScore3);
		
		int lastScore4 = gameScore1--;//--보다 =(대입연산자)보다 먼저 실행이 되어서 lastScore1값이 위에서 계산된 151이 나옴
		System.out.println(lastScore4);
		
		
		
	}

}
