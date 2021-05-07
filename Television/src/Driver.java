
public class Driver {

	// main 메소드 
	public static void main(String[] args) {
		
		// 첫번째 Television 객체.
		Television TelevisionOne = new Television(); // 첫번째 Television 객체를 만든다.
		
		TelevisionOne.setBrandName("삼성"); // TelevisionOne의 브랜드명은 삼성이다.
		
		TelevisionOne.setPowered(true); // TelevisionOne의 전원을 킨다.
		
		TelevisionOne.setChannel (1); // TelevisionOne의 채널을 1로 한다.
		
		TelevisionOne.setVolume(6); // TelevisionOne의 볼륨을 6으로 한다.
		
		System.out.println(TelevisionOne.toString()+"\n"); // 객체의 모든 데이터 값을 출력한다.
		
		TelevisionOne.decrementChannel(); // 채널을 1만큼 감소시킨다.
		
		TelevisionOne.incrementVolume(); //  볼륨을 1만큼 증가 시킨다.
		
		System.out.println(TelevisionOne.toString()+"\n"); // 객체의 모든 데이터 값을 출력한다.
		
		// 두번째 Television 객체.
		Television TelevisionTwo = new Television(); // 두번째 Television 객체를 만든다.
		
		TelevisionTwo.setBrandName("엘지"); // TelevisionTwo의 브래드명은 엘지이다.
		
		TelevisionTwo.setPowered(true); // TelevisionTwo의 전원을 킨다.
		
		TelevisionTwo.setChannel(98); // TelevisionTwo의 채널을 98로 한다.
		
		TelevisionTwo.setVolume(12); // TelevisionTwo의 볼륨을 12로 한다.
		
		System.out.println(TelevisionTwo.toString()+"\n"); // TelevisionTwo의 모든 데이터값을 출력한다.
		
		TelevisionTwo.incrementChannel(); // TelevisionTwo의 채널을 1만큼 증가시킨다.
		
		TelevisionTwo.incrementVolume(); // TelevisionTwo의 볼륨을 1만큼 증가시킨다.
		
		System.out.println(TelevisionTwo.toString()); // 객체의 모든 데이터 값을 출력시킨다.
		
	}
}