package array;

public class Student {
	private String studentId;
	private String name;
	
	//생성자 생성
	public Student( ) {}; //디폴트 생성자
	
	public Student(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	//getter setter
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentId + "," + name);
	}

}
