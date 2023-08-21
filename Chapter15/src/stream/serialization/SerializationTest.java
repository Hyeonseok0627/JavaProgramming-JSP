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

//인스턴스의 상태인 인스턴스 변수 값은 계속 변하게 되는데, 인스턴스의 어느 순간 상태를 그대로 저장하거나 네트워크를 통해 전송하는 것을 '직렬화'라고 함 
//Java 직렬화는 자바 시스템 내부에서 사용되는 객체 또는 데이터들을 외부의 자바 시스템에서도 사용할 수 있도록 바이트(byte) 형태로 데이터 변환하는 기술과
//바이트로 변환된 데이터를 다시 객체로 변환하는 역직렬화를 포함
//시스템적으로 JVM의 Runtim Data Area(Heap 또는 스택영역)에 상주하고 있는 객체 데이터를 바이트 형태로 변환하는 기술과
//직렬화된 바이트 형태의 데이터를 객체로 변환해서 JVM으로 상주시키는 형태

//JVM의 메모리에만 상주되어 있는 객체 데이터를 그대로 영속화(persist)가 필요할 때 사용.
//시스템이 종료되더라도 없어지지 않는 장점을 가지며 영속화된 데이터이기 때문에 네트워크로 전송도 가능.
//그리고 필요할 때 직렬화 된 객체 데이터를 가져와서 역직렬화하여 객체를 바로 사용 가능.

class Person implements Serializable{
	
	private static final long serialVersionUID = -1503252402544036183L;

	String name;
	transient String job; //transient: 직렬화할 때 해당 멤버변수는 저장하지 않겠다는 의미(이것을 쓰면 직렬화해서 출력하면 "null"으로 나옴)
	//socket과 같이 직렬화가 안되는 클래스들은 앞에 transient를 써줘야함
	
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

		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		//ObjectOutputStream: 객체를 들여와서 읽는 것
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
