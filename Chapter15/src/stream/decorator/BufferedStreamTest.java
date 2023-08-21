package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {

		//�Ϲ� ��� ��Ʈ���� �����͸� �дµ� 1byte ������ ����
		//Buffered ������Ʈ���� ����ϸ� 8K ������ �ѹ��� �����͸� �о��
		//�����͸� �о�µ� �ɸ��� �ð��� ���� �� �ְ� �ϴ� ����� ���� ������Ʈ��
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
		
			millisecond = System.currentTimeMillis(); //1970��1��1�� �������� �����ϱ����� �ð����� ȯ���Ͽ� ���(millisecond: 0.001�� ����)
			
			int i;
			while( ( i = bis.read()) != -1){
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("���� ���� �ϴ� �� " + millisecond + " milliseconds �ҿ�Ǿ����ϴ�.");
	}
}
