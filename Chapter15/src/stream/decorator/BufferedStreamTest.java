package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {

		//일반 기반 스트림은 데이터를 읽는데 1byte 단위로 읽음
		//Buffered 보조스트림을 사용하면 8K 단위로 한번에 데이터를 읽어내서
		//데이터를 읽어내는데 걸리는 시간을 줄일 수 있게 하는 기능을 가진 보조스트림
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
		
			millisecond = System.currentTimeMillis(); //1970년1월1일 기준으로 현재일까지를 시간으로 환산하여 계산(millisecond: 0.001초 단위)
			
			int i;
			while( ( i = bis.read()) != -1){
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 복사 하는 데 " + millisecond + " milliseconds 소요되었습니다.");
	}
}
