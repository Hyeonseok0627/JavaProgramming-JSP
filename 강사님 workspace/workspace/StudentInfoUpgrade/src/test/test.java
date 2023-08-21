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
		/** 1번 주석입니다. */
		/* 2번 여러줄 주석 */
		// /* 3번 에러
		// 4번 한줄 주석

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

		String city = "서울";
		String country = "";
		switch (city) {
		case "서울":
		case "부산":
		case "대구":
			country = "한국";
		case "북경":
			country = "중국";
		case "동경":
			country = "일본";
			break;
		default:
			country = "대상없음";
		}
		System.out.println(country);
		
//		exam();
		Person p = new Student("홍길동",20,"컴퓨터공학");
		p.show();
		
		try(FileOutputStream fos = new FileOutputStream("a.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos)){
			osw.write("지금까지 자바 정말 재미있게 공부했어요^^");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("a.txt 파일을 열어보세요.");
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










