package classex;

import java.lang.reflect.Constructor;//ctrl+shift+'o'를 눌러서 불러오기 (외부패키지에 있는 클래스를 불러오는 것이라 이렇게 해야함)
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class strClass = Class.forName("java.lang.String"); //이렇게만하면 오류가 나므로, forName에 갖다대고 throws ClassNotFoundException 이걸 삽입하는 이클립스 자동완성 기능 사용
	
		Constructor[] cons = strClass.getConstructors(); //getConstructors() : 모든 생성자를 불러오라는 것, 그래서 s가 붙어서 복수형임, strClass의 생성자 내용만 가져오기
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println();
		Field[] fields = strClass.getFields(); //strClass의 Field내용만 가져오기
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();
		Method[] methods = strClass.getMethods(); //strClass의 매서드 내용만 가져오기
		for(Method m : methods) {
			System.out.println(m);
		}
	}

}
