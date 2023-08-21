package Staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static변수에 private하고, get만 허용해준 경우 Student클래스 정보를 가져오는 방법
		System.out.println(Student.getSerialNum());
		
		//인스턴스가 static변수를 모두 공유하는 문제로 두 인스턴스 값이 모두 10001이 나오는 케이스
		
		//Student studentJ = new Student();
		//System.out.println(studentJ.serialNum);
		//studentJ.serialNum++;
		
		
		//Student studentT = new Student();
		//studentJ만 증가한건데, static변수인 serialNum은
		//인스턴스들이 모두 공유하는 것이라 둘다 1씩 증가한 10001값이 나옴
		//System.out.println(studentJ.serialNum);
		//System.out.println(studentT.serialNum);
		
		
		//각 인스턴스들이 다른 증가한 값을 갖도록 한 케이스
		//studentID 이건 멤버변수라서 인스턴스끼리 공유안하는 변수
		//그러므로 첫번째 J가 한번 더해진 10001이고, 순서대로 T는 한번 더 더해진 10002, K는 10003임
		
		Student studentJ = new Student();
		System.out.println(studentJ.studentID); //studentJ.studentID = 10001

		Student studentT = new Student();
		System.out.println(studentT.studentID); //studentT.studentID = 10002
		
		Student studentK = new Student();
		System.out.println(studentK.studentID); //studentK.studentID = 10003
		
		
		//static변수는 참조변수인 인스턴스변수로 참조하지말고, 클래스명으로 참조해야 더 맞는 표현
		//System.out.println(studentJ.serialNum); //serialNum은 공유값이므로 맨 마지막에 끝난 10003이라는 값이 동일하게 나옴
		//System.out.println(studentT.serialNum);
		//System.out.println(studentK.serialNum);
		
		//System.out.println(Student.serialNum); //serialNum은 공유값이므로 맨 마지막에 끝난 10003이라는 값이 동일하게 나옴
		//System.out.println(Student.serialNum);
		//System.out.println(Student.serialNum);
		
		
		
	}

}
