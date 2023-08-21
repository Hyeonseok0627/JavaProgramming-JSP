package generics;

public class Plastic extends Material{

	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료는 Plastic 입니다.";
	}

}
