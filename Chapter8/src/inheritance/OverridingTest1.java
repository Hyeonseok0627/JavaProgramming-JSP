package inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer lee = new Customer(10010, "이순신");
		lee.bonusPoint = 1000;
		
		VIPCustomer kim = new VIPCustomer(10020, "김유신", 12345);
		kim.bonusPoint =10000;
		
		int price = 10000;
		System.out.println(lee.getCustomerName()+ " 님이 지불해야 하는 금액은 "
				+ lee.calcPrice(price)+ " 원 입니다.");
		System.out.println(kim.getCustomerName()+ " 님이 지불해야 하는 금액은 "
				+ kim.calcPrice(price)+ " 원 입니다."); //VIPCustomer은 오버라이딩으로 같은 클래스명을 썼지만, 매서드 내용 변경해서 값이 다름
	}

}
