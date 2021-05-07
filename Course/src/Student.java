public class Student {
// 학생을 나타내는 클래스
	int studentNum; // 학번
	String name; // 학생의 이름
	int applyCredit; // 신청 학점수
	int creditMax; // 최대 신청 학점수
	
	// 생성자 메소드 
	public Student(int newNum, String newName, int newMax) {
		setStudentNum(newNum);
		setName(newName);
		setCreditMax(newMax);
		this.applyCredit = 0;
	}
	// 학번을 반환한다.
	public int getStudentNum() {
		return this.studentNum;
	}
	// 이름을 반환한다.
	public String getName() {
		return this.name;
	}
	// 최대 신청 학점수를 반환한다.
	public int getCreditMax() {
		return this.creditMax;
	}
	// 신청 학점수를 반환한다.
	public int getApplyCredit() {
		return this.applyCredit;
	}
	// student 객체의 데이터를 한꺼번에 문자열로 반환한다.
	public String toString() {
		String str = "" + this.getStudentNum() + "    " + this.getName() + "     " + this.getApplyCredit();
		return str;
	}
	
	// 변경자 메소드
	// 학번을 주어진 값으로 변경한다.
	public void setStudentNum(int newNum) {
		this.studentNum = newNum;
	}
	// 이름을 주어진 값으로 변경한다.
	public void setName(String newName) {
		this.name = newName;
	}
	// 최대 신청 학점수를 주어진 값으로 변경한다.
	public void setCreditMax(int newMax) {
		this.creditMax = newMax;
	}
}
