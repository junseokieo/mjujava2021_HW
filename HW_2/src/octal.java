import java.util.Scanner;
public class octal {
// 2진수를 문자열로 받아 8진수로 변환 후 출력하는 클래스.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner 객체 생성.
		String str = new String(); //String 객체 생성.
		
		System.out.print("12 비트(bit)의 이진수를 입력하세요: ");
		str = scan.next(); //str에 입력받은 이진수 값을 저장한다.
		
		System.out.print("이진수 "+str+"에 대응하는 8진수는 ");
		
		// 12비트의 이진수를 3비트씩 잘라서 각 비트의 값을 정수형으로 변환 후 8진수에 맞게 변환해 더해준다.
		// 반복문 안에서 각 순서별로 더한 값을 차례대로 출력해준다.
		for (int i=0; i<10; i+=3) {
			System.out.print((Integer.parseInt(str.substring(i,i+1))*4)+
					(Integer.parseInt(str.substring(i+1,i+2)))*2+
							Integer.parseInt(str.substring(i+2,i+3)));
		}
		System.out.print(" 이다.");
	}

}
