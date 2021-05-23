package houseincome;
import java.util.InputMismatchException;
import java.util.Scanner;

public class checkHouseIncome {
// 가구의 소득이 어떤 값 미만인 가구들의 수를 계산하여 출력하는 프로그램
	public static void main(String[] args) {
		int number;//가구들의 수
		int house[]; // 가구들의 소득 배열
		int turn=0;// 입력된 가구의 수
		Scanner scan = new Scanner(System.in); //Scanner 객체 변수
		
		System.out.print("가구들의 수를 입력하세요: ");
		number = scan.nextInt();
		house = new int[number];
		
		double high=0; // 최대 소득을 가진 가구
		int cnt=0; //최대 가구 소득의 10%보다 작은 가구의 수
		
		System.out.print("각 가구의 소득을 입력하세요: ");
		
		try{
			for(int i=0 ; i<number; i++) {
				turn++;
				house[i] = scan.nextInt();
				
				if (house[i] < 0){
					throw new IllegalArgumentException((i+1)+"번째 가구 소득이 음수이다");
				}
				if(house[i]>high) {
					high = house[i];
				}
			}
			System.out.println("최대 가구 소득: "+ high);
			double highPer = high*0.1; // 최대 가구 소득의 10%
			System.out.println("최대 가구 소득의 10%: "+highPer);
			
			for (int k=0; k<number; k++) {
				if(house[k]<(highPer)) {
					cnt++;
				}
			}
			System.out.println("가구들의 수: "+ cnt);
			
		}catch(IllegalArgumentException e){
			System.out.print(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println((turn)+"번째 가구 소득이 숫자가 아니다");
			for(int j=0; j<turn-1; j++) {
				System.out.print(house[j]+" ");
			}			
		}		
	}
}
