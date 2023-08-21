package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class GradeTest2 {
	
	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;
	
	String subjectFirstSpell;
	String subjectName;
	int subjectId; 

	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) throws FileNotFoundException {

		GradeTest2 test = new GradeTest2();
		test.creatSubject2();
		test.createStudent2();
		
		String report = test.gradeReport.getReport(); //���� ��� ����
		test.createResultInfo(report);
		System.out.println(report); // ���		
		
	}
	
	public void creatSubject2() throws FileNotFoundException{
		Scanner scanner = new Scanner(new FileInputStream("subjectInfo.txt"));
		
		while(scanner.hasNextLine()) {
			subjectFirstSpell = scanner.next();
			subjectName = scanner.next();
			subjectId = scanner.nextInt();
			
//			������ ������ ������� �ʴ� ���
			Subject sub = new Subject(subjectName, subjectId);
			goodSchool.addSubject(sub);
			
		}
		scanner.close();
	}
	
	public void createStudent2() throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new FileInputStream("studentinfo.txt"));
		String name;
		int id;
		int majorCode;
		
		Student student = null;
		while(scanner.hasNextLine()) {
			//sacnnerŬ������ ������ �ޱ�
			name = scanner.next();
			id = scanner.nextInt();
			majorCode = scanner.nextInt();
			
			//������ ������ ����� �ʴ� ���
			List<Integer> scoreList = new ArrayList<Integer>();
			while(scanner.hasNextInt()) {
				scoreList.add(scanner.nextInt());
			}
			List<Subject> subjectList = goodSchool.getSubjectList();
			for(int i=0; i<scoreList.size(); i++) {
				student = new Student(id, name,subjectList.get(i));
				goodSchool.getSubjectList().get(i).register(student);
				addScoreForStudent(student, subjectList.get(i), scoreList.get(i));
			}
						
		}
		scanner.close();
	}
	
	//���� ���� �Է�
	public void addScoreForStudent(Student student, Subject subject, int point){
			
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
			
	}
	
	public void createResultInfo(String report) {
		try(FileOutputStream fos = new FileOutputStream("resultInfo.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos)){
			osw.write(report);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}





