//해당 프로그램 내에서 단 하나의 인스턴스만 존재하도록 설계
//Singleton은 시간 등의 단 하나의 인스턴스만 존재하면 될 때 사용
package Singleton;

public class Company {

	//1번 -> 2번 -> 3번 순으로 3개를 생성해야 Singleton 패턴의 하나의 인스턴스만 생성토록 하는 방법
	//Company 클래스 안에서만 쓰일 유일한 인스턴스
	private static Company instance = new Company(); //2번
	
	//디폴트 생성자를 직접 만들지 않으면
	//눈에는 보이지않지만 자동생성이 되어
	//여러 인스턴스가 생길 수가 있음
	//그래서 아래와 같이 직접 디폴트 생성자를 만들고 private을 걸어줌
	//private Company(){} : private 생성자로서, 외부에서 해당 생성자를 불러올 수 없게 하겠다는 의미
	private Company() {} //1번
	
	//return type: Company
	//instance 객체를 외부클래스에서 가져갈 수 있도록 하는 방법
	//3번
	public static Company getInstance() {
		if(instance == null)
			instance = new Company(); //instance가 null인 경우 한 개의 인스턴스를 새로 생성해주어라의 의미
		return  instance;
	}

}
