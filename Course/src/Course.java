public class Course {
	// 대학교의 교과목을 나타내는 클래스
	String courseName; // 교과목 명
	int courseMax; // 최대 수강 인원수
	int students; // 수강 인원수
	int credit; // 학점 수
	static int courseNum = 0; // 생성된 course 객체들의 수
	
	// 생성자 메소드
	// 교과목명, 최대 수강 인원수와 학점수를 각각 주어진값으로 초기화하고
	// 수강 인원수를 0으로 초기화, 객체 생성 마다 1을 증가
	public Course(String newCourse, int newMax, int newCredit) {
		setCourseName(newCourse);
		setCourseMax(newMax);
		setCredit(newCredit);
		this.students = 0;
		courseNum = courseNum + 1;
	}
	// 교과목 명을 반환한다.
	public String getCourseName() {
		return this.courseName;
	}
	// 교과목의 최대 수강 인원수를 반환한다.
	public int getCourseMax() {
		return this.courseMax;
	}
	// 교과목의 수강 인원수를 반환한다.
	public int getStudents() {
		return this.students;
	}
	// 교과목의 학점수를 반환한다.
	public int getCredit() {
		return this.credit;
	}
	// 생성된 course 객체들의 수를 반환한다.
	public int getCourseNum() {
		return courseNum;
	}
	// course 객체 데이터를 한꺼번에 문자열 형태로 반환한다.
	public String toString() {
		String str = "" + this.getCourseName() + "     " + this.getCourseMax() + "           " + this.getStudents() ;
		return str;
	}
	// 교과목명을 주어진 값으로 변경한다.
	public void setCourseName(String newCourseName) {
		this.courseName = newCourseName;
	}
	// 최대 수강인원수를 주어진 값으로 변경한다.
	public void setCourseMax(int newCourseMax) {
		this.courseMax = newCourseMax;
	}
	// 교과목의 학점수를 주어진 값으로 변경한다.
	public void setCredit(int newCredit) {
		this.credit = newCredit;
	}
	// 교과목의 최대 수강인원수를 주어진 값만큼 증가시킨다.
	public void inCourseMax(int newMax) {
		this.courseMax = this.courseMax + newMax;
	}
}
