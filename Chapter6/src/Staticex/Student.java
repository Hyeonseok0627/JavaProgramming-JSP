package Staticex;

public class Student {

	//static int serialNum =10000;
	//int studentID;
	//String studentName;
	
	//public Student() {
		
		//인스턴스 각각 번호 증가되도록 함
		//serialNum++;
		//studentID = serialNum;
	//}
	

	//static변수가 중요해서 private해서 외부클래스에서 가져가는 것만 되고
	//수정은 안되게 하는 방법
	
	private static int serialNum =10000;
	int studentID;
	String studentName;
	
	public Student() {
		
		//인스턴스 각각 번호 증가되도록 함
		serialNum++;
		studentID = serialNum;
	}
	
	//외부클래스에서 가져갈 수 있도록만 함(source -> getter 활용)
	//static 매서드
	public static int getSerialNum() {
		
		//지역변수는 해당 매서드가 호출될 때 생성, 매서드가 끝날 때 소멸
		//그래서 해당 매서드안에서 어떻게 쓰든 상관없음
		int i = 10; // i는 매서드 안에서 생성된 것이라 지역변수
		i++;
		System.out.println(i);
		
		//인스턴스변수는 인스턴스가 생성될 때 사용가능한데,
		//static은 인스턴스 생성 유무와 상관없이 쓸 수 있어
		//인스턴스가 생성되지 않았는데 여기서 인스턴스변수를 사용하는 개념이 될 수도 있어 사용불가
		//studentName = "홍길동"; //멤버변수 or 인스턴스변수
		
		//static변수이므로, static 매서드 안에서 사용은 문제없음
		return serialNum; //static변수 or 클래스변수
	}

	//get은 해당 데이터를 외부클래스에서 가져가도록 허락하는 것
	//set은 해당 데이터를 외부클래스에서 수정할 수 있도록 허락하는 것
	//public static void setSerialNum(int serialNum) {
		//Student.serialNum = serialNum;
	//}
	
	
	
	
}
