//학생이 특정 버스, 특정 지하철을 탔을 때의 상황에 맞는 매서드를 코딩
//여기에서 인스턴스(클래스에 특정 속성이 들어간 형태로 선언된 클래스)를 총 4개 생성
//(james, tomas, bus100, subwayGreen)
package Cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 10000);
		
		//해당 형식은 bus 클래스에서 생성한 생성자 형식
		Bus bus100 = new Bus(100); //bus100이라는 새로운 클래스 선언(생성)
		james.takeBus(bus100); //james 클래스가 100번 버스를 takeBus한다는 매서드
		james.showInfo(); //james 클래스의 정보를 보여주는 것
		bus100.showInfo(); //bus100 클래스의 정보를 보여주는 것
	
		//해당 형식은 subway 클래스에서 생성한 생성자 형식
		Subway subwayGreen = new Subway(2);
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();
	}

}
