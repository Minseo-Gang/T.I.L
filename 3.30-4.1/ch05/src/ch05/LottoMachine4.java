package ch05;

public class LottoMachine4 {

	public static void main(String[] args) {
		/*
		LottoBall aBall = new LottoBall();
		aBall.number = 1;
		aBall.color = "Red";
		aBall.showInfo();
		*/
		LottoBall[] balls = new LottoBall[45];
		for (int i = 0; i < balls.length; i++) {
			balls[i] = new LottoBall();
			balls[i].number = i + 1;
			
			if (1 <= balls[i].number && balls[i].number <= 10) {
				balls[i].color = "Orange";
			} else if(11 <= balls[i].number && balls[i].number <= 20) {
				balls[i].color = "Blue";
			} else if(21 <= balls[i].number && balls[i].number <= 30) {
				balls[i].color = "Red";
			} else if(31 <= balls[i].number && balls[i].number <= 40) {
				balls[i].color = "Gray";
			} else {
				balls[i].color = "Green";
			}	
			
		}
		
		for (int i = 0; i < balls.length; i++) {
			balls[i].showInfo();
		}
		
	} //main

} //class Lottomachine4

class LottoBall {
	// 속성 - 필드(데이터)
	int number;
	String color;
	
	// 기능 - 함수(메서드)
	void showInfo() {
		System.out.println(number + "-" + color);
	}
}
