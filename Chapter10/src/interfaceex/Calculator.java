package interfaceex;

//interface는 extends인 상속 뒤에 연달아 작성 가능
public abstract class Calculator implements Calc{

	@Override //'add'+ctrl+space바 : 자동완성
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	
	@Override //'sub'+ctrl+space바 : 자동완성
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}
}
