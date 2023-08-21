package classex;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		// 1번 방법
	Person person1 = new Person();
	System.out.println(person1);

	
	//보통 위에 1번방법을 많이 쓰고 2번 방법들은 선언하는게 계속 변경될 때 사용
	//해당 방법으로도 가능
	//2번 방법
	//	String className = "classex.Person";
//	Class pClass = Class.forName(className);
	Class pClass = Class.forName("classex.Person");
	//밑줄 그어있는건 향후 버전에는 사라질 기능이니 가급적 사용을 줄여라는 표시
	Person person2 = (Person)pClass.newInstance();
	System.out.println(person2);
	}
}
