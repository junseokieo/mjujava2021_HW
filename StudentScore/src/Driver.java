import java.util.Scanner;
public class Driver {
// 클래스를 시험하는 Driver 클래스 
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in); //Scanner 객체 생성, Scan이 가리킨다.
		
		Student StudentBoy = new Student(); // Student 객체 생성, StudentBoy가 가리킨다.
		Student StudentGirl = new Student(); // Student 객체 생성, StudentGirl이 가리킨다.
		
		StudentBoy.setName("선남"); // StudentBoy 객체에 선남이라는 이름을 지정해준다.
		StudentGirl.setName("선녀"); // StudentGirl 객체에 선녀라는 이름을 지정해준다.
		
		// 선남 객체에 대한 결과 
		System.out.print(StudentBoy.getName()+"의 과제 점수를 입력하라: ");
		
		StudentBoy.setHomework(scan.nextInt()); // 입력 받은 값을 변경자 메소드에 적용.
		
		System.out.print(StudentBoy.getName() + "의 시험 점수를 입력하라: ");
		
		StudentBoy.setExam(scan.nextInt());// 입력 받은 값을 변경자 메소드에 적용.
		
		StudentBoy.grade(StudentBoy.getHomework(), StudentBoy.getExam());
		// 학점을 구하는 메소드에 총점을 접근 메소드의 값을 매개수로 하여 학점을 구한다.
		System.out.println(StudentBoy.toString()); // 출력 문자열 메소드의 반환 값을 출력한다.
		
		// 선녀 객체에 대한 결과 
		System.out.print(StudentGirl.getName()+"의 과제 점수를 입력하라: ");
				
		StudentGirl.setHomework(scan.nextInt()); // 입력 받은 값을 변경자 메소드에 적용.
				
		System.out.print(StudentGirl.getName() + "의 시험 점수를 입력하라: ");
				
		StudentGirl.setExam(scan.nextInt());// 입력 받은 값을 변경자 메소드에 적용.

		StudentGirl.grade(StudentGirl.getHomework(), StudentGirl.getExam());
		// 학점을 구하는 메소드에 총점을 접근 메소드의 값을 매개수로 하여 학점을 구한다.
		System.out.println(StudentGirl.toString()); // 출력 문자열 메소드의 반환 값을 출력한다.
	}

}
