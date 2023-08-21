package stream.inputstream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {

		// try-with-resoureces문 사용하여 finally 없음
		try(FileInputStream fis = new FileInputStream("input.txt")){ 
			int i;
			//i값이 -1이 아닌 동안 read()매서드로 한 바티으를 반복해서 읽도록 함
			while ( (i = fis.read()) != -1){
				System.out.println((char)i);
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
