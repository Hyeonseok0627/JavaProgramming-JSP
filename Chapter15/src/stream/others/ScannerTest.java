package stream.others;

import java.util.Scanner;

// Scanner 클래스는 입력 클래스라서 예외처리할 필요없음
public class ScannerTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름:");
		String name = scanner.nextLine(); //한 줄을 읽음
		System.out.println("직업:");
		String job = scanner.nextLine();
		System.out.println("사번:");
		int num = scanner.nextInt();
				
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}
}
