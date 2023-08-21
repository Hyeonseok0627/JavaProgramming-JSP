package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100); //4byte(�ش� ������ �д� ����)
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		rf.writeDouble(3.14); //8byte
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		rf.writeUTF("�ȳ��ϼ���"); //3byte(�ѱ� �� �ڴ� 3byte) *5 + 2byte(�ȳ��ϼ��� �ڿ� null���� �� ���� ��) = 17byte
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
	
		//���� �����͸� 0�� ù��° ��ġ�� �ű�� �ż���
		//�׷����ؾ��� �ڿ� �����Ͱ� ���� �� ������ �ȳ�
		rf.seek(0);
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
	
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}
