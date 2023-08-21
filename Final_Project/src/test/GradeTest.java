package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class GradeTest {

	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;
	String subjectFirstSpell;
	String subjectName;
	int subjectId;
	
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) throws FileNotFoundException {
		GradeTest test = new GradeTest();
		
		test.createSubject2();
		test.createStudent();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);
	}
	

	public void createSubject2() {
		try {
			Scanner scanner1 = new Scanner(new FileInputStream("subjectInfo.txt"));
			String subjectFirstSpell = null;
			
			while (scanner1.hasNextLine()) {

				subjectFirstSpell = scanner1.next();
				subjectName = scanner1.next();
				subjectId = scanner1.nextInt();

				  if (subjectFirstSpell.equals("K")) {
	                  korean = new Subject(subjectName, subjectId);
	                  goodSchool.addSubject(korean);
	              } else if (subjectFirstSpell.equals("M")) {
	                  math = new Subject(subjectName, subjectId);
	                  goodSchool.addSubject(math);
	              } else if (subjectFirstSpell.equals("D")) {
	                  dance = new Subject(subjectName, subjectId);
	                  goodSchool.addSubject(dance);
	              }
	          }

	          scanner1.close();
			}catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	}

	public void createStudent() throws FileNotFoundException {

		Scanner scanner = new Scanner(new FileInputStream("studentinfo.txt"));
		String name;
		int id;
		int koreanScore;
		int mathScore;
		int danceScore;
		int Score;
		int majorCode;

		Student student = null;
		while (scanner.hasNextLine()) {

			name = scanner.next();
			id = scanner.nextInt();
			koreanScore = scanner.nextInt();
			mathScore = scanner.nextInt();
			danceScore = scanner.nextInt();
			majorCode = scanner.nextInt();

			if (majorCode == Define.KOREAN) {
				student = new Student(id, name, korean);
			} else if (majorCode == Define.MATH) {
				student = new Student(id, name, math);
			} else if (majorCode == Define.DANCE) {
				student = new Student(id, name, dance);
			} else {
				System.out.println("전공오류 입니다.");
				return;
			}
			goodSchool.addStudent(student);
			korean.register(student);
			math.register(student);
			dance.register(student);
			addScoreForStudent(student, korean, koreanScore);
			addScoreForStudent(student, math, mathScore);
			addScoreForStudent(student, dance, danceScore);
		}
		scanner.close();
	}
	
	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
	}
}
