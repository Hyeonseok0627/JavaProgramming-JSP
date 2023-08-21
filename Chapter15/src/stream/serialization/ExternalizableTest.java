package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable{

	String name;
	
	public Dog() {}
	
	//Externalizable implements�ϸ� �ش� �ΰ��� �������ؾ���
	//������ write -> read ������ �ؾ���
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name =in.readUTF();
	}
	
	public String toString() {
		return name;
	}
}

public class ExternalizableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Dog myDog = new Dog();
		myDog.name = "�۸���";
		
		
		FileOutputStream fos = new FileOutputStream("external.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//�̷��� �ٱ��� try-catch�ϸ� close �� �ʿ�������� �ڵ尡 ��������
		//�ڿ��Ҵ��� �������� ��� ';' ���
		//try(fos; oos) �̷��� �ڿ��� fos, oos�� ()�ȿ� ���� ����� try-with-resource ����
		//���� try-catch-finally������ ������ ���ܿ� ������� �ڿ��� �ݳ��ؾߵǼ� finally�� close()�ż��带 �����
		//������ �ش繮���� ���� �ڵ� close() �ż��尡 �����Ǿ� �ڿ��ݳ��ϰԵǹǷ�, �ڵ尡 ���������� ������ ����
		try(fos; oos){
			oos.writeObject(myDog);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		FileInputStream fis = new FileInputStream("external.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog dog = (Dog)ois.readObject();
		
		System.out.println(dog);
	}
}
