package ch04;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		// 1부터 100까지의 합계 구하기
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			// 더하기
			sum += i; // sum = sum + i;
		}
		System.out.println("1~100까지의 합: " + sum);
	}

}
