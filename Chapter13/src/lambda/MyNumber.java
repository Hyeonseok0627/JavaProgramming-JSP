package lambda;

@FunctionalInterface //해당 인터페이스는 람다식을 만들기 위해 사용된 것이라는 것을 명시
public interface MyNumber {
	
	//getMax 매서드 생성
	int getMax(int num1, int num2);
	//람다식은 인터페이스가 두 개 이상의 메서드를 가지면 안됨
	//이런 에러를 사전 방지하기위해 @FunctionalInterface 이것을 사용해줌
	//int add(int num1, int num2); 
}
