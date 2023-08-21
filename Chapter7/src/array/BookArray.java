
//null이 출력되는 이유 : 공간만 만들고 데이터를 입력한 게 아니라서..
package array;

public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[5];
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}

}
