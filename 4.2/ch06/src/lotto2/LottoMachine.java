package lotto2;

public class LottoMachine {
	LottoBall[] balls = new LottoBall[45];
	
	void setBalls(LottoBall[] balls) {
		this.balls = balls;
	}
	
	void shuffle() {
		for(int i = 0; i < balls.length * 2; i++) {
			int random = (int)(Math.random() * 45);
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
