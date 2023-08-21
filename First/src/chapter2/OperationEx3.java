package chapter2;

public class OperationEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//단락 회로(조건에 따라 일부 항이 실행되지 않는 회로)
		int num1 = 10;
		int i =2;
		
		boolean value = ((num1 = num1 +10)<10) && ((i = i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		/* && : and 연산자라서 두 개항이 모두 참이어야 뒷 항도 실행이 되는데
		 * 앞 항이 거짓이므로 실행이 안되서 i값은 그대로 2로 출력
		 */
		
		value = ((num1 = num1 +10)>10) || ((i =i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		/* || : or 연산자라서 두 개항 중에 하나만 참이면 되는데, 
		 * 앞 항이 이미 참이 나왔으므로 뒷 항은 실행하지 않게됨
		 */
		
		//복합 대입 연산자(간단히 작성하기 위해 사용)
		//value = ((num1 += 10)>10) || ((i =i+2)<10);
		
	}

}
