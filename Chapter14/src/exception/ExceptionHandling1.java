// try-catch-finally��

package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		// "a.txt"�� ���� ���: ���� ���� ������ ��
		// "a.txt" ������ ã�� �� ���� -> catch�� ������ ���� exception ���� ������ ���
		// -> finally {}�� �� -> fis ������ ã�� �� ������ �ݴ� ���� ���� �߻� -> catch�� ������ ���� exception ������ ���
		
		// ������ "a.txt" ������ �������༭ try{"a.txt" ����} -> finally{try{fis.close ���� }} -> "finally" ���
		FileInputStream fis = null;
		//"a.txt"�� ���� ��� ��� �����ųĿ� ���� ���� ���� �ڵ鸵 ���
		//1�� ��� : throws FileNotFoundException �̰� main �ڿ� �ٴ� ���
		//�ش� ����� �̷�� ����ε� ���α׷��� �״� ������ ���ܼ� ��������
		//2�� ��� : try/catch ��� (�ش� ����� ���)
		try {
			 fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
		 	System.out.println(e);
			//return;
			//e.printStackTrace(); //���� ������ �ʹ� ��� ������ �������� ���
		}
		//������� ��� try���� "a.txt"�� �����Ͽ� ���������� ������ �Ǹ� �ݾ��ִ� �� ����
		//�׷��� finally{fis.close();}�� �ݾ���
		//������ �̷��Ը� ���� Ȥ�ó� fis.close(); �̰� ���µ� �ݾƶ�� ��ɳ��� ��� ������ ���°Ŵ�
		//�ش� ���� ���� ���ܿ� �°� �� �ڵ鸵�� �ʿ���
		//�׷��� �ڵ鸵 ��� �� try/catch�� ���
		//���⿡�� finally{}���� ������ try���� ������ ������ ����(����)�ϱ� ���� ���
		//������ �̷��ٺ��� �ڵ����� ������� ����������
		//�װ��� �����ϱ����� try-with-resources���� ����
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finally");
		}
		//System.out.println("���⵵ ����˴ϴ�.");
	}
	//System.out.println("end");
}
