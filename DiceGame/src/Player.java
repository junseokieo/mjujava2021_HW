
public class Player {
// 게임의 선수를 나타내는 클래스
// 선수는 사용자 혹은 컴퓨터
	int total; // 게임에서 얻은 총 점수 
	int present; // 현재 회차에서 얻은 점수
	int goal; // 목표 점수
	
	// 선수의 총 점수와 현 회차의 점수를 0으로 초기화하고 
	// 목표 점수를 넘겨 받은 값으로 초기화 하는 생성자 메소드
	public Player(int newGoal) {
		this.total = 0;
		this.present = 0;
		this.goal = newGoal;
	}
	// 주사위 한쌍을던지고 게임의 규칙에 따라 결과를 처리한다.
	public boolean playerNext() {
		/*PairOfDice pair1 = new PairOfDice();
		this.total = pair1.getDice1() + pair1.getDice2();
		if((pair1.getDice1() != 1 && pair1.getDice2() != 1) && (this.total < this.goal)) { 
			return true;
		}else if((pair1.getDice1() == 1 || pair1.getDice2() == 1) && (this.total < this.goal)){
			this.total -= pair1.getDice1() + pair1.getDice2();
			return false;
		}else if(this.total >= this.goal){
			return false;
		}else {
			this.total = 0;
			return false;
		}*/
		this.total += this.present;
		if(this.present == 2) {
			this.total = 0;
			return false;
		}
		else if(this.total >= this.goal) {
			return false;
		}
		
	}
	// 선수가 총점을 반환한다.
	public int getTotal() {
		return this.total;
	}
}