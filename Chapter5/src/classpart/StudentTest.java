package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student studentAhn = new Student(); //패키지가 같은 경우에는 클래스를 이렇게 불러올 수 있지만, 패키지가 다른 경우에는 Import를 써서 불러와야함
			Student a = new Student();
			int i = 0;
			studentAhn.studentName = "안연수";
			//set을 써야하는 이유: 해당 클래스를 private해도 불러올 수 있음
			//set을 안쓰면 private했을 때, 외부에서 못 불러옴
			//그렇기때문에 데이터를 주고받을 때는 그냥 적지말고, set과 get을 활용하기
			//그래야 해당 클래스가 private이 되어도 외부에서 불러올 수 있음
			studentAhn.setStudentName("안연수");  
					
			System.out.println(studentAhn.studentName);
			System.out.println(studentAhn.getStudentName());
			studentAhn.showStudentInfo();
	}

}
