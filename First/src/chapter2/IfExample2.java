package chapter2;

import java.util.Scanner; //Scanner라는 클래스를 가지고 오라는 것

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); //Scanner 클래스를 활용하여 console 창에 입력할 수 있게 한 것
		int age = s.nextInt(); // s의 int값을 받아올 수 있는 것
		//Scanner 클래스를 쓰는 것은 자주 활용하니 잘 알아두기
		int charge;
		if(age<8) {
			charge = 1000;
			System.out.println(age + " : 취학 전 아동입니다.");
		}else if(age<14) {
			charge = 2000;
			System.out.println(age + " : 초등학생입니다.");
		}else if(age<20) {
			charge = 2500;
			System.out.println(age + " : 중, 고등학생입니다.");
		}else {
			charge = 3000;
			System.out.println(age + " : 일반인입니다.");		
		}
		System.out.println("입장료는"+ charge + "원입니다.");
	}

}
