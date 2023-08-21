package generics;

public class Plastic extends Material {

	//상속받은 매서드 override
	public void doPrinting() {
	System.out.println("Plastic 재료로 출력합니다.");
	}
	//상속받은 매서드 override
	public String toString() {
		return "재료는 Plastic입니다.";
	}
}
