import java.util.Scanner;

public class Student {
	// 학생의 성적 기록을 나타내는 클래스 
	
	String name; // 이름 
	double homework; // 과제 점수 
	double exam; // 시험 점수 
	
	// 생성자 메소드
	public Student() {
	}
	
	// 접근자 메소드
	public String getName() {
		return name;
	}
	public double getHomework() {
		return homework;
	}
	public double getExam() {
		return exam;
	}
	
	// 변경자 메소드 
	public void setName(String newName) {
		name = newName;
	}
	public void setHomework(double newHomework) {
		while(true) { // 계속 반복한다.
			if((newHomework < 0) || (newHomework > 100)) {
				// 점수의 범위를 벗어나는 경우 
				System.out.println("과제 점수가 0보다 작거나 100보다 크다.");
				System.out.print(this.getName()+"의 과제 점수를 다시 입력하라: ");
			}else { // 점수가 범위에 잘 맞는 경우 다음으로 넘어가기위해 break.
				homework = newHomework;
				break; 
			}
		}
	}
	public void setExam(double newExam) {
		while(true) {// 계속 반복한다.
			if((newExam < 0) || (newExam > 100)) {
				// 점수의 범위를 벗어나는 경우 
				System.out.println("시험 점수가 0보다 작거나 100보다 크다.");
				System.out.print(this.getName()+"의 시험 점수를 다시 입력하라: ");
			}else {// 점수가 범위에 잘 맞는 경우 다음으로 넘어가기위해 break.
				exam = newExam;
				break;
			}
		}
	}
	
	// s
	
	// 점수들의 총점을 구하는 메소드
	public double totalScore(double homework, double exam) {
		return (homework * 0.4) + (exam * 0.6);
	}
	
	// 총점을 받아 학점을 출력하는 메소드 
	public String grade(double homework, double exam) {
		if((homework * 0.4) + (exam * 0.6) >= 90) {
			return "A";
		}else if(((homework * 0.4) + (exam * 0.6) >= 80) && ((homework * 0.4) + (exam * 0.6) < 90)) {
			return "B";
		}else if(((homework * 0.4) + (exam * 0.6) >= 70) && ((homework * 0.4) + (exam * 0.6) < 80)) {
			return "C";
		}else if(((homework * 0.4) + (exam * 0.6) >= 60) && ((homework * 0.4) + (exam * 0.6) < 70)) {
			return "D";
		}else {
			return "F";
		}
	}
	
	// 출력할 내용에 대한 문자열을 반환하는 메소드 
	public String toString() {
		String newString = "";
		newString = newString + getName() + "의 총점은 " + totalScore(this.getHomework(), this.getExam());
		newString = newString + "이고 학점은 " + grade(this.getHomework(), this.getExam()) + "이다";
		return newString;
	}
	
}
