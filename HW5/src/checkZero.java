import java.util.Scanner;

public class checkZero {
// 주어진 양의 정수 내에 있는 숫자 0의 개수를 구하는 클래스 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // 스캐너 객체 생성, scan 이 가리키게 한다
		int num = 0; // 양의 정수
		
		System.out.print("양의 정수를 입력하세요: ");
		num = scan.nextInt(); // 양의 정수를 입력받는다
		System.out.println("반복 결과: " + repetition(num)); // 반복으로 구한 0의 개수 출력
		System.out.println("재귀 결과: " + recursion(num)); // 재귀로 구한 0의 개수 출력
	}
	
	// 반복을 사용한 메소드 
	public static int repetition(int num) {
		int count = 0; // 0의 개수
		
		for(; num >= 10; num = num/10) { //num이 10보다 작으면 반복을 그만한다 
			if(num%10 == 0) { //끝자리가 0인 경우
				count++; //0의 개수를 하나 증가시킨다
			}
		}
		return count; //0의 개수를 반환한다
	}
	
	// 재귀를 사용한 메소드 
	public static int recursion(int num) { 
		if(num < 10) { // 양의정수가 10보다 작은 경우
			return 0; // 0개를 반환 
		} else if(num%10 == 0) { //끝자리가 0인 경우
			return recursion(num/10)+1;//0의 개수를 하나 추가하고 양의 정수 끝자리를 지워 재귀함수에 대입.
		} else
			return recursion(num/10); // 양의정수의 끝자리를 지우고 재귀함수에 대입한다.
	}

}
