package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		//stream�� �ѹ� ����ϸ� ����Ұ�(������ stream�� ���� ������ ����ǰ� ���� �ش� stream�� ���̻� ���Ұ�)
		Stream<String> stream = sList.stream(); 
		stream.forEach(s->System.out.print(s + " "));
		System.out.println();
//		stream.sorted().forEach(s->System.out.println(s+" ")); //������ ������ stream�� ���� ������ ���� ���̶� �ٽ� ������ ����
		
		//stream ����Ұ��ϴ� �ٽ� ������ �ϴ� ���
		//stream�� ������ �ȵǴ� �̷��� ���(1�� ���)
		sList.stream().sorted().forEach(s->System.out.print(s+ " ")); //������������ ����
		
		//�� ����Ϸ��� ���� stream�� �����ϰ� ���� ���� �����ؾ���(2�� ���)
		//Stream<String> stream2 = sList.stream(); 
		//stream2.sorted().forEach(s->System.out.print(s + " "));
		
	//	sList.stream().map(s->s.length()).forEach(n->System.out.println(n));
	//	sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.println(s));
		
		//stream�� ���� �ڷḦ �������� ����
		/*		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");*/
		//�̰��� �������� �����Ƿ� ���Ŀ� �� �ٸ��� �迭��Ű�� stream�� �ᵵ ���� �迭���� ���ϴ� ���ǿ� ���缭 ������ �ɻ�
	}
}
