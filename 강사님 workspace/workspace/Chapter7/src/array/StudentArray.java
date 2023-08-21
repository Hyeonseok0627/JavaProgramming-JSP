package array;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];
		students[0] = new Student("1001","James");
		students[1] = new Student("1002","Tomas");
		students[2] = new Student("1003","Edward");
		for(int i=0; i<students.length; i++) {
			students[i].showStudent();
		}
	}

}
