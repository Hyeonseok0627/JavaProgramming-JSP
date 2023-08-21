//참조 자료형

//클래스 구성 : 멤버변수+매서드+출력
package classpart;

public class Student3 {
	
	//멤버변수
	int studentID; //int, String도 자료형 객체임(int는 기본 자료형, String은 참조 자료형), 기본 자료형은 첫자 소문자, 참조 자료형은 첫자 대문자
	String studentName;
	Subject korean; //Subject라는 클래스를 만들고, 그 클래스(객체)를 불러오는 것
	Subject math; //이렇게 쓰는 이유 : 학생 클래스인데, 과목 이름 변수가 계속 추가되는 게 좋아보이지 않아 과목 클래스를 만들고 세부적인 과목이름이나 점수를 만드는 형식
	
	//매서드
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Subject getKorean() {
		return korean;
	}
	public void setKorean(Subject korean) {
		this.korean = korean;
	}
	public Subject getMath() {
		return math;
	}
	public void setMath(Subject math) {
		this.math = math;
	}
	
	//출력
	public void showStudent3( ) {
		System.out.println(studentID);
		System.out.println(studentName);
		System.out.println(korean.scorePoint);//korean이 클래스이므로 데이터를 가지고 올때, '.'을 써야함
		System.out.println(korean.subjectName);
		System.out.println(math.scorePoint);
		System.out.println(math.subjectName);
	}
}
