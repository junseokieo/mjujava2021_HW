package studentList;

public class ClassRoll {
	String subject; // 교과목 명
	int classNum; // 포함된 학생들의 수
	int classMax; // 출석부에 포함될 수 있는 최대 학생들의 수
	Student[] std1; // Student 객체들의 배열
	
	// 크기가 30인 빈 출석부를 생성하는 생성자 메소드
	public ClassRoll(String newsubject) {
		classMax = 30;
		classNum = 0;
		std1 = new Student[classMax];
		subject = newsubject;
	}
	
	// 주어진 학생을 출석부에 추가한다.
	public void add(Student newStudent) {
		if (classNum > classMax) {
			System.out.println("출석부의 크기 부족으로 추가할 수 없습니다.");
		}else {
			classNum++;
			// 학번 숫자에 따라 배열 내 위치를 설정한다.
			if(classNum == 1) { // 출석부에 학생이 1명 일때 
				std1[classNum-1] = newStudent;
			}else if(classNum == 2) { // 출석부에 학생이 2명 일때 
				if(std1[0].getNum() > newStudent.getNum()) {
					std1[1] = std1[0];
					std1[0] = newStudent;
				}else {
					std1[1] = newStudent;
				}
			}else { // 출석부에 학생이 3명 이상일때 
				for(int i=0; i < classNum; i++) {
					if(newStudent.getNum() > std1[i].getNum() && newStudent.getNum() < std1[i+1].getNum() ) {
						for(int j = classNum+1; j>i+1; j--) {
							std1[j] = std1[j-1];
						}
						std1[i+1] = newStudent;
					}else if(newStudent.getNum() > std1[classNum-2].getNum()){ // 전달 받은 학번보다 큰 학번이 없는 경우 
						std1[classNum-1] = newStudent;
					}
				}
			}
		}
	}
	
	
	// 주어진 학번을 가진 학생의 출석부 내의 위치(index)를 반환한다.
	public int findIndex(int findNumber) {
		int index = -1;
		for(int i=0; i<classNum; i++) {
			if (std1[i].getNum() == findNumber) {
				index = i;
			}
		}
		return index;
	}
	
	// 주어진 학번을 가진 학생을 출석부에서 삭제한다.
	public void delete(int deleteNumber) {
		if (findIndex(deleteNumber) == -1) {
			System.out.println("주어진 학생이 출석부에 없습니다");
		}else {
			for (int j=findIndex(deleteNumber); j<classNum-1; j++) {
					std1[j] = std1[j+1];
				}
				std1[classNum] = null;
				classNum--;
		}
	}
	
	// 주어진 학번을 가진 학생을 출석부에서 찾아 이름을 알려준다.
	public String search(int searchNumber) {
		if (findIndex(searchNumber) == -1) {
			System.out.println("주어진 학생이 출석부에 없습니다");
			return "";
		}
		return std1[findIndex(searchNumber)].getName();	
	}
	
	// 출석부의 모든 정보를 알려준다.
	public String toString() {
		String str="";
		str = str + "\n출석부\n\n" + "교과목명: " + subject+"\n";
		str = str + "학번    이름\n";
		for (int i=0; i<classNum; i++) {
			str = str + std1[i].getNum() +"    " + search(std1[i].getNum())+ "\n\n";
		}
		return str;
	}
}
