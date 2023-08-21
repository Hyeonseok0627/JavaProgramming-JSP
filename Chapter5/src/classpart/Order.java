//P.152의 2번 문제
package classpart;

import java.time.LocalDateTime;

public class Order {
	String orderId;
	String id;
	String orderDate;
	String name;
	String goodsId;
	String orderAddress;
	
	//생성자 : 디폴트되어 있음
	//생성자 형식
	
//	public 클래스 이름(출력할 변수들) {
//		
//	}
	
	// 이렇게 한 개 클래스에 생성자가 두 개 이상 제공되는 경우 : 생성자 오버로드
	// 파라미터를 다르게 해야 생성이 가능함.
	// 즉, 생성자를 여러개 만들 수 있으며 매서드(클래스에 여러 기능 구현을 시켜주는) 또한 여러개가 생기는 것
	// 생성자는 기존 구조인 
	//클래스 명(파라미터) {멤버변수}
	//각 멤버변수별 매서드
	//해당 구조를 이렇게 간단히 표현가능한 구조로 변환
	//클래스 명(새롭게 정의한 매개변수) {매개변수 정의}
	
	
	public Order() {
		
	}//디폴트 생성자(꼭 있어야 실행이 됨)
	
	public Order(String orderId, String id) {
		this.orderId = orderId;
		this.id = id;
		
	} 
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	
	public void showOrderInfo( ) {
		System.out.println("주문 번호 : "+orderId);
		System.out.println("주문자 아이디 : "+id);
		System.out.println("주문 날짜 : "+orderDate);
		System.out.println("주문자 이름 : "+name);
		System.out.println("주문 상품 번호 : "+goodsId);
		System.out.println("배송 주소 : "+orderAddress);
	}

}
