package ch04;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		/*
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			// 더하기
			sum += i; // sum = sum + i;
		}
		System.out.println("1~100까지의 합: " + sum);
		*/
		
		int i = 1; // 초기식
		int sum = 0;
		while (i <= 100) { //조건식
			sum += i;
			i++; // 증감식
		}
		System.out.println("1~ " + --i + "합 : " + sum);
		
		
	}

}
