//try-with-resources문

package exception;

import java.io.FileInputStream;

public class AutoCloseTest {
	
	public static void main(String[] args) {
		// java 9 이전버전까지는 try(AutoCloseObj obj = new AutoCloseObj()){}이렇게 사용했음
		AutoCloseObj obj = new AutoCloseObj();
		try (AutoCloseObj obj2 = obj){
			throw new Exception(); //예외를 만들어서 catch 부분도 발생하게 만듬
		}catch(Exception e) {
			System.out.println("예외 부분 입니다");
		}
	}
}
