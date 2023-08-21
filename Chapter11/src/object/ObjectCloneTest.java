package object;

//class앞에 public이 없으면 같은 패키지 내에서만 해당 클래스를 가지고올 수 있음
class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + "," + "y = " + y;
	}
}

class Circle implements Cloneable {
	Point point;
	int radius;
	
	Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new Point(x, y);
	}
	
	public String toString() {
		return "원점은 " + point + "이고," + "반지름은 " + radius + "입니다.";
	}
	
	//throws CloneNotSupportedException : clone() 매서드 사용 시 발생할 수 있는 오류를 예외 처리한다는 의미
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class ObjectCloneTest {

	//clone() 매서드를 사용하려면 객체를 복제해도 된다는 의미로 클래스에 Cloneable 인터페이스를 구현해야함
	//clone() 매서드만 명시하고, 인터페이스를 명시하지않으면 clone()매서드 호출 시 CloneNotSupportedException 이런 에러가 발생하므로 해당 내용 작성하여 인터페이스까지 구현하는 것
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Circle circle = new Circle(10,20,30);
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}
}
