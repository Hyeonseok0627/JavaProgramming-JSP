package chapter2;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case문에 숫자열 사용하기
		int ranking = 1;
		char medalColor;
		switch (ranking) {
			case 1 : // case를 여러개를 동시에 걸어줄 수 있음 (예를 들어서, case 1 case 4 case 5 이런식으로 ) 
				medalColor = 'G';
				break; //break가 있어야 더이상의 case로 안 넘어감, 예를 들어 break가 모두 없으면 순차적으로 다 실행되어서 맨마지막인 'A'값으로 나오게 됨
			case 2 : 
				medalColor = 'S';
				break;
			case 3 : 
				medalColor = 'B';
				break;
			default :
				medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색갈은" + medalColor + "입니다.");
	}
}
