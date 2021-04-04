package lotto1;

public class LottoMachine {

	// field
	LottoBall[] balls = new LottoBall[45];
	
	// setter - setBalls(LottoBall[])
	void setBalls(LottoBall[] balls) {
		this.balls = balls;
	}
	
	void showBalls() {
		for(LottoBall ball : balls) {
			ball.showInfo();
		}
	}
	
	void shuffle() {
		for(int i = 0; i < balls.length * 2; i++) {
			int random = (int)(Math.random() * 45);
			//swapping
			LottoBall temp = balls[0];
			balls[0] = balls[random];
			balls[random] = temp;		
		}
		
	}
	
	void pickBall6() {
		for(int i = 0; i < 6; i++) {
			balls[i].showInfo();
		}
	}
	
}
