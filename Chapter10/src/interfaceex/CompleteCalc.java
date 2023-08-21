package interfaceex;

public class CompleteCalc extends Calculator {

//	@Override
//	public void description() {
//		// TODO Auto-generated method stub
//		System.out.println("CompleteCalc에서 실행");;
//	}
	
	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	
		//나혼자코딩 내용
//		@Override
//		public int square(int num) {
//			return num1*num1;	
		
		
	}
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
}
