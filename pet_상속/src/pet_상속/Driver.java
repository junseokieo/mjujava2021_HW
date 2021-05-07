package pet_상속;

import java.util.Scanner;

public class Driver {
// Pet, Dog를 시험하는 클래스
	public static void main(String[] args) {
		String dogName; // 개의 이름
		int dogAge; // 개의 나이
		String dogBreed; // 개의 품종
		String dogInject; // 개의 예방 접종여부
		Scanner scan = new Scanner(System.in); // Scanner 객체 변수
		
		// 이름, 나이, 품종은 기본값으로 초기화하고 예방접종여부는 false로 초기화하면서 Dog 객체 생성
		Dog haru = new Dog();  
		haru.setName("하루"); //생성한 객체의 이름을 '하루'로 정한다. 
		haru.setAge(3); //생성한 객체의 나이를 세 살로 한다
		haru.setBreed("진돗개"); //생성한 객체의 품종을 '진돗개'로 한다.
		haru.setInject(true); // 생성한 객체의 예방주사 접종여부를 true로 한다.
		
		System.out.print("개의 이름을 입력하세요: ");
		dogName = scan.next(); // 개의 이름을 입력 받는다. 
		System.out.print("개의 나이를 입력하세요: ");
		dogAge = scan.nextInt(); // 개의 나이를 입력 받는다
		System.out.print("개의 품종을 입력하세요: ");
		dogBreed = scan.next(); // 개의 품종을 입력 받는다. 
		
		// 입력 받은 개의 이름, 나이와 품종을 반영하여 Dog 객체를 생성한다. 
		Dog newDog = new Dog(dogName,dogAge, dogBreed);
		
		System.out.print("예방주사를 맞았나요(예 혹은 아니오)?: ");
		dogInject = scan.next(); // 개의 예방주사 접종여부를 ‘예’ 혹은 ‘아니오’로 입력 받는다. 
		
		// 개의 예방접종 여부 입력 값에 따라 예방주사 접종여부를 적절하게 정한다.
		if(dogInject.equals("아니오")) {
			newDog.setInject(false);
		}else if (dogInject.equals("예")) {
			newDog.setInject(true);
		}
		
		// 첫번째 개의 데이터 모두 출력 
		System.out.println(haru.toString());
		
		// 두번째 개의 데이터 모두 출력
		System.out.println(newDog.toString());
		System.out.println();
		
		// 두 살이 넘었으나 예방주사를 맞지 않는 개의 이름과 나이를 출력한다. 
		System.out.println("다음 개들은 두 살이 넘었으나 예방주사를 맞지 않았다:\n");
		if(haru.getAge()>2) {
			if(haru.getInject() == false){
				System.out.println("이름: " + haru.getName() + " 나이: "+ haru.getAge() + "\n");
			}
		}
		if(newDog.getAge()>2) {
			if(newDog.getInject() == false){
				System.out.println("이름: " + newDog.getName() + " 나이: "+ newDog.getAge() + "\n");
			}
		}
		
	}

}
