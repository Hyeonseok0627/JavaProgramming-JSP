package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Computer c = new Computer();
//		NoteBook n = new NoteBook();
		DeskTop d = new DeskTop();
		MyNoteBook m = new MyNoteBook();
		d.display();
		d.typing();
		m.display();
		m.typing();
	}

}
