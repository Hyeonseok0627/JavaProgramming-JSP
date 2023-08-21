package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;

		int price = 10000;
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " 
		+ vc.calcPrice(10000) + " 원 입니다."); //vc는 하위클래스인 VIPCustomer의 멤버변수는 못 불러오지만, 오버라이딩 한 내용은 반영
	}

}
