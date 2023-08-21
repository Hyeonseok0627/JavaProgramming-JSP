package stream.inputstream;

import java.io.IOException;

//SystemŬ������ int, char ���� ������� ��(Scanner Ŭ������ ���� ������)
public class SystemInTest1 {

	public static void main(String[] args) {

		//SystemŬ������ �������� �ʰ� System.out, System.in, System.err�� ����� �� �ִ� ����
		//out, in, err ������ ����(static)������ Ŭ���� �������� ����� �� �־
		
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");

		// ����� ���� �ڵ带 ������ �� ����ó���� �ʿ�
		// ���� �� throws�� ����ó���� �̷�� �Ǹ� �ش� �ż��� ��� �ÿ� ����ó���ؾ���
		// �׷��� i ���� ���� ����� ���ܸ� �����ϴٺ��� try/catch�� ����
		int i;
		try {
			i = System.in.read(); //read() �ż���� �� ����Ʈ ����
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
