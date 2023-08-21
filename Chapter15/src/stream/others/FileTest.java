package stream.others;

import java.io.File;
import java.io.IOException;

public class FileTest {

	//JSP에서 파일저장하는 방식으로 사용하는 주된 방식
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\it\\Documents\\JavaProgramming_git\\Chapter15\\newFile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath()); //절대경로
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();
	}
}
