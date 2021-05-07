package pet_상속;

public class Pet {
// 애완동물을 나타내는 클래스
	
	int age; // 애완동물의 나이
	String name; // 애완동물의 이름
	
	// 이름과 나이를 기본 값으로 초기화하면서 Pet객체를 생성.
	public Pet() { 
		setName("");
		setAge(0);
	}
	// 이름과 나이를 주어진 값으로 초기화하면서 Pet객체를 생성.
	public Pet(String newName, int newNum) {
		setName(newName);
		setAge(newNum);
	}
	// 애완동물의 이름을 반환한다.
	public String getName(){
		return name;
	}
	// 애완동물의 나이를 반환한다.
	public int getAge() {
		return age;
	}
	
	// 애완동물의 이름과 나이를 한꺼번에 알려준다.
	public String toString() {
		String str = "";
		str = str + "\n이름: " + this.getName() +"\n" + "나이: " + this.getAge() + "\n";
		return str;
	}
	// 애완동물의 이름을 주어진 값으로 변경한다.
	public void setName(String newName) {
		this.name = newName;
	}
	
	// 애완동물의 나이를 주어진 값으로 변경한다.
	public void setAge(int newAge) {
		this.age = newAge;
	}
}
