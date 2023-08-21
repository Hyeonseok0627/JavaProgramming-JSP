//P.152의 최종 문제(각 클래스의 주문 내용을 인스턴스로 생성 후 주문 내용 출력)
package classpart;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man m = new Man(); //클래스 선언, 'm' 인스턴스 생성
		m.setAge(40);
		m.setName("James");
		m.setMarried(true);
		m.setChild(3);
		m.showManInfo(); //출력
		
		System.out.println();
		
		//Order 클래스에서 만든 생성자 형식에 맞춰서 생성
		//인스턴스 변수 초기화(OrderId=201803120001, Id=abc123로 지정)와 새로운 클래스 생성(이 새로운 클래스가 어째보면 인스턴스임)
		Order o = new Order("201803120001","abc123");
//		o.setOrderId("201803120001");
//		o.setId("abc123");
		o.setOrderDate("2018년 3월 12일");
		o.setName("홍길순");
		o.setGoodsId("PD0345-12");
		o.setOrderAddress("서울시 영등포구 여의도동 20번지");
		o.showOrderInfo(); //출력
		
		System.out.println();
		
		//Student3, Subject 클래스를 활용한 인스턴스 구현 후 출력
		
		//변수 초기화할 때마다 set을 여러개 작성하면 불편하니, 생성자를 사용
		Student3 s3 = new Student3(); //Student3의 새로운 클래스 선언(s3 : 인스턴스)
		s3.setStudentID(1); //인스턴스 변수 초기화
		s3.setStudentName("이름");
		//Subject sj = new Subject(); //Subject는 또 하나의 클래스라서 따로 선언해줘야 함
		//sj.setScorePoint(90); //인스턴스 변수 초기화
		//sj.setSubjectName("국어");
		
		//생성자 생성한 후 위에 세 줄을 이렇게 한 줄로 간단히 작성(인스턴스 변수 초기화와 클래스 선언 동시)
		//Subject sj = new Subject("국어",90);
		//Subject sj2 = new Subject("수학",80);
		//s3.setKorean(sj);//위에 선언한 sj, sj2 클래스를 s3에 저장을 해주는 개념
		//s3.setMath(sj2);
		
		//위 내용을 더 간단히 표현하면(새로운 클래스 선언 생략)
		s3.setKorean(new Subject("국어",90));
		s3.setMath(new Subject("수학",80));
		
		//출력(Student3 클래스에 출력세부 세팅을 했고, 그것을 가지고오는 것)
		s3.showStudent3();
		
		//즉, 위 작업은 이미 만들어진 클래스에 인스턴스 변수를 새롭게 지정한 초기화된 새로운 클래스를 생성한 작업
		//생성자를 만드는 것도 새로운 클래스를 만들때, 간단한 형식으로 작성하기 위해서 기존 클래스에 생성자를 만들고, 새로운 클래스 생성 시 그 형식을 따오는 것
		
		
		//접근제어자 : public, private
		//public : 해당 접근제어자로 선언한 변수나 매서드는 외부 클래스에서 사용 가능
		//private : 해당 접근제어자로 선언한 변수나 매서드는 외부 클래스에서 사용 불가능
	}

}
