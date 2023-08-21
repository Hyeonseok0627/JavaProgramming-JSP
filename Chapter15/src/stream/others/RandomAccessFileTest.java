package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100); //4byte(해당 데이터 읽는 단위)
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeDouble(3.14); //8byte
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeUTF("안녕하세요"); //3byte(한글 한 자당 3byte) *5 + 2byte(안녕하세요 뒤에 null값이 두 개가 들어감) = 17byte
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
	
		//파일 포인터를 0인 첫번째 위치로 옮기는 매서드
		//그렇게해야지 뒤에 데이터값 읽을 때 오류가 안남
		rf.seek(0);
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
	
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}
