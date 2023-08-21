package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//DataOutputStream, DataInputStream: �����͸� ������ ���� ����� �� �ڷ����� �˾Ƽ� ��ȯ�Ͽ� ������ ������ ���� �ϴ�  ���
public class DataStreamTest {

	public static void main(String[] args) {

		//write�ؼ� ���ԵǸ� ������Ʈ�� �ش� ������ ���� file�� ����
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos))
		{
		
			//data.txt�� ������ �� byte, UTF-8�� �� �о���� �ٸ� ����|(Int, Float ��)�� �� �о
			dos.writeByte(100); //1byte ������ ���� ��
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//�Ἥ ���� ���� ������ �д� �ڵ�
		try(FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis))
		{
		
			//write�ߴ� ������ �°� read�� ����ؾ��� (�׷��� ���ϸ� ������ ��)
			//write�ߴ� ������� read�ؾ���
			//���� ��� write���� 4byte ������ ��µ�, read���� 1byte ������ �о��ٸ� ������ ��
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
