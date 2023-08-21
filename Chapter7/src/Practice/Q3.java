package Practice;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int total = 0;
		for (int i = 0; i<5; i++) {
			arr[i] = (i+1) * 2;
			total += arr[i];
			System.out.println(arr[i]);
		}
		System.out.println(total);
	}

}
