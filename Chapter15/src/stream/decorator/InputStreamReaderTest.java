package stream.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		//InputStreamReader : 스트림을 문자로(문자열 단위로) 읽어주게 하는 기능인 보조스트림 / FileInputStream : Byte로 읽는 기반 스트림
		//Byte로 읽는 거다보니 출력할 때는 문자로 해야 깨지지않고 출력이 되니깐, 해당 보조스트림을 써서 문자로 읽게하도록 만들어줌
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			while( (i = isr.read()) != -1){  //보조 스트림으로 읽습니다.
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// 추가 내용
//		Socket socket = new Socket();
//		try {
//			//보조스트림은 보조스트림을 감쌀 수도 있고, 기반스트림을 감싸서 기능을 추가할 수도 있음
//			//즉, 보조스트림에 생성자로 다른 보조스트림, 기반스트림 둘다 들어갈 수 있음
//			//여기에선 byte로 읽게하는 기반스트림을 문자로 읽게하는 보조스트림이 1차로 감싸고, 그것을 8K단위로 빠르게 읽도록 하는 보조스트림이 2차로 감쌈
//			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			br.readLine(); // 한 줄 단위로 읽어줌 (BufferedReader 해당 보조스트림 내부에 readLine() 해당 매서드가 포함되어 있어서 사용가능)
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
