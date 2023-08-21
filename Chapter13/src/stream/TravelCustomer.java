package stream;

public class TravelCustomer {

	//�������
	private String name;   //�̸�
	private int age;       //����
	private int price;     //����
	
	//������(��ü�� ������ ��, ��ü�� �ʱ�ȭ�� ���� ����Ǵ� �ż���)
	//�����ڴ� new�� ���� ��ü ������ �� �ѹ��� ȣ��, new�� ���� ��ü �����ϸ� �ν��Ͻ��� ������ ��(�ν��Ͻ��� �����Ͱ� ����Ǵ� ���޸��� ��ü �������� �������)
	//�ʱ�ȭ: ��ü�� �����ϰ� ���� ���ʷ� �Ҵ��ϴ� ��
	//��, ���⿡�� this.name = name; �̰� �ʱ�ȭ
	public TravelCustomer(String name, int age, int price) {
		//this: �Ű������� �̸��� ��������� ���� �̸����� ���̰����� �� ���
		//this�� �����ڿ����� ȣ�Ⱑ��
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "name: " + name + "age: " + age + "price: " + price; 
	}
}
