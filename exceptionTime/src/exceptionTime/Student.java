package exceptionTime;

public class Student {
// 학생을 나타내는 클래스
	int num; // 학생의 학번
	String name; // 학생의 이름
	
	// 학생의 생성자 메소드
	public Student(int newNum, String newName) {
		this.num = newNum;
		this.name = newName;
	}
	
	// 학생의 모든 정보를 알려주는 메소드
	public String toString() {
		String str = "";
		str = str + this.num +"\t"+ this.name;
		return str;
	}
}
