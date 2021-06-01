// 인터넷 쇼핑몰에서 판매하는 상품을 나타내는 Item이라는 클래스를 설계하고 구현하라.
public class Item {
	String name; // 상품의 이름
	int price; // 상품의 가격
	int left; // 상품의 재고
	
	// 상품의 이름, 가격과 현 재고를 각각 넘겨 받은 값으로 초기화하면서 Item 객체를 생성한다.
	public Item(String newName, int newPrice, int newLeft) {
		setName(newName);
		setPrice(newPrice);
		setLeft(newLeft);
	}
	//	상품의 이름을 반환한다.
	public String getName() {
		return this.name;
	}
	//	상품의 가격을 반환한다.
	public int getPrice() {
		return this.price;
	}
	//	상품의 현 재고를 반환한다.
	public int getLeft() {
		return this.left;
	}
	// Item 객체의 모든 데이터(이름, 가격과 현 재고)를 한꺼번에 문자열의 형태로 반환한다.
	public String toString() {
		String str = "";
		str += this.getName() + "\t" + this.getPrice() + "\t" + this.getLeft()+"\n";
		return str;
	}
	//	상품의 이름을 넘겨 받은 값으로 변경한다.
	public void setName(String newName) {
		this.name = newName;
	}
	//	상품의 가격을 넘겨 받은 값으로 변경한다.
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}
	//	상품의 현 재고를 넘겨 받은 값으로 변경한다.
	public void setLeft(int newLeft) {
		this.left = newLeft;
	}
	//	상품의 현 재고를 넘겨 받은 값만큼 증가시킨다.
	public void addLeft(int newNum) {
		this.left+=newNum;
	}
	//	상품의 현 재고를 넘겨 받은 값만큼 감소시킨다.
	public void subLeft(int newNum) {
		this.left -= newNum;
	}
	
}
