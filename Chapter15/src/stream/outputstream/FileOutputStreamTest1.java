package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

// write���� �ֶ� run�ص� ���� �ȳ���
// ����� �۵��ߴ��� �˷����ϸ� ������Ʈ15�ּ� F5(��������)������ txt������ �����̵� ���� �� �� �ְ� �׷��� ����� �۵��Ѱ�
public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(65);  //A
			fos.write(66);  //B
			fos.write(67);  //C
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
}
