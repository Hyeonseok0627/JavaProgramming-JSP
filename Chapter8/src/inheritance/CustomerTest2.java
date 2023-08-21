package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vc 참조변수는 하위클래스인 VIPCustomer의 인스턴스가 상위클래스인 Customer로 형 변환된 것이라 Customer 멤버변수만 사용가능
		Customer vc = new VIPCustomer(0, null, 0); //생성 가능
		//VIPCustomer vc2 = new Customer(0, null); //생성 불가능
		VIPCustomer kim = new VIPCustomer(10020,"김유신",1001);//1001: agentID임
		kim.bonusPoint = 10000;
		System.out.println(kim.showCustomerInfo());
		System.out.println(kim.showVIPInfo());
	}

}
