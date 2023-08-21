package array;

public class ArrayTest {

	public static void main(String[] args) {
		//저장된 데이터를 출력만
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		//index 갯수이므로, 0번부터 9번까지 반복하라는 의미
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]); //[i]:index
		}
		
		//데이터 저장과 출력을 둘다
		int[] num2 = new int[10];
	
		for(int i = 0; i<num2.length; i++) {
			num2[i] = i+1;
			System.out.println(num2[i]);
		}
	}

}
