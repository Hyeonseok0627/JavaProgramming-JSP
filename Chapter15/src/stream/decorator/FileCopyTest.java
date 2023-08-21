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
			//파일의 끝인 -1이 반환될 때까지 보조스트림으로 자료를 읽음
			while( ( i = fis.read()) != -1){
				fos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
		}catch(IOException e) {
			e.printStackTrace();
		}
		//System.out.println(len);
		//System.out.println(millisecond); //동작 시 소요되는 시간을 출력
		
		System.out.println("파일 복사 하는 데 " + millisecond + " milliseconds 소요되었습니다.");
	}
}
