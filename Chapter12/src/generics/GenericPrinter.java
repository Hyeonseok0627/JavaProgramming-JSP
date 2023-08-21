package generics;

//T extends Material : Powder,Plastic의 상위클래스인 Material을 만들어 상속 개념을 만듬
//그 이유는 해당 클래스에서 사용할 수 있는 자료형을 제한을 두기 위해서임
//예를 들어서 3D 프린터에 들어가지 않는 재료까지 여기에 막 다 넣을 수도 있으니, 필요한 재료 관련 클래스만 들어갈 수 있도록 자료형을 제한을 둔 방식
public class GenericPrinter<T extends Material> {
	private T material; // T 자료형으로 선언 (원래는 최상위 클래스인 Object로 선언, 하지만 Object로 선언 시, test 출력시 업캐스팅해줘야하는 번거로움이 생겨서 이렇게 사용 )

	// T 자료형 변수 material을 반환하는 제너릭 매서드
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	public String toString( ) {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting(); //상위 클래스 Material의 매서드 호출
	}
	
}
