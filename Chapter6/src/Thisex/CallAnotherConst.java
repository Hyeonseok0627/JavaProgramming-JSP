package Thisex;

class Person {
	
	String name;
	int age;
	
	//this 사용이유 2번(다른 생성자를 불러오는 것)
	//this 사용하여
	//public Person(String name, int age) 생성자를 호출	
	public Person() {
		
		//this로 다른 생성자를 가지고 올 때는 여기에 어떠한 문장도 오면 안됨
		//이렇게 가지고 온다는 것은 아직 해당 객체가 인스턴스가
		//힙 메모리에 저장되는 인스턴스 생성이 아직 안되었다는 것이미로
		//this 앞에 어떠한 문장도 먼저 나오면 안되고, 해당 this가 제일 먼저 나와야함
		this("이름없음", 1);  
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//this의 사용이유 3번(자신의 주소를 반환하는 것)
	// Person : 해당 클래스의 자료 타입 같은 것
	public Person returnSelf() {
		return this;
	}
	
}

public class CallAnotherConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this 사용이유 1번(자신의 메모리 주소(인스턴스)를 가리키는 것)
		Person p1 = new Person(); //새로운 클래스 생성(선언)
		System.out.println(p1.name); //초기화된 인스턴스 변수값인 '이름없음'가 출력됨
	
		//this의 사용이유 3번(자신의 주소를 반환하는 것)
		System.out.println(p1.returnSelf());
	
	}

}
