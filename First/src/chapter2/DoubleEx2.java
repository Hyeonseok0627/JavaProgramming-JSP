package chapter2;

public class DoubleEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dnum = 1;
		for(int i=0; i<10000; i++) {
			dnum =dnum+0.1;
		}
		boolean b = true;
		System.out.println(b); //if문에 잘 쓰임
		System.out.println(dnum); //원래값인 1001보다 약간의 오차가 발생(double은 약간의 오차가 발생한다는 점을 알 수 있음)
	}

}
