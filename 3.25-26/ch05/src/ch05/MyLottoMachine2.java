package ch05;

public class MyLottoMachine2 {

	public static void main(String[] args) {
		int[] balls = new int[45];
		
		for(int i = 0; i <= 44; i++) {
			balls[i] = i + 1;
			//balls[0] = 1;
			//balls[1] = 2;
			//balls[2] = 3; ...
			//System.out.print(balls[i] + " ");
		}

		for(int i = 0; i <= 100; i++) {
			int aNumber = (int)(Math.random() * 45);
			int temp = balls[0];
			balls[0] = balls[aNumber];
			balls[aNumber] = temp;
		}
		
		for(int i = 0; i <= 5; i++) {
			int aNumber = (int)(Math.random() * 45);
			int num = balls[i];
			System.out.print(num + " ");
		}

	}

}
