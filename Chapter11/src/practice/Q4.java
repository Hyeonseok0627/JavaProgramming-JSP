package practice;

class MyDog {
	String name;
	String type;
	
	MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type + " " + name;
	}
}

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDog dog = new MyDog("멍멍이", "진돗개");
		System.out.println(dog); //문자열이다보니 object의 toString() 매서드가 진행이 됨, 그래서 toString() 매서드를 재정의한 것
	}
}
