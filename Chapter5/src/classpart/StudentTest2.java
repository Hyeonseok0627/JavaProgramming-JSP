package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.studentName = "안연수";
		
		Student student2 = new Student();
		student2.studentName = "안승연";

		System.out.println(student1);
		System.out.println(student2);
	}

	//console 출력값 = classpart.Student@1e80bfe8
	//classpart : 패키지명, Student : 클래스명, @1e80bfe8 : 메모리의 위치
}
