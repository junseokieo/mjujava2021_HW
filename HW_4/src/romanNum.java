import java.util.Scanner;

public class romanNum {
// 입력받은 연도를 로마 숫자로 바꿔서 출력하는 클래스
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // Scanner 객체 생성,scan이 가리키게 한다.
		
		int year=0; // 입력 받은 연도
		int r1, r2, r3, r4 = 0; // 각각 1000단위의 수, 100단위의 수, 10, 1단위의 수
		String rnum = ""; //로마 숫자로 표현한 결과\
		
		for(;;){
			System.out.print("연도를 입력하세요: ");
			year = scan.nextInt(); //연도를 입력받는다.
				
			if(year>=1 && year<5000) { // 올바르게 연도를 입력했을 시 
				
				r1 = (year/1000)*1000; //1000 단위의 수 
				r2 = (year-r1)/100*100; //100 단위의 수 
				r3 = (year-(r1+r2))/10*10; //10 단위의 수  
				r4 = year-(r1+r2+r3); // 1 단위의 수 
				
				// 각각의 경우에 따른 로마 숫자를 rnum에 붙인다.
				while(r1>=1000) { 
					rnum = rnum + "M";
					r1=r1-1000;
				}
				while(r2==900) {
					rnum=rnum+"CM";
					r2=r2-900;
				}
				while(r2==400) {
					rnum=rnum+"CD";
					r2=r2-400;
				}
				while(r2>=500) {
					rnum=rnum+"D";
					r2=r2-500;
				}
				while(r2>=100) {
					rnum=rnum+"C";
					r2=r2-100;
				}
				while(r3==90) {
					rnum=rnum+"XC";
					r3=r3-90;
				}
				while(r3==40) {
					rnum=rnum+"XL";
					r3=r3-40;
				}
				while(r3>=50) {
					rnum=rnum+"L";
					r3=r3-50;
				}while(r3>=10) {
					rnum=rnum+"X";
					r3=r3-10;
				}
				while(r4==9) {
					rnum=rnum+"IX";
					r4=r4-9;
				}
				while(r4==4) {
					rnum=rnum+"IV";
					r4=r4-4;
				}
				while(r4>=5) {
					rnum=rnum+"V";
					r4=r4-5;
				}
				while(r4>=1) {
					rnum=rnum+"I";
					r4=r4-1;
				}
				System.out.print("로마 숫자로 표현한 연도 = "+ rnum);
				break; // 반복을 종료한다.
			}else {
				System.out.println("잘못 입력된 연도");
			}
		}
	}
}