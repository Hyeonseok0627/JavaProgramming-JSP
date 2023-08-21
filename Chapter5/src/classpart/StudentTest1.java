package classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//student1, student2 : 인스턴스
		Student student1 = new Student();
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student();
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
	}

}
