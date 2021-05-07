
public class register {
// 한 학생이 학 교과목을 수강 신청하는 것을 나타내는 클래스
	Student newStudent;
	Course newCourse;
	
	// 학생과 교과목을 각각 주어진 값으로 초기홯면서 register 객체를 생성한다.
	public register(Student addStudent, Course addCourse) {
		this.newStudent = addStudent;
		this.newCourse = addCourse;
		// 교과목의 수강 인원수가 최대 수강 인원수보다 적다면 인원수를 1만큼 증가시킨다.
		if (this.newCourse.getStudents() < this.newCourse.getCourseMax()) {
			this.newCourse.students++;
		}else {// 불가 메세지 출력
			System.out.println("정원이 차서 수강 신청할 수 없다.");
		}
		// 학생의 신청 학점수에 교과목의 한점수를 더한 값이 학생의 최대 신청 학점수 보다 작거나 같다면 학생의 신청 학점수를 갱신 
		if ((this.newStudent.getApplyCredit() + this.newCourse.getCredit()) <= this.newStudent.getCreditMax()) {
			this.newStudent.applyCredit = this.newStudent.applyCredit + this.newCourse.getCredit();
		}else {// 신청 불가 메세지 출력
			System.out.println("학점 초과로 수강 신청할 수 없다.");
		}
		
	}
	// 학생의 교과목 신청 내역을 문자열 형태로 한번에 반환한다.
	public String toString() {
		String str = "" + this.newStudent.getName() + ": " + this.newCourse.getCourseName() + " 수강 신청";
		return str;
	}
}
