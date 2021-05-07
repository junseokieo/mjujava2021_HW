import java.util.Scanner;

public class application {
	//회사의 입사 지원 대상자 여부를 지원자의 평점과 TOEIC 점수에 따라 출력하는 프로그램.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner 객체를 생성하여 scan이 가리키게 한다.
		
		double gpa=0; //학점
		int toeic_score=0; //토익 점수
		
		System.out.print("평점을 입력하세요: ");
		gpa = scan.nextDouble(); // 입력받은 학점을 gpa에 저장한다.
		
		System.out.print("TOEIC 점수를 입력하세요: ");
		toeic_score = scan.nextInt(); // 입력받은 토익 점수를 저장한다.
		
		if ((gpa >= 4.0) && (toeic_score >= 700)) { 
			//평점이 4.0 이상이고 TOEIC 점수가 700점 이상이면
			System.out.println("면접 대상자입니다");
		}else if ((gpa >= 3.5)&&(gpa < 4.0) && (toeic_score >= 700)) { 
			// 평점이 3.5 이상이고 4.0 미만이면서 TOEIC 점수가 700점 이상이면
			System.out.println("서류 전형 대상자입니다");
		}else if ((gpa >= 3.0)&&(gpa < 3.5) && (toeic_score >= 700)) { 
			// 평점이 3.0 이상이고 3.5 미만이면서 TOEIC 점수가 700점 이상이면 
			System.out.println("필기 시험 대상자입니다");
		}else 
			// 평점이 3.0 미만이거나 TOEIC 점수가 700점 미만이면
			System.out.println("지원할 수 없습니다");
	}
}
