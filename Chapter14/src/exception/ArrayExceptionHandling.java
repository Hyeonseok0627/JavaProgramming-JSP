package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		// try{}�� �����ϰ� -> ������ �߸� catch(���� ���� Ŭ���� ���� ����){}�� ����
		// -> �ش� �ż��� ������ ���(System.out.println(e); : e���� ������� ��� ��ġ���� ������ ������ ���)
		// ���� ������ 5���ε�, ������ �� 6���϶�� �ϴ� ���� ������ �� ���̽�
		try{
			for(int i = 0; i<=5; i++){
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("���� ó�� �κ�");
//			return; //���Ⱚ������ ��ȯ�̶� "���α׷� ����"�� ��µ��� ����
		}
		// return �����ε��� finally �ż��� ���� ����� ��
		// �� ������ try {}�� ��µǸ� finally {} �� �� ������ ������ ����� �ǹǷ�
		// finally�� �ݿ��� �� ������ return ���� ��ȯ�� ��
//		finally {
//			System.out.println("Finally"); 
//		}
		System.out.println("���α׷� ����");
	}
}
