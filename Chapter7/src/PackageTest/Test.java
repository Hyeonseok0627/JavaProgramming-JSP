package PackageTest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열 선언 방법 1
		int[] studentId = new int[10];
		studentId[0] = 10; //[]에 있는 숫자 위치는 index라고 함
		studentId[1] = 10;
		studentId[2] = 10;
		studentId[3] = 10;
		studentId[4] = 10;
		studentId[5] = 10;
		studentId[6] = 10;
		studentId[7] = 10;
		studentId[8] = 10;
		studentId[9] = 10;
		System.out.println(studentId.length); //배열의 길이를 나타냄
		
		//배열 선언 방법 2
		int[] studentId2 = {10,20,30,40,50,60,70,80,90,100};
		
	}

}
