package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연산 중 명시적 형 변환
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		//(int) 넣어준 이것을 캐스팅이라고 표현
		int iNum3 = (int)dNum1 + (int)fNum2; //두 실수가 각각 형 변환되어 더해짐(연산 시, 명시하여 강제로 정수로 변환)
		int iNum4 = (int)(dNum1 + fNum2);//두 실수의 합이 먼저 계산되고 형 변화됨
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
