package classpart;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man m = new Man(40,"James",true,3);
		m.showManInfo();
		
		System.out.println();
		
		Order o = new Order("201803120001","abc123","2018년 3월 12일","홍길순","PD0345-12","서울시 영등포구 여의도동 20번지");
		o.showOrderInfo();
		
		Student3 s3 = new Student3();
		s3.setStudentID(1);
		s3.setStudentName("이름");
		
		s3.setKorean(new Subject("국어",90));
		s3.setMath(new Subject("수학",80));
		
		s3.showStudent3();
		
		
		
		
		
		
		
	}

}
