package generics;

public class GenericMethod {

	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point<Integer, Integer> p1 = new Point<Integer, Integer>(0,0);
		Point<Integer, Integer> p2 = new Point<Integer, Integer>(10,10);
		
		double rect = GenericMethod.<Integer,Integer>makeRectangle(p1, p2);
		System.out.println("두점으로 만들어진 사각형의 넓이는" + rect + "입니다.");
	}

}











