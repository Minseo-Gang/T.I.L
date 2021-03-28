package ch04;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		// 1부터 100까지의 합계 구하기
		int sum = 0; //합계 누적 변수
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i = 1; i <= 100 ; i++) {
			//System.out.println("i: " + i);
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
			
		}
		
		System.out.println("oddSum:" + oddSum);
		System.out.println("evenSum:" + evenSum);
		System.out.println("총합:" + (oddSum + evenSum));

	}

}
