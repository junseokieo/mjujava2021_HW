import java.util.Scanner;

public class passwardCheck {
	// 암호의 유효 여부를 판단하는 클래스
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner 객체 생성, scan이 가리킨다.
		String pwd; // 사용자가 입력한 패스워드
		
		for(;;) { //다음을 반복한다.
			System.out.print("암호를 입력하세요: ");
			pwd = scan.next(); //pwd에 입력받은 암호를 저장한다.
			System.out.println("입력된 암호: "+pwd+"\n");
			
			if((charCheck(pwd) + intCheck(pwd) < 10) || charCheck(pwd) == 0 || intCheck(pwd) == 0 ){ // 암호가 유효하지 않다면,
				System.out.println("암호가 유효하지 않다.");
				if(pwd.length() < 10) { // 암호의 길이가 10보다 작다면
					System.out.println("이유: 암호의 길이가 10보다 작다.");
				}
				if(charCheck(pwd) == 0) { //암호의 문자 개수가 0이라면 
					System.out.println("이유: 암호 내에 영문자가 없다.");
				}
				if(intCheck(pwd) == 0) { //암호의 숫자 개수가 0이라면
					System.out.println("이유: 암호 내에 숫자가 없다.");
				}
				System.out.println("");
			}else {
				System.out.println("암호가 유효하다.");
				break; // 암호가 유효한 경우 반복을 종료한다.
			}
		}
	}
	
	// 숫자의 개수를 반복으로 구하는 메소드
	public static int intCheck(String pwd) {
		int count = 0; // 숫자의 개수	
		for(int i = 0; i < pwd.length(); i++) { // 암호 string의 길이 안에서 각 문자를 비교하는 것을 반복한다.
			if(pwd.charAt(i) > 47 && pwd.charAt(i) < 58){ // 문자가 숫자라면
				count++; // 숫자의 개수를 1 증가시킨다.
			}
		}
		return count; // 숫자의 총 개수를 반환
	}
	
	// 문자의 개수를 재귀로 구하는 메소드
	public static int charCheck(String pwd) {
		// 만약 문자가 영문자 중 하나라면 
		if(((pwd.charAt(0)) > 64 && (pwd.charAt(0) < 91)) || ((pwd.charAt(0) > 96) && (pwd.charAt(0) < 123))) {
			if(pwd.length() == 1) { // 만약 문자열이 1개의 문자로 이뤄져있다면 
				return 1;
			}else {
				return charCheck(pwd.substring(1)) + 1; // 문자열의 두번째 문자부터를 재귀함수의 인자로 보내고 리턴 값을 +1 한다.
			}
		}else {
			if(pwd.length() == 1) { // 만약 문자열이 1개의 문자로 이뤄져있다면 
				return 0;
			}else return charCheck(pwd.substring(1)); // 문자열의 두번째 문자부터를 재귀함수의 인자로 보낸다.
		}
	}
	
}
