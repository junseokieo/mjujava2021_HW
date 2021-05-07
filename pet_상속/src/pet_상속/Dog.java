package pet_상속;

public class Dog extends Pet{
//Pet 클래스를 확장하여 개를 나타내는 Dog클래스

	private String breed; // 품종
	private boolean inject; // 예방주사 접종여부 
	
	// 개의 이름, 나이와 품종은 각각 기본 값으로 초기화하고 
	// 예방주사 여부는 false로 초기화 하면서 객체 생성.
	public Dog() {
		super(); // 부모클래스의 생성자 메소드를 호출한다.
		setBreed("");
		setInject(false);
	}
	
	// 개의 이름, 나이, 품종을 각각 주어진 값으로 초기화하고
	// 예방주사접종여부는 false로 초기화 하면서 객체 생성 
	public Dog(String newName, int newAge, String newBreed) {
		super(newName, newAge); // 부모클래스의 생성자 메소드를 호출한다.
		setBreed(newBreed);
		setInject(false);
	}
	// 개의 품종을 알려준다.
	public String getBreed(){
		return this.breed;
	}
	// 개의 접종여부를 알려준다.
	public boolean getInject() {
		return this.inject;
	}
	// 모든 데이터를 한꺼번에 알려준다.
	public String toString() {
		String str = "";
		str = str  + "품종: " + this.getBreed() + "\n";
		if(this.getInject()==false) {
			str = str  + "예방주사를 맞지 않았다.";
		}else{
			str = str  + "예방주사를 맞았다.";
		}
		return super.toString() + str;
	}
	// 개의 품종을 주어진 값으로 변경한다.
	public void setBreed(String newBreed) {
		this.breed = newBreed;
	}
	// 개의 예방주사 접종여부를 주어진 값으로 변경한다.
	public void setInject(boolean newInject) {
		this.inject = newInject;
	}
}
