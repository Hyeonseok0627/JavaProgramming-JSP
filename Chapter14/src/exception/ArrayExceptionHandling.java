package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		// try{}를 수행하고 -> 오류가 뜨면 catch(오류 관련 클래스 관련 변수){}로 진행
		// -> 해당 매서드 내용이 출력(System.out.println(e); : e관련 오류명과 어디 위치에서 오류가 떴는지 출력)
		// 변수 갯수는 5개인데, 돌리는 건 6개하라고 하니 예외 오류가 뜬 케이스
		try{
			for(int i = 0; i<=5; i++){
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("예외 처리 부분");
//			return; //여기값까지만 반환이라 "프로그램 종료"가 출력되지 않음
		}
		// return 다음인데도 finally 매서드 값은 출력이 됨
		// 그 이유는 try {}가 출력되면 finally {} 는 그 다음에 무조건 출력이 되므로
		// finally는 반영이 된 다음에 return 값이 반환이 됨
//		finally {
//			System.out.println("Finally"); 
//		}
		System.out.println("프로그램 종료");
	}
}
