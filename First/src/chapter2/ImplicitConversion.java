package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//묵시적 형 변환(자동 형 변환)
		
		//바이트 크기가 작은 자료형->큰 자료형으로 대입하눈 경우
		byte bNum = 10;
		int iNum = bNum; //byte가 int에 잘 들어감을 보여줌
		System.out.println(bNum);
		System.out.println(iNum);
		
		//덜 정밀한 자료형->더 정밀한 자료형으로 대입하는 경우
		int iNum2 = 20;
		float fNum = iNum2; //float은 실수형으로서 소수점까지 나옴, int가 float에 잘 들어감을 보여줌
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		//연산 중 자동 변환되는 경우(int형->float형, 두 변수 합->double형으로 전환)
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum); //int와 float은 double로 잘 들어감을 보여줌
	}

		//명시적 형 변환

		//int iNum = 10;
		//byte bNum = (byte)iNum;
		//System.out.println((int)bNum); 이것처럼 ()해서 직접 명시해주는 방법
		
	
	
}
