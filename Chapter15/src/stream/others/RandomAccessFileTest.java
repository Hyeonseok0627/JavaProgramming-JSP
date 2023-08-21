package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		//RandomAccess : �������� ������ ������ �����ϴٴ� �ǹ�(�����͸� ã�� �� ���� ã�ƿ� �� ����)
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw"); 
		rf.writeInt(100); 
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer()); //4byte(int�� 4byte) (�ش� ������ �д� ����)
		rf.writeDouble(3.14); 
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer()); //8byte(double�̶� 8byte�̰�, �տ� 4byte ���Ŀ� 8byte�̴� ��ġ�� 12)
		rf.writeUTF("�ȳ��ϼ���"); 
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer()); //3byte(�ѱ� �� �ڴ� 3byte) *5 + 2byte(�ȳ��ϼ��� �ڿ� null���� �� ���� ��) = 17byte
	
		//���� �����͸� 0�� ù��° ��ġ�� �ű�� �ż���
		//�׷����ؾ��� �ڿ� �����Ͱ� ���� �� ������ �ȳ�
		rf.seek(0);
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		
		//write�� ���� ������ ��ġ�� read�ؾ� �ش� ��Ȯ�� �����͸� �а� ��
		//�׷��� ���ϸ� ���� ��
		int i = rf.readInt();
		System.out.println("i ���� ������ ��ġ:" +rf.getFilePointer());
		double d = rf.readDouble();
		System.out.println("d ���� ������ ��ġ:" +rf.getFilePointer());
		String str = rf.readUTF();
		System.out.println("str ���� ������ ��ġ:" +rf.getFilePointer());
	
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}
