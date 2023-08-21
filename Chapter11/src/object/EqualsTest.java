package object;

class Student {

	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentId + "," + studentName;
	}

	//equals() 매서드 재정의
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId) {
				return true;
			}else {
				return false;
			}
		}
		return false; //obj가 studentId가 아닐 경우
	}
	
	//해시코드값으로 학번을 반환하도록 매서드 재정의
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.studentId;
	}
	
}
public class EqualsTest {
	
	public static void main(String[] args) {
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
	
		if(studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		}else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		}
		
		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		}else {
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		}
		
		if(studentLee == studentSang) {
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		}else {
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		}
		
		if(studentLee.equals(studentSang)) {
			System.out.println("studentLee와 studentSang은 동일합니다.");
		}else {
			System.out.println("studentLee와 studentSang은 동일하지 않습니다.");
		}
	
		//hashCode 매서드 재정의한 것을 출력
		System.out.println("studentLee의 hashCode : " +studentLee.hashCode());
		System.out.println("studentSang의 hashCode : " +studentSang.hashCode());
		
		System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값 : " + System.identityHashCode(studentSang));
	}
}
