package chapter2;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); //이것 입력 후 ctrl+shift+o 입력하면 import가 자동생성됨
		String str = s.nextLine(); //키보드에서 입력한 값을 변수에 저장
		// 랜덤 숫자를 받아오는 방법
		Random r = new Random(); //랜덤숫자 출력을 위한 클래스 선언
		int computerNum = r.nextInt(3); //0~2까지의 랜덤 숫자
		String computer = "";
		if(computerNum == 0) {
			computer = "가위";
		}else if(computerNum == 1) {
			computer = "바위";
		}else {
			computer = "보";
		}
				
		//가위바위보 경우의 수 제작 방법(2번)(1번보다 간략하게 작성하는 법)
		System.out.println(computer);
		if(str.equals(computer)) {
			System.out.println("비겼습니다.");
		}else if((str.equals("가위") && computer.equals("보"))
				|| (str.equals("바위") && computer.equals("가위"))
				||  (str.equals("보") && computer.equals("바위"))) {
			System.out.println("이겼습니다.");
		}else {
			System.out.println("졌습니다.");
		}
		
		//에러가 어디서 뜬 것인지 파악할 때 디버그 작업을 함
		//우선 확인할 포인트 시작점에 왼쪽 파란색쪽 열번호에 더블클릭하여 breakpoint 지정
		//이후에 상단에 벌레표시 누르면 디버그 작업 진행
		//F5번은 현재 브레이크 포인트 열부터 진행
		//F6번은 다음 열 부분으로 가게 됨
		//이렇게 하면서 어떤 열에서 값이 잘못되서 실행오류가 있는 지 파악하는 작업
		
		
		
		//가위바위보 경우의 수 제작 방법(1번)
		//문자 비교 시 equals('=' 이것과 같은 개념) 사용
//		System.out.println(computer);
//		if(str.equals(computer)) {
//			System.out.println("비겼습니다.");
//		}else if(str.equals("가위")) {
//			if(computer.equals("바위")) {
//				System.out.println("졌습니다.");
//			}else {
//				System.out.println("이겼습니다.");
//			}
//		}else if(str.equals("바위")) {
//			if(computer.equals("가위")) {
//				System.out.println("이겼습니다.");
//			}else {
//				System.out.println("졌습니다.");
//			}
//		}else if(str.equals("보")) {
//			if(computer.equals("가위")) {
//				System.out.println("졌습니다.");
//			}else {
//				System.out.println("이겼습니다.");
//			}
//		}
	}

}
