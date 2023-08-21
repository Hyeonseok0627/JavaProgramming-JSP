package stream.inputstream;
import java.io.FileInputStream;
import java.io.IOException;

//FileInputStream 클래스는 입출력 클래스라서 예외처리 필요
//지금은 input.txt 파일을 생성해서 예외가 안나옴
public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
		
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		
		} catch (IOException e) {
			System.out.println(e); //"input.txt" 파일이 없어서 해당 exception이 수행이 됨
		} finally{
			try {
				fis.close();
			} 
			// catch (Exception e) {} 이걸 쓰면 최상위클래스이니
			// 밑에 두개의 세부 exception을 다 걸어주는 것이라 프로그램이 정상적으로 넘어가
			//"end"가 출력이 되지만, 세부적으로 어떤 exception이 있는 지 알면
			//세부적으로 exception을 코딩해줘서 어떤 exception들이 발생했다는 로그를 남겨주는 게 좋음
			//세부적인 exception을 모르면 최상위 exception클래스를 해줘도 됨
			catch (IOException e) {
				System.out.println(e); // fis 파일을 찾을 수 없어서 fis.close();를 수행 못 하니 해당 exception이 수행이 됨
			} catch (NullPointerException e){
				System.out.println(e); // Null값이 fis에 pointer가 안된 exception도 수행해줘야 여기에선 넘어감(fis값이 null값으로 만들어놓은 것이라)
			}
		}
		//위에 exception 3 단계를 거쳐야지 해당 내용 수행이 안되는 예외상황이 생겨도 넘어가라서 작동하라는 것
		//NullPointerException e 이것을 안 해주면 여기서 예외사항을 핸들링 한게 없어서 프로그램이 죽게 되서 "end"가 출력이 안됨
		//그래야 프로그램이 죽지않고 정상작동은 순서대로 되서 "end" 출력 단계까지 넘어가게 됨
		System.out.println("end"); 
		
	}
}
