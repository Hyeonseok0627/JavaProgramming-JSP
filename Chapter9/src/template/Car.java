package template;

//추상 클래스
public abstract class Car {

	//추상 매서드 내용
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper(); //나혼자코딩 내용
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//템플릿 매서드 (로직 흐름을 정의하는 역할, 모든 하위 클래스가 공통으로 사용하고 코드를 변경하면 안되서 이렇게 설정)
	final public void run() {
		startCar();
		drive();  
		wiper(); //나혼자코딩 내용
		stop();
		turnOff();
	}
}
