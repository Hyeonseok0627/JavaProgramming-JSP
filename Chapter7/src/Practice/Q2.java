package Practice;

import java.util.ArrayList;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> alphabets2 = new ArrayList<Character>();
		char[] alphabets = new char[26];
		char ch = 'A';
		//char ch = 'A'+32; //두 번째 방법
		for(int i=0; i<alphabets.length; i++, ch++) {
			//alphabets[i] = (char) (ch+32); //첫 번째 방법
			//System.out.println(alphabets[i] + "," + (int)alphabets[i]);
			alphabets[i] = ch;
			System.out.println((char)(alphabets[i]-32) + "," + (int)alphabets[i]);
		}
	}

}
