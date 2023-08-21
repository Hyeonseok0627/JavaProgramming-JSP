//Stack클래스 : LIFO(LAST IN FIRST OUT) : 마지막에 넣은 데이터를 첫번째로 빼는 자료구조

package collection.arraylist;

import java.util.ArrayList;

class MyStack {
	//new ArrayList<String>() : <String>을 안써줘도 가능
	private ArrayList<String> arrayStack = new ArrayList<String>();

	//push(): 데이터 넣는 매서드
	//pop(): 데이터 빼는 매서드
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		
		//pop(데이터 꺼내올 때) 중 제일 마지막 데이터부터 꺼내오는데
		//마지막 데이터가 비었을 경우일 때 동작하도록 설정
		//제일 마지막 데이터를 빼내는 상황 설정(전체 데이터 크기 중 제일 마지막 데이터는 n-1번째임)
		//데이터를 꺼내는 건 remove함수, 데이터를 추가하는 건 add함수
		//즉, 제일마지막에 쌓여있는 데이터를 꺼내서 확인하는 구조(그래서 순차적으로 꺼내면서 위에거는 사라지고 다음 밑에꺼가 나오는 구조라 remove가 쓰임)
		//remove는 데이터를 주고 ArrayList에서 사라짐
		//get은 데이터를 주고 ArrayList에 계속 있음
		int len = arrayStack.size(); //len : length 약어
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null; //반환을 하지않는다는 의미
		}
		
		return arrayStack.remove(len -1); //실제 data위치인 index는 size보다 -1인 것이므로(예시.data의 length가 3이면 data의 index는 0,1,2임) list에서 삭제한 값을 반환한다는 의미
		
		//제일 마지막 데이터를 빼내는 상황 설정(전체 데이터 크기 중 제일 마지막 데이터는 n-1번째임)
		//데이터를 꺼내는 건 remove함수, 데이터를 추가하는 건 add함수
		//해당 방식으로만 쓰면, 제일 위에 쌓여있는 데이터가 없는 경우를 설정이 안되어 있어 에러가 남
		//그래서 윗 방식으로 코딩함
		//String data = arrayStack.remove(arrayStack.size() -1);
		//return data;
	}
	
	//peek: 데이터를 빼는 것(이건 pop과 달리 remove 대신 get을 쓰는 것이라, 데이터가 계속 arraylist에 남아있음)
	public String peek() {
		
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return arrayStack.get(len -1);
		
	}
	
	
}

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack stack = new MyStack();
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		//peek 출력
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
	}

}
