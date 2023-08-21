package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//생성자 생성
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		//ArrayList의 자료형이 Customer라서 Customer에 넣되, 생성자는 세 개가 있음(Customer, GoldCustomer, VIPCustomer)
		//인스턴스 생성(새로운 클래스 생성하되, 특정 변수가 들어가 있는 경우 인스턴스라고 함)
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYoul = new GoldCustomer(10040, "이율곡");
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("====== 고객 정보 출력 ======");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		int price = 10000;
		for(Customer customer : customerList) {
			//calcPrice(price) 여기에 오버라이딩이 되어 있어, 각 생성자별 다른 매서드를 가지고 온다.
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이 " 
					+ cost + "원 지불하셨습니다." );
		System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " 
					+ customer.bonusPoint + "점입니다." );
		}
		
	}
}
