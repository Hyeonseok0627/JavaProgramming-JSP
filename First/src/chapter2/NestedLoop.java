package chapter2;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dan: 앞의 글자, times: 뒤의 글자로 출력됨
		for(int dan=2; dan<=9; dan++) {
			for(int times=1; times<=9; times++) {
				System.out.println(dan + "X" + times +"=" + dan*times);
			}
			System.out.println(); //구구단 한회가 끝날 때마다 빈칸 생성
		}
	}

}
