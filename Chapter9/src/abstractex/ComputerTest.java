package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Computer c = new Computer(); //추상클래스는 불러올 수 없음, 추상클래스는 상속을 만들기위해서 사용하는 것
		//NoteBook n = new NoteBook(); //즉, 매서드가 구현되지 않아서 추상클래스는 인스턴스로 생성이 불가
		DeskTop d = new DeskTop();

		MyNoteBook m = new MyNoteBook();
		d.display();
		d.typing();
		m.display();
		m.typing();
		
	}

}
