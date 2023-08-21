package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

// write쓰는 애라서 run해도 값이 안나옴
// 제대로 작동했는지 알려고하면 프로젝트15애서 F5(리프레시)누르면 txt파일이 생성이된 것을 알 수 있고 그러면 제대로 작동한것
public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(65);  //A
			fos.write(66);  //B
			fos.write(67);  //C
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
