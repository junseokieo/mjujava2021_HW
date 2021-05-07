import java.util.Random;
import java.util.Scanner;

public class randomNumGame {
// 숫자 맞추기 게임을 하는 클래스 
	public static void main(String[] args) {
		Random rand = new Random(); // random 객체를 생성. rand가 가리키게 한다.
		Scanner scan = new Scanner(System.in); // scanner 객체를 생성. scan이 가리키게 한다.
		
		int randNum = 0; //랜덤의 숫자
		int userNum=0; // 사용자로 부터 입력받은 숫자를 저장.
		String rpt="예"; // 게임을 계속 진행할지에 대한 응답.
		
		while(rpt.equals("예")) {
			int count=0; // 추측한 횟수를 센다.
			randNum = rand.nextInt(100)+1; // 1~100 사이의 랜덤의 숫자를 저장.
			do {
				count++; // 추측 횟수를 1 추가한다.
				System.out.print("추측한 숫자를 입력하세요(종료를 원하면 -99): ");
				userNum = scan.nextInt(); // 추측한 숫자를 입력 받는다.
				if((userNum == randNum)||(userNum == -99)) { // 만약 맞췄을 경우 혹은 -99를 입력한 경우.
					if(userNum == randNum) {
						System.out.println("추측한 숫자가 맞다");
					}
					System.out.println("추측한 횟수: "+count);
					System.out.print("계속하기를 원하는가? (예 혹은 아니오): ");
					rpt = scan.next();
					userNum=-99;
				}else if(userNum < randNum) { // 추측 숫자가 작은 경우 
					System.out.println("추측한 숫자가 작다");
				}else {// 추측한 숫자가 큰 경우 
					System.out.println("추측한 숫자가 크다");
				}
			}while(userNum != -99); // -99가 되기 전동안은 반복.
		}
	}
}

		/*
		do {
			if(randNum == 0) {
				count=0;
				randNum = rand.nextInt(100)+1; //랜덤의 숫자를 저장.
			}
			System.out.print("추측한 숫자를 입력하세요(종료를 원하면 -99): ");
			
			userNum = scan.nextInt(); // 추측한 숫자를 입력 받는다.
			count++; // 추측 횟수를 1 추가한다.
			
			if((userNum == randNum)||(userNum == -99)) { // 만약 맞췄을 경우 
				if(userNum == randNum) {
					System.out.println("추측한 숫자가 맞다");
				}
				System.out.println("추측한 횟수: "+count);
				System.out.print("계속하기를 원하는가? (예 혹은 아니오): ");
				rpt = scan.next();
				if(rpt.equals("예")) { // 계속하기를 원하는 경우 
					//randNum = rand.nextInt(100)+1; // 새로운 랜덤의 수를 고른다
					userNum=0; //사용자로 부터 입력받은 숫자를 초기화 해준다. -99인 경우 종료될 수 있기 때문에.
					//count=0; // 새로운 시작을 위해 추측 횟수를 0으로 만들어준다.
				}else { // 그만하고 싶은 경우 
					userNum = -99;
				}
			}else if(userNum < randNum) { // 추측 숫자가 작은 경우 
				System.out.println("추측한 숫자가 작다");
			}else {// 추측한 숫자가 큰 경우 
				System.out.println("추측한 숫자가 크다");
			}
		}while(userNum != -99); // 입력받은 숫자가 -99가 아닌 동안 계속 반복한다.
		*/
