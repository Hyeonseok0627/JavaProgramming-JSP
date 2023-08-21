package template;

public class AICar extends Car {

	@Override //나혼자코딩 내용
	public void wiper() {
		// TODO Auto-generated method stub
		System.out.println("비나 눈의 양에 따라 빠르기를 자동으로 조절됩니다.");
	}
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 알아서 방향을 전환합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("스스로 멈춥니다.");
	}


	
	//@Override
	//public void run(); //final이 붙은 템플릿 매서드는 오버라이드해서 매서드 수정 불가
	
}
