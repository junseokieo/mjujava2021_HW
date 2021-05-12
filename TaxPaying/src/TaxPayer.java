
public abstract class TaxPayer {
//납세자를 나타내는 클래스 
	protected String name;	// 이름
	protected int number;	// 번호

	// 납세자의 이름과 번호를 주어진 값으로 초기화한다
	public TaxPayer(String name, int number)
	{
        setName(name);
        setNum(number);
	}

	// 납세자의 이름을 반환한다
	public String getName()
	{
        return name;
	}

	// 납세자의 번호를 반환한다
	public int getNum() {
		return number;
	}

	// 납세자의 이름과 번호를 반환한다
	public String toString() {
		String str = "";
		str = str + "이름: " + getName();
		str = str + ", 번호: " + getNum();
		return str;
	}

	// 납세자의 이름을 주어진 값으로 변경한다
	private void setName(String newName)
	{
        this.name = newName;
	}

	// 납세자의 번호를 주어진 값으로 변경한다
	private void setNum(int newNum) {
		this.number = newNum;
	}
        // 여기에 메소드를 입력하세요

	// 납세자의 세금을 계산한다
	public abstract double computeTax();
}
