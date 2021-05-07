import java.util.Random;

public class PairOfDice {
// 두개의 주사위를 모델하는 클래스
	int dice1; // 첫번째 주사위의 현재 면 
	int dice2; // 두번째 주사위의 현재 면 
	
	// 두개의 주사위의 현재면을 각각 1로 초기화 하는 생성자 메소드
	public PairOfDice(){
		this.dice1 = 1;
		this.dice2 = 1;
	}
	// 두 개의 주사위를 한꺼번에 던진다.
	public void runDice() {
		Random rand = new Random();
		dice1 = rand.nextInt(5)+1;
		dice2 = rand.nextInt(5)+1;
	}
	// 
	public int getDice1() {
		return this.dice1;
	}
	public int getDice2() {
		return this.dice2;
	}
}
