//08-02: 상속에서 클래스 생성과 형 변환
//super 클래스를 써서 하위클래스가 상위클래스을 가져오는 방식으로 변환, 이러면서 set을 써서 각 값을 지정해주는 것도 새로운 클래스 생성에 변수로 넣어주고 없앰.

//보통 클래스 안에 멤버변수, 매서드는 기본적으로 들어가 있고, 여기에 출력코드가 들어감


package inheritance;

//가시성 정도
//private: 내부 클래스만 접근(가시성) 가능 / default(디폴트): 내부 클래스, 동일 패키지내에서만 접근 가능
//protected: 내부 클래스, 동일 패키지, 다른 패키지(상위클래스와 하위클래스간에서만 가능)에서 접근 가능
//public: 모두에게 접근 가능

//private을 쓰면 외부클래스에서 해당 클래스가 생성은 되지만 접근이 안되서 못 보는 것뿐
//이것을 외부클래스에서 접근 가능하게하여 수정할 수 있게 해주는 게 set임 (set을 사용한 생성자만 외부클래스에서 접근이 가능함)

public class Customer {
	//protected : 상속받는 클래스가 private이지만 public처럼 하위클래스에서 보이게 하는 것(상속관계에서만 가능), 그래서 속성은 private이긴함
	//즉, 이렇게 쓰면 private이지만, 상속관계에서 하위클래스에서는 해당 클래스를 끌어와서 볼 수 있음
	//protected값은 패키지가 달라도 상속관계에서 하위클래스가 해당 값을 가져올 수 있음(에러 안뜸)
	protected int customerID;  
	protected String customerName;
	protected String customerGrade;
	// 앞에 해당 접근제어자(public, private, protected)가 없는 것은 디폴트값(이것도 접근제어자)
	// 디폴트값은 패키지가 다른 곳에선 클래스끼리 상속관계라도 상위클래스의 디폴트값은 하위클래스가 못 가져옴(에러가 뜸)
	int bonusPoint; 
	double bonusRatio;

//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		System.out.println("Customer() 생성자 호출");
//	}

	public Customer(int customerID,String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	//오버로드 : int price처럼 매개변수 수를 달리해서 같은 매서드명으로 여러개 매서드를 생성 가능 (같은 매서드가 여러개)
	//오버라이딩 : 같은 매서드명으로 사용하되, 상속받은 하위클래스의 매서드 내용을 부모인 상위클래스의 매서드와 내용을 다르게 변경할 때 사용 (같은 매서드의 내용을 덮어써서 다르게 변환했다라는 내용)

	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	//getter, setter : private되어서 지정된 것을 가져가서 바꾸게 하지않겠다(get), 바꿀수 있게하겠다(set)
	//즉, get과 set은 외부 클래스의 private된 것 수정 가능 유무를 만들어줌
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
}
