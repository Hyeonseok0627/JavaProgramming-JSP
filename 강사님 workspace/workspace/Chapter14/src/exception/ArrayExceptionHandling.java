package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
			System.out.println("예외 처리 부분");
		} 
		System.out.println("프로그램 종료");
	}

}






