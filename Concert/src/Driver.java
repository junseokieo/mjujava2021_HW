import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Concert king = new Concert("가수왕", 100, 10000, 20000);
		boolean finish = false;
		
		System.out.println("콘서트 판매 프로그램을 시작합니다\n");
		
		while(finish == false) {
			if(king.getOnlineAV() == true) {
				System.out.print("인터넷 판매이면 S, 현장 판매로 바꾸려면 V, 판매를 종료하려면 F를 입력하세요: ");
			}else{
				System.out.print("현장 판매이면 S, 판매를 종료하려면 F를 입력하세요: ");
			}
			String response = scan.next();
			if(response.equals("S")) {
				king.ticketSelling();
			}else if(response.equals("V")) {
				king.onToOff();
			}else if(response.equals("F")) {
				finish = true;
			}else {
				System.out.println("잘못 선택하셨습니다.");
			}
			System.out.println("남은 티켓들의 수: " + king.getLeft() + "\n");
		}
		System.out.println(king.getSaleReport());
	}

}
