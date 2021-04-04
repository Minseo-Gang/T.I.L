package lotto1;

public class Lottomain {

	public static void main(String[] args) {
		
		LottoMachine machine = new LottoMachine();
		LottoBallCreator creator = new LottoBallCreator();
		
		LottoBall[] balls = creator.createBalls(45);
		machine.setBalls(balls);
		machine.shuffle();
		//machine.showBalls();
		machine.pickBall6();

	}

}
