import java.util.Scanner;
public class studentNum {
	public static void main(String[] args) {
		// 입학 정보를 통해 학번이 맞는지 여부를 출력하는 클래스 
		Scanner scan = new Scanner(System.in);
		// Scanner 객체 생성, scan이 가리키게 한다.
		
		String str = new String(); // String 객체 생성. str이 가리킨다. 학번을 의미.
		String year = new String(); // String 객체 생성. year이 가리킨다. 연도를 의미.
		int order = 0; //입학 순번
		int type =0; // 입학 유형 
		int count=0; // 오류 여부를 확인하는 변수 
		
		System.out.print("학번은? ");
		str = scan.next();
		
		System.out.print("입학 연도: ");
		year = scan.next();
		
		System.out.print("입학 유형: ");
		type = scan.nextInt();
		
		System.out.print("입학 순번: ");
		order = scan.nextInt();
		
		// 학번의 길이가 8인가? 아니면 틀림.
		if(str.length()!=8) {
			System.out.println("틀린 이유: 길이가 8이 아니다.");
			count++;
		}
		if(!str.substring(0, 2).equals("60")) {// 60으로 시작하는가? 아니면 틀림.
			System.out.println("틀린 이유: 60으로 시작하지 않는다.");
			count++;
		}
		if(!str.substring(2, 4).equals(year)){// 60으로 시작하는가? 아니면 틀림.
			System.out.println("틀린 이유: 입학 년도");
			count++;
		}
		if(type != (Integer.parseInt(str.substring(4,5)))) { // 입학유형이 서로 다르면,
			System.out.println("틀린 이유: 입학 유형");
			count++;
		}else if (type!=2 && type!=5) {//입학유형이 2가 아니고 5가 아니면,
			System.out.println("틀린 이유: 입학 유형");
			count++;
		}
			
		if((Integer.parseInt(str.substring(5))!=order)||
				Integer.parseInt(str.substring(5))>=1000) {
			// 입학 순번이 다르거나 1~999 사이의 정수가 아니라서 틀린 경우.
			System.out.println("틀린 이유: 입학 순번");
			count++;
		}
		// count 가 없으면 오류가 있는 부분이 없다는 것을 의미.
		if(count==0) {
			System.out.println("학번이 맞다.");
		}
	}
		
}
