package lotto2;

public class LottoMain {
	public static void main(String[] args) {
		
		LottoMachine machine = new LottoMachine();
		LottoBallCreator creator = new LottoBallCreator();
		
		LottoBall[] balls = creator.createBalls(45);
		machine.setBalls(balls);
		machine.shuffle();
		machine.pickBall6();
	}
}
