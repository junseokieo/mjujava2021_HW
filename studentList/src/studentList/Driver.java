package studentList;
import java.util.Scanner;
public class Driver {
// 출석부를 관리하는 프로그램
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 스캐너 객체 변수
		int choice; // 사용자의 선택 
		int stNum; // 학번
		String subject; // 교과목명
		String name; // 학생의 이름
		Student std; // Student 객체 참조 변수
		
		// 교과목 명을 입력받는다.
		System.out.print("교과목명을 입력하세요: ");
		subject = scan.next();
		ClassRoll class1 = new ClassRoll(subject);
		
		do {
			// 원하는 연산을 입력받는다.
			System.out.println("원하는 연산을 선택하세요:");
			System.out.println("<1> 추가\n<2> 삭제\n<3> 찾기\n<4> 출력\n<5> 종료");
			choice = scan.nextInt();
			
			if(choice == 1) {
				System.out.print("추가하는 학생의 학번을 입력하세요: ");
				stNum = scan.nextInt();
				System.out.print("추가하는 학생의 이름을 입력하세요: ");
				name = scan.next();
				
				std = new Student(stNum, name);
				class1.add(std);
				System.out.println(class1.toString());
				
			}else if(choice == 2) {
				System.out.print("삭제하는 학생의 학번을 입력하세요: ");
				stNum = scan.nextInt();
				class1.delete(stNum);
				System.out.println(class1.toString());
				
			}else if(choice == 3) {
				System.out.print("찾는 학생의 학번을 입력하세요: ");
				stNum = scan.nextInt();
				System.out.println(class1.search(stNum));
				
			}else if(choice == 4) {
				System.out.println(class1.toString());
			}
			
		}while(choice !=5);
	}

}
