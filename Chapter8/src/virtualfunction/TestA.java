package virtualfunction;

public class TestA {

	int num;
	
	void aaa() {
		System.out.println("aaa() 출력"); //매서드는 가상 매서드 영역이 있어 다른 클래스들에서 가져오는 개념이라 매서드 주소는 동일함
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA a1 = new TestA();
		a1.aaa();
		TestA a2 = new TestA();
		a2.aaa();
	}

}
