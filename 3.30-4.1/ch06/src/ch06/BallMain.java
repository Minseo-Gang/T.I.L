package ch06;

public class BallMain {

	public static void main(String[] args) {
		
		BallMachine machine = new BallMachine();
		
		Ball aBall = new Ball();
		aBall.number = 1;
		aBall.color = "Orange";
		
		machine.balls[0] = aBall;
	
		// 45개 넣었다고 가정함
		// 첫번째 공의 정보를 구한다
		
		//Ball b1 = machine.balls[0]; //index error
		
		boolean result = machine.pushBall(45, aBall);
		System.out.println(result);
		
		machine.showBallInfo(0);
	}

}
