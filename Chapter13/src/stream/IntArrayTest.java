package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sumVal = Arrays.stream(arr).sum();
		//count() 반환값의 타입이 long이므로 int형으로 캐스트(자료형을 변경)를 함
		int count = (int) Arrays.stream(arr).count(); 
		
		System.out.println(sumVal);
		System.out.println(count);
		
		//System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b));
		
	}
}
