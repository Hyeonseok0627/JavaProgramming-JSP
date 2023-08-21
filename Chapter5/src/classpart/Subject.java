package classpart;

//클래스 구조 : 멤버변수 + 매서드 + (출력)
public class Subject {
	
	//멤버변수
	String subjectName;
	int scorePoint;
	
	//생성자 생성
	public Subject(String subjectName, int scorePoint) {
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}
	
	
	//매서드
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	
}
