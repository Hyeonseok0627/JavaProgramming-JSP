package array;

import java.util.ArrayList; //해당 클래스 가지고옴(ArrayList)

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl + shift + o : 전체 클래스 불러오기(직접 만든 클래스말고 기본 만들어져있는 클래스 불러올 때 사용)
		ArrayList<Book> library = new ArrayList<Book>();
		
		//해당 자료형인 Book에 맞춰서 작성
		library.add(new Book("태백산맥","조정래"));
		library.add(new Book("데미안","헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가","유시민"));
		library.add(new Book("토지","박경리"));
		library.add(new Book("어린왕자","생택쥐페리"));
		
		//index값은 해당 for문 사용
		for(int i=0; i<library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		System.out.println("향상된 for문 사용");
		
		//book의 자료형인 Book을 써야함 / String이나 그런거 사용하면 안됨
		for(Book book : library) {
			book.showBookInfo();
		}
	}

}
