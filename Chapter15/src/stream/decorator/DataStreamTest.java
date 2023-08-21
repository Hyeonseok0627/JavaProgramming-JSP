package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//DataOutputStream, DataInputStream: 데이터를 가지고 오고 출력할 때 자료형을 알아서 변환하여 데이터 가지고 오게 하는  방법
public class DataStreamTest {

	public static void main(String[] args) {

		//write해서 쓰게되면 프로젝트에 해당 내용이 적힌 file이 생김
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos))
		{
		
			//data.txt로 써지는 건 byte, UTF-8은 잘 읽어내지만 다른 형태|(Int, Float 등)는 못 읽어냄
			dos.writeByte(100); //1byte 단위의 값을 씀
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//써서 생긴 파일 내용을 읽는 코드
		try(FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis))
		{
		
			//write했던 단위에 맞게 read에 사용해야함 (그렇게 안하면 오류가 뜸)
			//write했던 순서대로 read해야함
			//예를 들어 write에선 4byte 단위로 썼는데, read에선 1byte 단위로 읽었다면 오류가 뜸
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
