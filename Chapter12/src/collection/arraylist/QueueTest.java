//Queue클래스 : FIFO(FIRST IN FIRST OUT) : 첫번째에 넣은 데이터를 첫번째로 빼는 자료구조

package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();

	//Stack, Queue는 자체적으로 구현하는 것도 있지만, ArrayList를 활용해서 구현
	//enQueue : 데이터 넣는 것
	//deQueue : 데이터 빼는 것
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		
		if(len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		
		//Queue는 제일 먼저 꺼내는게 제일 앞에 있는 것이라 remove에서 0번째로 설정
		return arrayQueue.remove(0);
	}
}


public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
	
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
