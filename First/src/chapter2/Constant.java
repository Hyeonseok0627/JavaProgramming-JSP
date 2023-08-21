package chapter2;

public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_NUM = 100; //final이라는 이름을 붙여주면 상수를 선언하는 의미
		final int MIN_NUM = 0; //선언과 값 대입을 하며 초기화해도되고, 아래처럼 선언 후 값 대입을 따로 해도됨.
		//MIN_NUM = 0;
		//한줄 지울 때 : ctrl+d 입력
		//상수를 사용하는 이유 : 다수의 값을 변경 시, 상수로 선언하면 그 값만 고치면 자동으로 수정이 되서 편리함.
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}
