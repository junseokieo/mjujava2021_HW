package studentList;

public class Student {
// 출석부에 포함되는 학생을 나타내는 클래스
	
	int stNum; // 학생의 학번
	String stName; // 학생의 이름
	
	public Student(int newNum, String newName) { // 주어진 학생의 학번과 이름을 가진 생성자 메소드
		setNum(newNum);
		setName(newName);
	}
	
	public void setName(String newName) { // 학생의 이름을 주어진 값으로 변경한다.
		stName = newName;
	}
	public void setNum(int newNum) { //학생의 학번을 주어진 값으로 변경한다.
		stNum = newNum;
	}
	public String getName() { // 학생의 이름을 반환한다.
		return stName;
	}
	public int getNum() { // 학생의 학번을 반환한다. 
		return stNum;
	}
}
