package array;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {10,20,30,40,50};
		int [] array2 = {1,2,3,4,5};
		
		//arraycopy(복붙할 대상, 복붙할 대상의 시작 위치, 복붙해서 가져올 대상, 복붙할 위치, 복붙할 개수)
		System.arraycopy(array1, 0, array2, 1, 4);
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
