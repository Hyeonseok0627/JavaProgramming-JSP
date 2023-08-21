package bookshelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf; //배열에 문자열만 들어갈 수 있도록 함
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
