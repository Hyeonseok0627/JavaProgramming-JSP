package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/*
class Person implements Externalizable{
	
	String name;
	String job;
	
	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(job);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		job = in.readUTF();
	}
	
}
*/

//�ν��Ͻ��� ������ �ν��Ͻ� ���� ���� ��� ���ϰ� �Ǵµ�, �ν��Ͻ��� ��� ���� ���¸� �״�� �����ϰų� ��Ʈ��ũ�� ���� �����ϴ� ���� '����ȭ'��� �� 
//Java ����ȭ�� �ڹ� �ý��� ���ο��� ���Ǵ� ��ü �Ǵ� �����͵��� �ܺ��� �ڹ� �ý��ۿ����� ����� �� �ֵ��� ����Ʈ(byte) ���·� ������ ��ȯ�ϴ� �����
//����Ʈ�� ��ȯ�� �����͸� �ٽ� ��ü�� ��ȯ�ϴ� ������ȭ�� ����
//�ý��������� JVM�� Runtim Data Area(Heap �Ǵ� ���ÿ���)�� �����ϰ� �ִ� ��ü �����͸� ����Ʈ ���·� ��ȯ�ϴ� �����
//����ȭ�� ����Ʈ ������ �����͸� ��ü�� ��ȯ�ؼ� JVM���� ���ֽ�Ű�� ����

//JVM�� �޸𸮿��� ���ֵǾ� �ִ� ��ü �����͸� �״�� ����ȭ(persist)�� �ʿ��� �� ���.
//�ý����� ����Ǵ��� �������� �ʴ� ������ ������ ����ȭ�� �������̱� ������ ��Ʈ��ũ�� ���۵� ����.
//�׸��� �ʿ��� �� ����ȭ �� ��ü �����͸� �����ͼ� ������ȭ�Ͽ� ��ü�� �ٷ� ��� ����.

class Person implements Serializable{
	
	private static final long serialVersionUID = -1503252402544036183L;

	String name;
	transient String job; //transient: ����ȭ�� �� �ش� ��������� �������� �ʰڴٴ� �ǹ�(�̰��� ���� ����ȭ�ؼ� ����ϸ� "null"���� ����)
	//socket�� ���� ����ȭ�� �ȵǴ� Ŭ�������� �տ� transient�� �������
	
	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}
}

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person personAhn = new Person("�����", "��ǥ�̻�");
		Person personKim = new Person("��ö��", "���̻�");
		
		//ObjectOutputStream: ��ü�� �鿩�ͼ� �д� ��
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
