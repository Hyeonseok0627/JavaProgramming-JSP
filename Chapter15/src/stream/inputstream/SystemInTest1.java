package stream.inputstream;

import java.io.IOException;

//System클래스는 int, char 값만 입출력이 됨(Scanner 클래스이 비해 제한적)
public class SystemInTest1 {

	public static void main(String[] args) {

		//System클래스를 생성하지 않고도 System.out, System.in, System.err를 사용할 수 있는 이유
		//out, in, err 변수가 정적(static)변수라서 클래스 생성없이 사용할 수 있어서
		
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

		// 입출력 관련 코드를 구현할 시 예외처리가 필요
		// 구현 시 throws로 예외처리를 미루게 되면 해당 매서드 사용 시에 예외처리해야함
		// 그래서 i 값이 없는 경우의 예외를 적용하다보니 try/catch가 나옴
		int i;
		try {
			i = System.in.read(); //read() 매서드로 한 바이트 읽음
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
