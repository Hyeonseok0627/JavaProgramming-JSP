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
	
	//Externalizable implements하면 해당 두개를 재정의해야함
	//순서는 write -> read 순으로 해야함
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
		myDog.name = "멍멍이";
		
		
		FileOutputStream fos = new FileOutputStream("external.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//이렇게 바깥에 try-catch하면 close 할 필요없어져서 코드가 간단해짐
		//자원할당이 여러개인 경우 ';' 사용
		//try(fos; oos) 이렇게 자원인 fos, oos가 ()안에 들어가는 방식이 try-with-resource 문법
		//기존 try-catch-finally문법의 역할인 예외와 상관없이 자원을 반납해야되서 finally에 close()매서드를 사용함
		//하지만 해당문법을 쓰면 자동 close() 매서드가 생성되어 자원반납하게되므로, 코드가 간단해지는 장점이 있음
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
