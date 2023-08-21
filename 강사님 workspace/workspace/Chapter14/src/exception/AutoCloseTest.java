package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoCloseObj obj = new AutoCloseObj();
		try(obj){
			throw new Exception();
//			System.out.println("try문 실행");
			
		}catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
		
		
	}

}
