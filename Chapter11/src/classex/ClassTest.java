package classex;

public class ClassTest {

	//class가지고 올 때, 해당 class가 없으면 ClassNotFound 이런 오류가 나니, throws ClassNotFoundException 이것을 써서 미리 해결해놓는 것
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		//Class 클래스의 역할인 클래스의 정보를 가지고 오는 것을 사용하는 방법 3가지
		//보통 jdk에 저장된 클래스 정보는 클래스 변수 입력하고 '.'을 한 뒤에 마우스 커서 갖다대면 정보 확인이 가능(사용가능한 매서드명 등이 나옴)
		//하지만 jdk에 저장되지 않은 외부 클래스를 가지고와서 정보를 알고자 할 때, Class 클래스를 활용함
		
		//첫번째 방법은 인스턴스가 이미 생성되어 있는 경우에 쓸 수 있는 방법
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName()); //'패키지명.클래스명'으로 출력
		
		//두번째, 세번째 방법은 컴파일된 클래스 파일이 있으면 클래스 이름만으로 Class 클래스를 반환하면서 클래스 정보(클래스나 인터페이스에 대한 변수, 매서드, 생성자 등)를 알 수 있음
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		//세번째 방법은 해당 클래스 파일이 있는지 없는지 모르지만, ""와 같이 해당 문자열인 클래스명을 가진 파일을 로딩해서 가지고 온다는 얘기
		//즉, 파일에 대한 정보를 모르고 이름만 알고 있어도 가져올 수 있다는 것이라 해당 방법이 제일 유용하게 쓰임
		//해당 방법이 '동적로딩' 이라고 함
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
	}
}
