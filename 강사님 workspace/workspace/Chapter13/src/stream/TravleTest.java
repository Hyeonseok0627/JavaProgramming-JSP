package stream;

import java.util.ArrayList;
import java.util.List;

public class TravleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(new TravelCustomer("이순신", 40, 100));
		customerList.add(new TravelCustomer("김유신", 20, 100));
		customerList.add(new TravelCustomer("홍길동", 10, 50));
		
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 여행비용은 : "+ total + " 입니다.");
		
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력");
		customerList.stream().filter(c->c.getAge()>=20)
		.map(c->c.getName())
		.sorted().forEach(s->System.out.println(s));
	}

}






