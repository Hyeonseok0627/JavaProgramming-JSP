package innerclass;

class Outter2{
		
	//Runnable �������̽��� �ż��带 ������ ��
	Runnable getRunnable(int i){

		int num = 100;
		
		//�͸� ���� Ŭ���� (Runnable �������̽� ����)
		//���� ���� Ŭ������ Ŭ���� �̸��� ��� ���� �����ϰ� �ش� Ŭ������ ��ȯ�ϴ� ���̶� �͸� ���� Ŭ������ ���̰� ����
		return new Runnable() {
				
		@Override
		public void run() {
			//num = 200;   //���� ��
			//i = 10;      //���� ��
			System.out.println(i);
			System.out.println(num);
			}
		}; //�͸� ���� Ŭ������ �����ٴ� ���� �ǹ�
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable �� ������ �͸� Ŭ���� ����");
			
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
