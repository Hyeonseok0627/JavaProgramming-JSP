//JDK에 있는 기본 Object클래스 활용하는 것

package object;

class Book {
	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	//toString() 매서드 재정의 //toString 입력 후 ctrl+스페이스바 입력해서 자동완성 기능을 통해 override 
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return bookTitle + "," + bookNumber;
//	}
}

public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book(200, "개미");
		//이렇게 하면 book2와 book1의 주소는 같아지고 메모리는 book1것을 그대로 써서 새롭게 메모리에 저장되는게 아님
		Book book2 = book1; //book1 대신 new Book(200, "개미")로 하게되면 equals에 false가 나옴, 그 이유는 new하면 새롭게 메모리에 잡히는 것이라 주소가 book1과 book2의 주소가 달라지니 false로 나옴
		
		System.out.println(book1); //인스턴스 주소까지 나옴
		System.out.println(book2);
		System.out.println(book1.equals(book2)); //값의 동일 유무를 판단
//		System.out.println(book1.toString()); //인스턴스 주소까지 나옴

		String str = new String("test");
		Integer i1 = new Integer(1000); //여기서는 축약어인 int를 쓰면 안됨, int를 쓰면 불러올때, integer의 매서드를 못 불러옴
//		i1. //이러면 부를수 있는 매서드를 검색가능
		//		int i1 = new Integer(1000);
//		i1. //이러면 Integer의 매서드를 못 불러옴
		

		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(i1);
		System.out.println(i1.toString());
		//int str2 = i1.toString(); //int라는 Integer의 축약어를 쓰면 오류가 남
		String str2 = i1.toString();
	}
}
