package lambda;

@FunctionalInterface //�ش� �������̽��� ���ٽ��� ����� ���� ���� ���̶�� ���� ���
public interface MyNumber {
	
	//getMax �ż��� ����
	int getMax(int num1, int num2);
	//���ٽ��� �������̽��� �� �� �̻��� �޼��带 ������ �ȵ�
	//�̷� ������ ���� �����ϱ����� @FunctionalInterface �̰��� �������
	//int add(int num1, int num2); 
}
