package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer lee = new Customer(10010,"이순신");
		lee.bonusPoint = 1000;
		
		// String customerName과 같이 String이 들어간 것이라 그냥 show만 하면 안되고, System.out.println으로 출력을 해줘야함
		System.out.println(lee.showCustomerInfo());
		
		//묵시적 형 변환(업캐스팅)
		//하위클래스 안에는 상위클래스가 내포되어 있는 것이라, 생성은 하위클래스로 하지만 형은 상위클래스로 한다는 얘기
		//그래서 이렇게 생성된 클래스에서 볼 수 있는 매서드나 멤버변수는 상위클래스꺼로만 보여짐(범주가 더 넓은 하위클래스가 아닌 상위클래스꺼로만 보임)
		// Cutomer customerKim = new VIPCustomer(10101, "Kim);
		VIPCustomer kim = new VIPCustomer(10020,"김유신",1001);//1001: agentID임
		kim.bonusPoint = 10000;
		System.out.println(kim.showCustomerInfo());
	}

}
