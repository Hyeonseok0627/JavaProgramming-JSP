package abstractex;

//추상 클래스 생성
public abstract class Computer {

	//추상 매서드 생성
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
