package collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return (s1.compareTo(s2)) *-1; //내림차순 정렬
	}
}

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comparator 이걸 쓰게 되면 ()안에 new MyCompare() 넣어줘야함
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);
	}

}
