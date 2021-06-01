
public class Member {
//인터넷 쇼핑몰의 구매 회원을 나타내는 클래스
	
	//회원은 번호, 이름과 총 구매 금액을 가진다. 
	int num; // 회원 번호
	String name; // 회원 이름
	int total; // 회원 구매 금액
	
	//회원의 번호와 이름을 각각 넘겨 받은 값으로 초기화하고 총 구매 금액을 0으로 초기화하면서 Member 객체를 생성한다.
	public Member(int newNum, String newName, int newTotal) {
		setNum(newNum);
		setName(newName);
		setTotal(newTotal);
	}
	//회원의 번호를 반환한다.
	public int getNum() {
		return this.num;
	}
	//회원의 이름을 반환한다.
	public String getName() {
		return this.name;
	}
	//회원의 총 구매 금액을 반환한다.
	public int getTotal() {
		return this.total;
	}
	//Member 객체의 모든 데이터(번호, 이름과 총 구매 금액)를 한꺼번에 문자열의 형태로 반환한다.
	public String toString() {
		String str = "";
		str += this.getNum() + "\t"+ this.getName() +"\t" +this.getTotal();
		return str;
	}
	//회원의 번호를 넘겨 받은 값으로 변경한다.
	public void setNum(int newNum) {
		this.num = newNum;
	}
	//회원의 이름을 넘겨 받은 값으로 변경한다.
	public void setName(String newName) {
		this.name = newName;
	}
	//회원의 총 구매 금액을 넘겨 받은 값으로 변경한다.
	public void setTotal(int newTotal) {
		this.total = newTotal;
	}
}
