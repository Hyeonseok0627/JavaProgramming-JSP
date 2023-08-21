package classpart; //자바에서는 package가 폴더의 개념

//패키지 선언하기(패키지 안에 패키지를 넣어서 계층구조 만드는 방법)
//패키지 선택 -> new 클릭 -> name : 부모패키지.자식패키지 -> 자식패키지 클릭 후 view menu 클릭 -> package presentation -> Hierarchical 클릭 

//Student : 클래스 이름
public class Student {
	//숫자에는 int, 문자에는 string 사용
	//밑에 내용이 멤버변수
	int studentID; 
	String studentName;
	//private String studentName; //private 접근제어자 사용(이러면 외부 클래스에서 사용 불가능)
	int grade;
	String address;

	
	//생성자 생성 (getter, setter를 쓰지않고 간편히 할 수 있음)
//	public Student() {}; : 디폴트 생성자를 생성해야 함
//	public Student(int studentID, String studentName, int grade, String address) {
//		this.studentID = studentID;
//		this.studentName = studentName;
//		this.grade = grade;
//		this.address = address;
//	}
	
	//변수만 있으면 아무 역할을 못하며, 매서드를 활용하여 변수 지정을 하여 클래스를 사용할 수 있도록 해줌
	
	//밑에 내용이 매서드, showStudentInfo() : 함수 이름
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
	
	//클래스 기능을 구현하는 매서드(학생 이름을 반환하는 매서드)
	public String getStudentName() {
		return studentName;
	}
	//클래스 기능을 구현하는 매서드(학생 이름을 부여하는 매서드)
	public void setStudentName(String name) {
		studentName = name;
	}

	// 자동완성한 것
	// Source 클릭 -> Generater Getters and Setters 클릭 -> 해당 변수 체크 후 generate 클릭
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//클래스에 main 함수 표함시키기
	public static void main(String [] args) {
		Student studentAhn = new Student(); //Student 안에 새로운 studentAhn 이라는 클라스 선언
		//studentAhn.studentName = "안연수"; : 클래스의 멤버 변수에 값('안연수')을 대입하는 코드, 밑에랑 같은 결과가 나오는 방식이지만, set과 get을 사용하는 게 더 좋음
		studentAhn.setStudentName("안연수"); //studentAhn 클래스의 StudentName을 "안연수"로 지정하라는 표현
				
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName()); //studentAhn 클래스의 StudentName을 불러오라는 표현
				
	}
}
