package Lotto;

public class LottoMain {

	public static void main(String[] args) {
		// 공 생성
		LottoBall[] balls = makeBalls();
		shuffleBalls(balls); // balls는 섞인 상태
		
		for(int i = 0; i < 6; i++) {
			LottoBall aBall = getOneBall(balls, i);
			System.out.printf("(%d, %s)", aBall.number, aBall.color);
		}
		
	}
	
	public static LottoBall[] makeBalls() {
		LottoBall[] balls = new LottoBall[45]; // 45개의 공간이 생김 but 아직 공 없고 null값이 들어가있음
		
		// 1 ~ 10 : Orange
		// 11 ~ 20 : Blue
		// 21 ~ 30 : Red
		// 31 ~ 40 : Gray
		// 41 ~ 45 : Green
		
		for(int i = 0; i < balls.length; i++) {
			LottoBall aBall = new LottoBall();
			aBall.number = i + 1; // 1 ~ 45
			
			if(1 <= aBall.number && aBall.number <= 10) {
				aBall.color = "Orange";
			}else if(11 <= aBall.number && aBall.number <= 20) {
				aBall.color = "Blue";
			}else if(21 <= aBall.number && aBall.number <= 30) {
				aBall.color = "Red";
			}else if(31 <= aBall.number && aBall.number <= 40) {
				aBall.color = "Gray";
			}else {
				aBall.color = "Green";
			}
			
			balls[i] = aBall; // 0 ~ 44
		}
		
		return balls;
		
	} //makeballs()
	
	public static void shuffleBalls(LottoBall[] balls) {
		// LottoBall[] balls = @xxxxx (넘겨 받은 balls의 주소값)
		// 첫번째 공과 임의의 위치의 공을 스와핑함
		// 갯수의 2배만큼 스와핑할거임
		
		for(int i = 0; i < balls.length * 2; i++) {
			int random = (int)(Math.random() * balls.length);
			LottoBall temp = balls[0];
			balls[0] = balls[random];
			balls[random] = temp;
		}
	} // shuffleBalls()
	
	public static LottoBall getOneBall(LottoBall[] balls, int index) {
		return balls[index];
		
	}
	
}
