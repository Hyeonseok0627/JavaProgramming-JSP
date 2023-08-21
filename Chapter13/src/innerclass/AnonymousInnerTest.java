package innerclass;

class Outter2{
		
	//Runnable 인터페이스의 매서드를 가지고 옴
	Runnable getRunnable(int i){

		int num = 100;
		
		//익명 내부 클래스 (Runnable 인터페이스 생성)
		//지역 내부 클래스는 클래스 이름을 지어서 새로 생성하고 해당 클래스를 반환하는 식이라 익명 내부 클래스와 차이가 있음
		return new Runnable() {
				
		@Override
		public void run() {
			//num = 200;   //에러 남
			//i = 10;      //에러 남
			System.out.println(i);
			System.out.println(num);
			}
		}; //익명 내부 클래스가 끝났다는 것을 의미
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수");
			
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outter2 out = new Outter2();
	
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		
		out.runner.run();
	}
}
