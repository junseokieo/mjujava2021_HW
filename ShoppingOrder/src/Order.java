// 한 회원이 한 상품을 주문하는 것을 나타내는 클래스
public class Order {
	// 각 주문은 회원, 상품과 주문 수량을 가진다.
	Member m; //회원
	Item it; // 상품
	int num; // 주문수량
	int orders; //생성된 객체들의 수
	
	//회원, 상품과 주문 수량을 각각 넘겨 받은 값으로 초기화하면서 Order 객체를 생성한다.
	public Order(Member m1, Item it1, int newNum) {
		this.m = m1;
		this.it = it1;
		this.num = newNum;
		if(newNum <= it1.getLeft()) {
			it1.subLeft(newNum);
			m1.setTotal(m1.getTotal()+it1.getPrice()*newNum);
		}else {
			System.out.println("재고가 부족하여 주문을 처리할 수 없다.");
		}
		this.orders++;
	}
	//이 때 주문 수량이 주문 상품의 현 재고보다 작거나 같다면 
	//주문 상품의 현 재고를 주문 수량만큼 감소시키고 회원의 총 구매 금액을 갱신한다. 
	//주문 수량이 현 재고보다 크다면 ‘재고가 부족하여 주문을 처리할 수 없다.’를 출력해야 한다. 
	//또한 Order 객체가 생성될 때마다 Order 객체들의 수를 1만큼 증가시켜야 한다.
	
	//Order 객체의 회원의 이름, 주문 상품의 이름과 주문 수량을 한꺼번에 문자열의 형태로 반환한다.
	public String toString() {
		String str = "";
		str += m.getName()+":\t"+it.getName()+" "+this.num+"개 주문한다.";
		return str;
	}
	//생성된 Order 객체들의 수를 반환한다.
	public int getOrders() {
		return this.orders;
	}
}
 

