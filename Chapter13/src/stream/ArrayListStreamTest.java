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
		
		//stream은 한번 사용하면 재사용불가(선언한 stream을 최종 연산이 수행되고 나면 해당 stream은 더이상 사용불가)
		Stream<String> stream = sList.stream(); 
		stream.forEach(s->System.out.print(s + " "));
		System.out.println();
//		stream.sorted().forEach(s->System.out.println(s+" ")); //위에서 선언한 stream은 최종 실행이 끝난 것이라 다시 실행을 못함
		
		//stream 재사용불가하니 다시 쓰려면 하는 방법
		//stream을 재사용이 안되니 이렇게 사용(1번 방법)
		sList.stream().sorted().forEach(s->System.out.print(s+ " ")); //오름차순으로 정렬
		
		//또 사용하려면 새로 stream을 선언하고 최종 연산 수행해야함(2번 방법)
		//Stream<String> stream2 = sList.stream(); 
		//stream2.sorted().forEach(s->System.out.print(s + " "));
		
	//	sList.stream().map(s->s.length()).forEach(n->System.out.println(n));
	//	sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.println(s));
		
		//stream은 기존 자료를 변경하지 않음
		/*		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");*/
		//이것을 변경하진 않으므로 이후에 또 다르게 배열시키는 stream을 써도 기존 배열에서 원하는 조건에 맞춰서 변형이 될뿐
	}
}
