package abstractex;

//오류 안나도록 하는 방법
//1번 : 추상매서드 생성
//2번 : DeskTop 클래스를 추상클래스로 변환(: abstract DeskTop)
public class DeskTop extends Computer{

	
	// 추상매서드 생성(이렇게 해야 위에 public class DeskTop extends Computer 여기에서 오류가 안남)
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop typing()");
	}

}
