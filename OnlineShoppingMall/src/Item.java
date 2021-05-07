public class Item {
	String itemName; //상품 이름 
	int itemPrice; // 상품 가격 
	int itemNum; // 상품 수량 
	
	public Item(String newName, int newPrice, int newNum) {
		setName(newName);
		setPrice(newPrice);
		setNum(newNum);
	}
	public void setName(String newName) {
		this.itemName = newName;
	}
	public void setPrice(int newPrice) {
		this.itemPrice = newPrice;
	}
	public void setNum(int newNum) {
		this.itemNum = newNum;
	}
	public String getName() {
		return this.itemName;
	}
	public int getPrice() {
		return this.itemPrice;
	}
	public int getNum() {
		return this.itemNum;
	}
	public String toString() {
		String str = "";
		str = str + this.getName() + "     "+this.getPrice()+"     "+
		this.getNum() +"\n";
		return str;
	}
}
