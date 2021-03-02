import java.util.Scanner;

public class exchange {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("물건의 가격<1,000원 이하>을 입력하세요: ");
		int price = scan.nextInt();
		int change = 1000-price;
		System.out.println(price+"원 짜리 물건을 샀고 1,000원을 내셨습니다.\n"
				+ "거스름돈은 "+change+"원 입니다.\n"+
				"거스름돈의 내역은 다음과 같습니다:\n");
		System.out.println("500원 짜리 동전 갯수 = "+ change/500);
		change = change%500;
		System.out.println("100원 짜리 동전 갯수 = "+ change/100);
		change = change%100;
		System.out.println("50원 짜리 동전 갯수 = "+ change/50);
		change = change%50;
		System.out.println("10원 짜리 동전 갯수 = "+ change/10);
		change = change%10;
		System.out.println("5원 짜리 동전 갯수 = "+ change/5 );
		change = change%5;
		System.out.println("1원 짜리 동전 갯수 = "+ change );
	}

}
