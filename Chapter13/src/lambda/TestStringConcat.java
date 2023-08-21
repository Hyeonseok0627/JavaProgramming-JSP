package lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		//클래스에서 인터페이스 구현
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2);
		int i = 100;
		
		//람다식으로 인터페이스 구현
		//클래스로 인스턴스를 생성할 필요없이 바로 매서드 구현 가능(더 간결해짐)
		//즉, StringConCatImpl 클래스를 생성한 후, 해당 클래스로 인터페이스를 구현할 필요없이 람다식으로 바로 인터페이스 구현
		StringConcat concat2 = (s, v)->System.out.println(s + "," + v ); //System.out.println(i);
		concat2.makeString(s1, s2);
		i = 300;
		
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				
				System.out.println( s1 + "," + s2 );
			}
		};
		
		concat3.makeString(s1, s2);
		
	}

}
