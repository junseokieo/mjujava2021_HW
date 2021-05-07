import java.util.Scanner;

public class romanToNum {
// 로마숫자를 입력 받아 10진수로 반환, 10진수를 8진수로 반환하는 클래스 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner 객체 생성, scan이 가리키게 한다.
		StringBuffer oct = new StringBuffer(); // StringBuffer 객체 생성, oct가 가리키게 한다.
		String roman; // 로마 숫자 
		
		System.out.print("로마 숫자를 입력하세요: ");
		roman = scan.next(); // 입력 받은 로마 숫자를 저장한다.
		System.out.println("10진수로 변환한 숫자: " + romToNum(roman)); // 10진수로 변환하여 출력.
		System.out.print("8진수로 변환한 숫자: ");
		toOctal(romToNum(roman), oct); // 10진수를 8진수로 변환하여 출력하는 toOctal 함수에 10진수로 변환된 로마 숫자를 넘겨준다.
	}
	
	public static int wordNum(String wrd) { // 한 개의 로마 숫자를 매개변수로 넘겨 받아 대응하는 숫자로 출력.
		switch(wrd) {
		case "I": return 1;
		case "V": return 5;
		case "X": return 10;
		case "L": return 50;
		case "C": return 100;
		case "D": return 500;
		case "M": return 1000;
		default: return -1; // case 문의 문자 중의 하나가 아닐 경우 -1을 반환한다.
		}
	}
	
	public static int romToNum(String rom) { // 문자열 형태의 로마 숫자를 매개변수로 넘겨 받아 십진수로 반환.
		int num = 0; // 십진수의 로마숫자 
		for(int i = 0; i < rom.length(); i++) { // 반복문 제어 변수 i가 문자열 로마 숫자보다 작을 동안 반복한다.
			if(i == rom.length()-1) { // 문자열에서 마지막 문자에 도달한 경우.
				num = num + wordNum(rom.substring(i)); // 마지막 문자의 숫자 값을 십진수의 로마숫자에 더해준다.
			}else if (wordNum(rom.substring(i,i+1)) < wordNum(rom.substring(i+1,i+2))) { // 뺄셈을 통해 로마숫자가 쓰여진 경우이다.
				num = num + (wordNum(rom.substring(i+1,i+2)) - wordNum(rom.substring(i,i+1))); 
				// 뒷 문자에서 앞 문자를 뺀 값을 십진수의 로마숫자에 더해준다.
				i++; // 두 문자의 십진수 값을 더했기 때문에 다다음 문자로 넘어간다.
			}else { // 덧셈으로 로마 숫자가 이뤄진 경우
				num = num + wordNum(rom.substring(i,i+1)); // 해당 한 문자의 십진수 값을 십진수의 로마숫자에 더해준다.
			}
		}
		return num; // 최종적으로 구해진 십진수의 로마숫자를 반환한다.
	}
	
	public static int toOctal(int num, StringBuffer oct) { // 10진수의 숫자를 8진수로 변환하여 반환 출력하는 재귀메소드
		if(num < 8) { // 입력 받은 매개변수가 8보다 작을 경우
			oct.insert(0, num); // 매개변수를 8진수의 로마숫자 문자열에 더해준다.
			System.out.print(oct);
			return 0; // 함수가 종료된다.
		}else { // 입력 받은 매개변수가 8보다 크거나 같을 경우
			oct.insert(0,Integer.toString(num%8)); //8진수의 로마숫자 문자열의 앞에 매개변수 num을 8로 나눈 나머지를 삽입한다.
			return toOctal(num/8, oct); // 재귀함수에 매개변수 num을 8로 나눈 몫과 8진수의 로마 문자열 oct를 매개변수로 넘겨주고 반환한다.
		}
	}

}
