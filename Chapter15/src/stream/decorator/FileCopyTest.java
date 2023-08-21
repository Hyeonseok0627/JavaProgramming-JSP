package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {

		long millisecond = 0;
		//int len = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip")){
		
			millisecond = System.currentTimeMillis();
			
			int i;
			//������ ���� -1�� ��ȯ�� ������ ������Ʈ������ �ڷḦ ����
			while( ( i = fis.read()) != -1){
				fos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
		}catch(IOException e) {
			e.printStackTrace();
		}
		//System.out.println(len);
		//System.out.println(millisecond); //���� �� �ҿ�Ǵ� �ð��� ���
		
		System.out.println("���� ���� �ϴ� �� " + millisecond + " milliseconds �ҿ�Ǿ����ϴ�.");
	}
}
