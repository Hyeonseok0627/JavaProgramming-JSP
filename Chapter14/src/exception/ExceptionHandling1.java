// try-catch-finally문

package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		// "a.txt"가 없는 경우: 예외 관련 오류가 뜸
		// "a.txt" 파일을 찾을 수 없다 -> catch로 빠져서 관련 exception 관련 문구가 출력
		// -> finally {}로 감 -> fis 파일을 찾을 수 없으니 닫는 실행 오류 발생 -> catch로 빠져서 관련 exception 문구가 출력
		
		// 지금은 "a.txt" 파일을 생성해줘서 try{"a.txt" 실행} -> finally{try{fis.close 실행 }} -> "finally" 출력
		FileInputStream fis = null;
		//"a.txt"가 없는 경우 어떻게 돌릴거냐에 대한 예외 관련 핸들링 방법
		//1번 방식 : throws FileNotFoundException 이게 main 뒤에 붙는 방식
		//해당 방식은 미루는 방식인데 프로그램이 죽는 문제가 생겨서 쓰지않음
		//2번 방식 : try/catch 방법 (해당 방식을 사용)
		try {
			 fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
		 	System.out.println(e);
			//return;
			//e.printStackTrace(); //에러 문구가 너무 길게 나오니 위에꺼로 사용
		}
		//입출력인 경우 try에서 "a.txt"가 존재하여 정상적으로 열리게 되면 닫아주는 게 맞음
		//그래서 finally{fis.close();}로 닫아줌
		//하지만 이렇게만 쓰면 혹시나 fis.close(); 이게 없는데 닫아라고 명령내린 경우 오류가 나는거니
		//해당 내용 관련 예외에 맞게 또 핸들링이 필요함
		//그래서 핸들링 방식 중 try/catch를 사용
		//여기에서 finally{}쓰는 이유는 try에서 열었던 파일을 종료(해제)하기 위해 사용
		//하지만 이러다보니 코딩값이 길어져서 지저분해짐
		//그것을 보완하기위해 try-with-resources문이 나옴
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finally");
		}
		//System.out.println("여기도 수행됩니다.");
	}
	//System.out.println("end");
}
