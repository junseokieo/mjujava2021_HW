import java.util.Scanner;
public class studentScore {
	public static void main(String[] args) {
		// 부정행위,출석률, 총점에 따라 학점을 부여하는 클래스
		Scanner scan = new Scanner(System.in);
		// Scanner 객체 생성, scan이 가리키게 한다.
		boolean cheat = false; //부정행위 여부
		char grade;//학점 
		int attend = 0;//출석률
		int score=0;//총점
		
		System.out.print("부정행위 여부(true 혹은 false): ");
		cheat=scan.nextBoolean(); //부정행위 여부를 입력받는다 
		System.out.print("출석률(0~ 100사이의 정수값): ");
		attend=scan.nextInt(); // 출석률을 입력받는다 
		System.out.print("총점(0~ 100사이의 정수값): ");
		score=scan.nextInt(); //총점을 입력받는다 
		
		if(cheat==false) { //부정행위가 없을 시 
			if(attend<80) { // 출석률이 80보다 낮다면 
				grade='F';
			}else if(score>=90) { //부정행위가 없고 출석률 80 이상, 총점 90이상 
				grade='A';
			}else if(score>=80) { //부정행위가 없고 출석률 80 이상, 총점 80이상
				grade='B';
			}else if(score>=70) { //부정행위가 없고 출석률 80 이상, 총점 70이상
				grade='C';
			}else if(score>=60) { //부정행위가 없고 출석률 80 이상, 총점 60이상
				grade='D';
			}else grade='F'; //부정행위가 없고 출석률 80 이상, 총점 60 미만 
		}else grade='F'; // 부정행위가 있을 경우 
		
		System.out.println("학점 = "+ grade); //학점을 출력한다.
	}

}
