package generics;

public class Powder extends Material {

	//상속받은 매서드 override
	public void doPrinting() {
	System.out.println("Powder 재료로 출력합니다.");
	}
	//상속받은 매서드 override
	public String toString() {
		return "재료는 Powder입니다.";
	}
}
