//try-with-resources��

package exception;

import java.io.FileInputStream;

public class AutoCloseTest {
	
	public static void main(String[] args) {
		// java 9 �������������� try(AutoCloseObj obj = new AutoCloseObj()){}�̷��� �������
		AutoCloseObj obj = new AutoCloseObj();
		try (AutoCloseObj obj2 = obj){
			throw new Exception(); //���ܸ� ���� catch �κе� �߻��ϰ� ����
		}catch(Exception e) {
			System.out.println("���� �κ� �Դϴ�");
		}
	}
}
