package Singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Company 클래스에서 company 생성자를 private을 한 것이라
		//외부클래스에서 함부로 company 생성 못함(company 생성자 호출을 막은 것이라)
		//Company company = new Company();
		
		//Company 클래스의 'instance' 인스턴스를 불러온 것
		//c1, c2가 Company 클래스의 'instance'라는 인스턴스에 지정
		//instance는 단 하나의 인스턴스이므로, c1과 c2의 주소는 동일함
		//객체를 따로 생성하지않고, 클래스 이름으로만 들고 올 수 있는 것
		//이래야 단 하나의 인스턴스만 존재하게 할 수 있음
		//즉, Company c3 = new Company(); 이런식으로 외부클래스에서 가져온 것에 또 다른 클래스 생성되는 것을 막는다는 개념
		Company c1 = Company.getInstance();
		
		Company c2 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
		
		//Singleton 사용하는 예시
		//Calendar도 여러개가 되면 안되므로 인스턴스가 하나뿐인 것으로 사용
		Calendar cal = Calendar.getInstance();
		
	}

}
