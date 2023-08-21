package witharraylist;

//extends 상속받을 클래스 : 상속받는다는 개념
public class GoldCustomer extends Customer {

	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName); // 상위클래스인 customer 클래스의 해당 생성자를 불러오는 것
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);
	}
}
