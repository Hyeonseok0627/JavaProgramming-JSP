package classpart;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date = new MyDate();
		//set과 get 사용 및 private을 사용하는 이유는
		//public을 쓰면 멤버 변수의 정보가 오류일 때, 오류 정보를 그대로 가지고 오므로
		//문제가 생김
		//그것을 방지하기위해 사용
//		date.month = 2; 
//		date.day = 31;
//		date.year = 2018;
		date.setMonth(2);
		date.setDay(31);

	}

}
