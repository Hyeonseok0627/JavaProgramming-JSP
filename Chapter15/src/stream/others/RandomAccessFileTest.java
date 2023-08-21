package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		//RandomAccess : 무작위로 어디든지 접근이 가능하다는 의미(데이터를 찾을 때 빨리 찾아올 수 있음)
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw"); 
		rf.writeInt(100); 
		System.out.println("파일 포인터 위치:" + rf.getFilePointer()); //4byte(int라서 4byte) (해당 데이터 읽는 단위)
		rf.writeDouble(3.14); 
		System.out.println("파일 포인터 위치:" + rf.getFilePointer()); //8byte(double이라 8byte이고, 앞에 4byte 이후에 8byte이니 위치는 12)
		rf.writeUTF("안녕하세요"); 
		System.out.println("파일 포인터 위치:" + rf.getFilePointer()); //3byte(한글 한 자당 3byte) *5 + 2byte(안녕하세요 뒤에 null값이 두 개가 들어감) = 17byte
	
		//파일 포인터를 0인 첫번째 위치로 옮기는 매서드
		//그렇게해야지 뒤에 데이터값 읽을 때 오류가 안남
		rf.seek(0);
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		
		//write와 같은 포인터 위치로 read해야 해당 정확한 데이터를 읽게 됨
		//그렇게 안하면 오류 뜸
		int i = rf.readInt();
		System.out.println("i 파일 포인터 위치:" +rf.getFilePointer());
		double d = rf.readDouble();
		System.out.println("d 파일 포인터 위치:" +rf.getFilePointer());
		String str = rf.readUTF();
		System.out.println("str 파일 포인터 위치:" +rf.getFilePointer());
	
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}
