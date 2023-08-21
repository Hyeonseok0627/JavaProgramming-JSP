package Thisex;

//클래스, 인스턴스 개념
//A 클래스에서 A a1 = new A() 새로운 클래스 생성 -> 힙 메모리 area에 저장(이때, 여기에 저장된 형태를 인스턴스라고 말함)
//A 클래스에서 A a2 = new A() 새로운 클래스 생성 : 이때 코드상 this는 같아보이지만 이것이 가리키는 주소는 생성된 클래스마다 다른 것임

class Birthday {
	int day;
	int month;
	int year;
	
	//매서드는 setYear과 같이 명령어의 집합을 의미
	public void setYear(int year) {
		this.year = year; //자기 자신의 인스턴스 변수인 year 위치에 매개변수 'year'라는 값을 넣어라는 의미
	}
	
	public void printThis() {
		System.out.println(this);
	}
}


public class ThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis(); //둘다 b1이 저장된 주소인 인스턴스값을 출력함
		
		System.out.println(b2);
		b2.printThis(); // 코드상으로는 this가 같아보이지만, 각 자기자신인 b1, b2의 인스턴스값을 가리키는 것이라 다르게 값이 출력됨
	}

}
