import java.util.Scanner;
public class Concert {
// 콘서트 티켓 판매 내역을 기록하는 클래스
	//변수
	String artist; // 가수의 이름 
	int capacity; // 공연 장소의 수용 인원
	int sold = 0; // 팔린 티켓의 수 
	int onlinePrice; // 인터넷 티켓 가격 
	int offlinePrice; // 현장 티켓 가격
	int total = 0; // 총 판매 금액
	boolean onlineAV = true; // 인터넷 판매 가능 여부
	
	//메소드
	
	//생성자 메소드
	public Concert(String newArtist, int newCapacity, int newOn, int newOff) {
		artist = newArtist;
		capacity = newCapacity;
		onlinePrice = newOn;
		offlinePrice = newOff;
	}
	// 티켓을 판매한다.
	public void ticketSelling() {
		System.out.print("파는 티켓들의 수는? <최대 " + getLeft() + "> ");
			  
		Scanner scan = new Scanner(System.in);
		int want = scan.nextInt();
			  
		if (sellAV(want) == false) {
			System.out.println("죄송합니다, 판매를 완료할 수 없습니다");
		}else {
			total = total + getWantPrice(want);
			System.out.println("티켓들의 총 가격 = " + getWantPrice(want));
		}
	}
		
	// 구매 가능여부 반환
	public boolean sellAV(int tickets) {
		if (tickets > getLeft()) {
			return false;
		}else
			sold = sold + tickets;
			return true;
	}
	// 구매 요청한 티켓들의 가격을 계산하여 반환한다.
	public int getWantPrice(int newWant) {
		if(getOnlineAV() == true) {
			return newWant * onlinePrice;
		}else
			return newWant * offlinePrice;
	}
	// 인터켓 판매에서 현장 판매로 변경한다.
	public void onToOff() {
		onlineAV = false;
	}
	// 남은 티켓의 수를 반환한다.
	public int getLeft() {
		return capacity - getSold();
	}
	// 인터넷 판매 가능 여부를 반환한다.
	public boolean getOnlineAV() {
		return onlineAV;
	}
	// 팔린 티켓의 수를 반환한다.
	public int getSold() {
		return sold;
	}
	// 총 판매 금액을 반환한다.
	public int getTotal() {
		return total;
	}
	public String getSaleReport() {
		String str = "";
		str = str + "최종 판매 보고서\n\n" + artist + " 콘서트 티켓 판매 내역:\n";
		str = str + "팔린 티켓 수: " + getSold() + " ";
		str = str + "총 판매 금액 " + getTotal();
		return str;
	}
}