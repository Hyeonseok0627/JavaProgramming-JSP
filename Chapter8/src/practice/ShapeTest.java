package practice;

import java.util.ArrayList;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

//상속
class Circle extends Shape {
	//오버라이드해서 Circle 클래스의 매서드 내용 변경
	public void draw() {
		System.out.println("Circle");
	}
}

//상속
class Triangle extends Shape {
	//오버라이드해서 Triangle 클래스의 매서드 내용 변경
	public void draw() {
		System.out.println("Triangle");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<Shape>();
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());
		
		for(Shape s : list) {
			// 오버라이드 안하면 draw의 원래 매서드 내용인 "Shape"가 세 개 클래스에서 똑같게 출력되어야하지만
			// 오버라이드 한 것이라 Circle 클래스는 "Circle", Triangle 클레스는 "Triangle"로 출력됨
			s.draw();
		}
	}
}
