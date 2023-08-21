package Cooperation;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	//해당 조건을 갖춘 생성자 생성
	//매개변수와 멤버변수 이름이 같아서 this를 사용
	//매개변수가 예를 들어서 lineNum이면 'lineNumber = lineNum'으로 쓸 수도 있음
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber; 
	}
	
	//승객을 태웠을 때 호출되는 매서드
	public void take(int money) {
		passengerCount++; //승객이 증가한다
		// this의 money는 멤버변수이고, 뒤에 money는 매개변수로서 멤버변수가 저장된 인스턴스 변수에 대입되는 값
		this.money += money; //돈이 증가한다
	}
	
	//지하철의 정보를 보여주는 매서드
	public void showInfo() {
		System.out.println("지하철" + lineNumber + "의 승객은" + passengerCount + "명이고, 수입은" 
				+ money + "입니다.");
	}
}
