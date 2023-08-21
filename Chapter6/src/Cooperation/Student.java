//객체 간 협력
//(학생의 속성, 매서드), (버스의 속성, 매서드), (지하철의 속성, 매서드)
//각 객체(클래스)간의 협력을 모델링함

package Cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	//해당 인스턴스 변수 초기화를 하고 생성(해당 조건이 있는 생성자를 생성)
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	//버스를 탈때 호출되는 매서드
	//버스라는 객체(클래스)를 받아서, 해당 객체의 매서드를 받는 협업 개념
	//여기에 들어오는 매개변수는 생성된 인스턴스가 들어와야 함
	public void takeBus(Bus bus) {
		bus.take(1000); //bus 클래스의 매서드를 호출한 개념
		money -= 1000;
	}
	
	//지하철을 탈때 호출되는 매서드
	//지하철이라는 객체(클래스)를 받아서, 해당 객체의 매서드를 받는 협업 개념
	//여기에 들어오는 매개변수는 생성된 인스턴스가 들어와야 함
	public void takeSubway(Subway subway) {
		subway.take(1500); //subway 클래스의 매서드를 호출한 개념
		money -= 1500;
	}
	
	
	//학생의 정보를 보여주는 매서드
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}
}
