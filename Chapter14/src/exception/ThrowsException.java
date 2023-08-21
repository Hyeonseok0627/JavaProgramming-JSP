package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	//���⿡ throws ���� exception�� �̷�� ��
	//�����ϴ� �ش� �ż��忡�� �ڵ鸵(ó��)�ϴ� ���� �ƴ� �̷� �� �ż��带 ȣ���Ͽ� ����ϴ� �κп��� ���ܸ� �ڵ鸵(ó��)�ϴ� ���
	//�׷��� main ���⿡�� try/catch�� exception �ڵ鸵��
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException �߻�
		Class c = Class.forName(className);  //ClassNotFoundException �߻�
		return c;
	}

	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//� exception�� �߻����� �𸣰ڴ��ϸ�(�������� exception�� �� ����༭ �𸦶�) �ش� ����Ʈ���� �൵ ��
		//�̷��� �ϸ� �߻��ϴ� ��� exception�� ������ �� ���ͼ�(�ֻ��� Ŭ������ ��ĳ������ ��) �ڵ鸵�� ������
		//�� ���, �갡 ��� exception�� �ֻ��� Ŭ������ ���� �������� �� �����
		//���� �������ų� �߰��� ���� �Ǹ� exception�� ������ �������� ���̶� �� ���� exception�� �ش� catch{}�� �����ʾ� ������ ��
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}