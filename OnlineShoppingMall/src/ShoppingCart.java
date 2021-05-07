public class ShoppingCart {
// 장바구니를 Item 객체들의 배열로 구현하는 클래스
	int cartItemNum; // 장바구니 안에 있는 상품들의 수 
	int cartPrice; // 장바구니 안에 있는 것들의 총 가격
	int cartMax; // 장바구니의 용량(최대 들어가는 상품들의 개수)
	Item[] item1; // Item 객체들의 배열 
	
	// 용량이 5인 빈 장바구니를 생성하는 생성자 메소드 
		public ShoppingCart() {
			cartMax=5;
			this.cartItemNum=0;
			this.cartPrice=0;
			item1 = new Item[5];
		}
		
	// 장바구니 상태 문자열 반환 
	public String toString() {
		String str = "\n장바구니\n\n";
		str = str + "상품     가격     수량     총액\n";
		for(int i=0; i< cartItemNum;i++) {
			str = str + item1[i].getName() +"    "+ item1[i].getPrice() +" "+ item1[i].getNum() +"     "+ item1[i].getPrice()*item1[i].getNum() +"\n";
		}
		str = str + "\n\n총 구매금액: "+ cartPrice +"\n\n";
		return str;
	}
	
	// 장바구니에 구매하고자 하는 상품을 추가한다.
	public void addToCart(Item newItem) {
		if(this.cartItemNum <= this.cartMax) {
			item1[this.cartItemNum] = newItem;
			this.cartItemNum++;
			this.cartPrice = this.cartPrice + newItem.itemPrice*newItem.getNum();
			
		}else {
			System.out.println("장바구니 크기 부족으로 추가할 수 없습니다.");
		}
	}
	
}
