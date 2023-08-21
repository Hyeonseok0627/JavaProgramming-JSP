package chapter2;

import java.util.Scanner; // console 입력창에 키보드로 입력받기 위해 사용
// Scanner 클래스는 java.util 패키지에 있어서 이렇게 불러옴
public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4-1 example
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		if(operator == '+') {
			System.out.println(num1+num2);
		}else if(operator == '-') {
			System.out.println(num1-num2);
		}else if(operator == '*') {
			System.out.println(num1*num2);
		}else if(operator == '/') {
			System.out.println(num1/num2);
		}
		//위 방법과 또 다른 방법
		switch(operator) {
		case '+' :
			System.out.println(num1+num2);
			break;
		case '-' :
			System.out.println(num1-num2);
			break;
		case '*' :
			System.out.println(num1*num2);
			break;
		case '/' :
			System.out.println(num1/num2);
			break;
		}
		//4-2 example
		//짝수 구구단만 출력
		//continue를 사용하지않는 방법 : for(int i=2; i<9; i=i+2)
		for(int i=2; i<9; i++) {
			if(i%2==1 ) {
				continue;
			}
			for(int j=1; j<9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
		//4-3 example
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j>i) {
					break;
				}
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
		//4-4 example
		// 해당 형식을 이용하여 반복문 활용 후 작성
		// 123*
		// 12***
		// 1*****
		// *******
		
		int count = 3;
		for(int i=4; i<=7; i++) {
			for(int j=1; j<=i; j++) {
				if(j<=count) {
					System.out.print(" ");
				}else {
					System.out.print("*"); //println을 쓰면 한줄에 '*' 하나씩 나와서 그냥 print 사용
				}		
			}
			count--; // 다음 공백은 하나씩 줄어드는 것이라 사용
			System.out.println(); // 행을 바꿔줘야하니 사용
		}
		
		System.out.println();
		
		//4-5 example
		count = 3;
		for(int i=4; i<=7; i++) {
			for(int j=1; j<=i; j++) {
				if(j<=count) {
					System.out.print(" ");
				}else {
					System.out.print("*"); 
				}		
			}
			count--;
			System.out.println();
		}
			
		count = 1;
		for(int i=6; i>=4; i--) {
			for(int j=1; j<=i; j++) {
				if(j<=count) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			count++;
			System.out.println();
		}
	}
}
