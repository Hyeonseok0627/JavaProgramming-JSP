package practice;

class Employee {
	public String name;
	public String grade;
	// 생성자
	public Employee(String name) {
		this.name = name;
	}
}

//상속받는 것
public class Engineer extends Employee {
	private String skillset;
	
	public Engineer(String name) {
		super(name); // 상속받은 클래스의 생성자를 가지고 옴
	}
	public String getSkillSet() {
		return skillset;
	}

public void setSkillSet(String skillset) {
this.skillset = skillset;
}
}