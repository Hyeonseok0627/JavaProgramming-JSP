package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
//		Student test = new Student();
		/** 1�� �ּ��Դϴ�. */
		/* 2�� ������ �ּ� */
		// /* 3�� ����
		// 4�� ���� �ּ�

//		int class = 1;
//		int #of_workers = 1;
//		int countOfLettersInString = 1;
//		int 1stLevel = 1;
//		int person# = 1;

		int x = 10, y = 2, z = 2;
		z = ++x / y;
		System.out.println(x + "," + y + "," + z + ",");
		x *= y + 1;
		System.out.println(x + "," + y + "," + z + ",");
		z = ++x + y++;
		System.out.println(x + "," + y + "," + z + ",");

//		int x1;
//		System.out.println(x1);

		int[] a = { 1, 2, 3, 4, 5, 6 };
		int i = a.length - 1;
		while (i >= 0) {
			System.out.print(a[i]);
			i--;
		}

		String city = "����";
		String country = "";
		switch (city) {
		case "����":
		case "�λ�":
		case "�뱸":
			country = "�ѱ�";
		case "�ϰ�":
			country = "�߱�";
		case "����":
			country = "�Ϻ�";
			break;
		default:
			country = "������";
		}
		System.out.println(country);
		
//		exam();
		Person p = new Student("ȫ�浿",20,"��ǻ�Ͱ���");
		p.show();
		
		try(FileOutputStream fos = new FileOutputStream("a.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos)){
			osw.write("���ݱ��� �ڹ� ���� ����ְ� �����߾��^^");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("a.txt ������ �������.");
	}

//	public static void exam() {
//		int i = 5;
//		int j = 7;
//		if (i > 20) {
//			int k = i + j;
//		}
//		System.out.println(k);
//	}

}

class Person{
	String name;
	 int age;
	 
	 public Person(String name, int age){
		 this.name=name;
		 this.age=age;
	 }
	 public void show(){
		 System.out.println(name+""+age+"");
	 }
}

class Student extends Person{
	String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(name + " " + age + " " + major);
	}
	
}










