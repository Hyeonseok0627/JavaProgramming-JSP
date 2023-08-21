//P.152의 1번 문제
package classpart;

public class Man {
	int age;
	String name;
	boolean isMarried;
	int child;
	//source -> getters and setters 활용
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	
	public void showManInfo() {
		System.out.println("나이 :"+age);
		System.out.println("이름 :"+name);
		System.out.println("결혼 여부 :"+isMarried);
		System.out.println("자녀수 :"+child);
	}
}
