
public class Game {
	int goalScore; //게임의 목표 점수 
	int dice1;
	int dice2;
	
	public Game(int newGoalScore) {
		PairOfDice game1 = new PairOfDice();
		this.goalScore = newGoalScore;
		Player comDice = new Player(20);
		Player user = new Player(-1);
	}
	
	public void play() { 
		System.out.println("컴퓨터 차례.....\n");
		System.out.println("현 점수:\n");
		System.out.println("컴퓨터: " + Game.this. );
		
	}
}
