//나혼자코딩 내용
package object;

class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day; //멤버변수에 매개변수를 넣어준 개념
		this.month = month;
		this.year = year;
	}

	//String, Integer는 재정의할 필요없이 그냥 equals쓰면 주소 안보고 값만 비교하는 것이라 true가 나옴
    //하지만, 여기처럼 MyDate같이 다른 클래스형이 나오는 경우엔 그냥 equals만 쓰면 주소도 동일한지를 비교하므로 값을 비교해서 동일 유무 판단하도록 재정의를 해줘야함
	//equals() 재정의 : equals()매서드는 원래 두 인스턴스의 주소를 비교하는 것이라, 주소는 다르지만 값은 같아 동일한 객체인 것이라 false가 아닌 true로 나오도록 재정의한 것
	//즉, "==" : 물리적 메모리 주소가 같은지만 비교, "equals" : 비교 대상의 인스턴스 주소값이 같은지 비교
	//그래서, new를 하게되면 값은 같아도 서로 다른 인스턴스가 되어서 주소값이 달라짐
	//이럴때, 값은 같으므로 논리적으로도 동일성이 있음을 구현하도록 하는게 equals 재정의
	//물리적 동일성은 인스턴스 주소가 같은 경우(new를 해서 새로 인스턴스 생성한 게 아닌것)
	//논리적 동일성은 두 인스턴스의 변수가 같은 경우(이럴때는 물리적 동일성은 달라서 false로 나오지만, 실제적으로는 같은값이라 동일하다고 true로 처리해주어야함, 이때 equals() 재정의하여 true로 나오도록 해주는 것)
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof MyDate) {
			MyDate md = (MyDate)obj; //obj를 MyDate형으로 만들어줌
			if(this.day == md.day
					&& this.month == md.month
					&& this.year == md.year) {
				return true;
			}else {
				return false;
			}
		}
 		return false;
	}

	// hashcode() 매서드 재정의
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(""+this.year+this.month+this.day) ; //""이것을 써야 문자열인 string으로 만들어주는 것(""없으면 year, month, day 숫자를 그냥 다 더해져서 나오는 오류 발생)
		return a;
	}

}
public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(10, 9, 2004);
		MyDate date2 = new MyDate(10, 9, 2004);
		System.out.println(date1.equals(date2));
		
	}
}
