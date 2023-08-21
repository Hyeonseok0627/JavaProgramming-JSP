package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	//여기에 throws 쓰면 exception을 미루는 것
	//구현하는 해당 매서드에서 핸들링(처리)하는 것이 아닌 미룬 후 매서드를 호출하여 사용하는 부분에서 예외를 핸들링(처리)하는 방법
	//그래서 main 저기에서 try/catch로 exception 핸들링함
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException 발생
		Class c = Class.forName(className);  //ClassNotFoundException 발생
		return c;
	}

	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//어떤 exception이 발생할지 모르겠다하면(컴파일이 exception을 안 잡아줘서 모를때) 해당 디폴트값을 줘도 됨
		//이렇게 하면 발생하는 모든 exception이 얘한테 다 들어와서(최상위 클래스로 업캐스팅이 됨) 핸들링이 가능함
		//이 경우, 얘가 모든 exception의 최상위 클래스라서 제일 마지막에 써 줘야함
		//제일 먼저쓰거나 중간에 쓰게 되면 exception이 얘한테 먼저오는 것이라 얘 다음 exception이 해당 catch{}로 들어가지않아 오류가 뜸
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}