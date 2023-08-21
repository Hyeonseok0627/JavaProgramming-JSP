package inheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID,String customerName, int agentID) {
		
		//하위클래스가 상위클래스의 생성자를 끌어다 쓸 수 있는 이유는 하위클래스를 생성될 때는 상위클래스가 먼저 생성되고, 하위클래스가 생성이 되서 그럼
		//그러면 이러한 원리가 일어나도록 해주는게 super();이다.
		//직접 쓰지않아도 기본적으로 내부에 만들어져있는게 super();이며, 이건 매개변수가 없는 디폴트값이므로, 상위클래스의 디폴트 생성자를 가져오는 것
		//super(); : 상위클래스의 생성자를 가져온다는 의미
		//this : 자기자신의 메모리(저장장소)를 가리키는 키워드 / 자기자신의 생성자를 가져오는 것
		//상위클래스는 object클래스의 디폴트 생성자를 가져옴
		
		//VIPCustomer는 부모 클래스의 매개변수와 같아야함
		//보통 클래스에서 생성자가 하나도 없는 경우에 자동적으로 보이지는 않지만 디폴트 생성자가 생겨있음
		//하지만 상위클래스에서 생성자가 하나라도 있으면 디폴트 생성자를 제공하지않음
		//그래서 상위클래스의 디폴트 생성자를 부르는 super();이걸 하위클래스에서 쓰게 되면 에러가 뜸
		//그렇기 때문에 super();에 매개변수를 상위클래스의 생성자 매개변수와 같게함
		//이때, 하위클래스 생성자에도 상위클래스 생성자 매개변수처럼 매개변수를 만들어줌
		//그렇게해야 상위클래스 생성자 값들을 불러올 수 있음
		super(customerID,customerName); // 상속받은 부모인 Customer의 생성자를 불러오는 방식
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	//오버라이딩할 때는, public int calcPrice(int price) 이게 같아야함
	//오버라이딩은 자동완성도 되며(source에서 가능), 상속받은 상위클래스의 매서드 내용말고 다른 매서드 내용을 반영하고 싶을 때 사용
	
	//오버라이드는 @Override 이 부분은 없어도 되지만 표시용으로 작성
	//오버라이드 구조는 상속받은 클래스의 매서드의 매서드명인 calcPrice와 매개변수인 int price만 같은 상태에서 
	//내부 내용만 변경하면 해당 클래스의 매서드 내용만 부모 클래스 도출할 때, 해당 클래스 매서드 내용만 부모 클래스와 다르게 표시됨
	
	//하위클래스에서 오버라이드가 되면 매서드를 재정의를 하는 것
	//이때, 재정의된 매서드의 주소는 서로 다름
	//하위클래스의 재정의된 매서드는 매서드 영역이 따로 잡힘 : 이때는 super때와는 달리, 상위클래스의 형(타입)꺼가 아닌 하위클래스 본인의 인스턴스를 부름(즉, 상위클래스 매서드 영역과 하위클래스 매서드 영역이 따로 존재)
	//그래서 상속을 하게되면 하위클래스에서 상위클래스 생성자를 가지고는 오고, 출력값을 낼 때 상위클래스와 하위클래스 공통 생성자를 부르지만
	//매서드 영역이 따로 잡히면서 기존 상위클래스 매서드 내용과 그 내용과는 다르게 재정의된 하위클래스 매서드 내용이 둘다 출력이 됨
	//이게 다형성을 나타낸다라고 할 수 있는 개념
	//재정의가 안된 매서드는 상위클래스의 매서드 영역과 같은 영역을 사용, 그러면 상위클래스나 하위클래스 두 개의 매서드는 동일하게 출력됨
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	
	//return super.showCustomerInfo() : 부모 클래스인 Customer의 매서드를 불러오는 방식
	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + " 입니다."; 
	}
	
	public int getAgentID() {
		return agentID;
	}
}
