package ch05;

public class AdvancedForExample {

	public static void main(String[] args) {
		// 향상된 for문
		int[] scores = {95, 71, 84, 93, 87};
		// 총점
		/*
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		*/
		int sum = 0;
		// 대상(배열) 원소의 처음 ~ 끝까지 차례로 추출함
		for(int aScore: scores) {
			sum += aScore;
		}
		System.out.println("sum: " + sum);
		
		// 평균
		System.out.println("평균: " + (float)sum / scores.length);
		
		
	}

}
