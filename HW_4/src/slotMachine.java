import java.util.Random;
import java.util.Scanner;

public class slotMachine {
	// 자동 슬롯머신을 모의 실험하는 클래스 
	public static void main(String[] args) {
		
		Random rand = new Random(); //random 객체 생성, rand가 가리키게 한다.
		Scanner scan  = new Scanner(System.in); // scanner 객체 생성, scan이 가리키게 한다.
		
		int rand1, rand2, rand3 =0; //랜덤의 숫자 3개 
		String ans="예"; //사용자가 게임을 계속 할지에 대한 응답
		
		while(ans.equals("예")) { // 사용자가 아니오를 입력하기 전까지는 게임을 계속한다.
			rand1=rand.nextInt(10)+1; //1~9 사이의 랜덤 숫자 저장.
			rand2=rand.nextInt(10)+1;
			rand3=rand.nextInt(10)+1;
			
			System.out.print("숫자들: ");
			System.out.print(rand1+"      ");
			System.out.print(rand2+"      ");
			System.out.println(rand3+"      ");
			
			if(rand1==rand2 && rand2==rand3) { //세 랜덤 숫자가 같다면
					System.out.println("1등 당첨"); 
			}else if(rand1!=rand2 && rand2!=rand3 && rand1!=rand3) { 
				//세 랜덤 숫자가 서로 모두 다르면 
				System.out.println("꽝");
			}else { //그외의 경우 (두개만 같은 경우)
				System.out.println("2등 당첨");
			}
			
			System.out.print("게임 계속?(예 혹은 아니오): ");
			ans=scan.next(); // 게임을 계속 할지 안할지에 대한 응답을 받는다.
		}	
	}

}
