import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner 객체 
		String check = "예"; // 반복문 제어 변수 
		String name; // 상품 이름 
		int price; // 상품 가격 
		int num; // 상품의 개수 
		ShoppingCart cart1 = new ShoppingCart(); //ShoppingCart 객체 생성 
		
		while(check.equals("예")) { // 반복문 제어 변수가 "예"인 동안 반복한다.
			System.out.print("구매하는 상품의 이름을 입력하세요: ");
			name = scan.next();
			System.out.print("구매하는 상품의 가격을 입력하세요: ");
			price = scan.nextInt();
			System.out.print("구매하는 상품의 수량을 입력하세요: ");
			num = scan.nextInt();
			
			
			Item newitem = new Item(name, price, num); //Item 객체 newitem가 가리킨다.
			cart1.addToCart(newitem); // 카트에 생성된 아이템 객체를 넘겨준며 카트에 추가한다.
			System.out.println(cart1.toString());
			
			System.out.print("쇼핑을 계속하시겠습까<예 혹은 아니오>: ");
			check = scan.next(); // 반복문 제어 변수에 대한 값을 입력받는다.
		}
		System.out.println("\n\n결제하세요");
		System.out.print("총 결제액: "+ cart1.cartPrice);

	}

}
