package template;

public class ManualCar extends Car {

	@Override //나혼자코딩 내용
	public void wiper() {
		// TODO Auto-generated method stub
		System.out.println("사람이 빠르기를 조절합니다.");
	}
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("브레이크로 정지합니다.");
	}


}