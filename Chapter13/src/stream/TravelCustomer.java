package stream;

public class TravelCustomer {

	//멤버변수
	private String name;   //이름
	private int age;       //나이
	private int price;     //가격
	
	//생성자(객체가 생성될 때, 객체의 초기화를 위해 실행되는 매서드)
	//생성자는 new를 통한 객체 생성할 때 한번만 호출, new를 통해 객체 생성하면 인스턴스도 생성이 됨(인스턴스는 데이터가 저장되는 힙메모리의 객체 데이터의 저장공간)
	//초기화: 객체를 선언하고 값을 최초로 할당하는 것
	//즉, 여기에선 this.name = name; 이게 초기화
	public TravelCustomer(String name, int age, int price) {
		//this: 매개변수의 이름을 멤버변수와 같은 이름으로 붙이고자할 때 사용
		//this는 생성자에서만 호출가능
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "name: " + name + "age: " + age + "price: " + price; 
	}
}
