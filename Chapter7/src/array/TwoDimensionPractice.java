package array;

public class TwoDimensionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//4차원 배열
		//int [][][][] c = {{{{1,2},{1,2}},{{1,2},{1,2}}},{{{1,2},{1,2}},{{1,2},{1,2}}}};
		//3차원 배열
		//int [][][] b = {{{1,2},{1,2}},{{3,4},{3,4}}};
		
		char[][] alphabets = new char[13][2];
		char a = 'a';
		for (int i = 0; i < alphabets.length; i++) {
			for (int j = 0; j < alphabets[i].length; j++) {
				alphabets[i][j] = a++;
				System.out.println(alphabets[i][j]);
				System.out.println(" ");
			}
			System.out.println();
		}
	}
}
