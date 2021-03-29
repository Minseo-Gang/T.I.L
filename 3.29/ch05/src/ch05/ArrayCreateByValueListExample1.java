package ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		
		// 83, 90, 87점에 대한 합계, 평균 구하기
		int[] scores = {83, 90, 87, 77, 95};
		System.out.println("1번째 값: " + scores[0]);// 83
		System.out.println("2번째 값: " + scores[1]);// 90
		System.out.println("3번째 값: " + scores[2]);// 87
		// 배열의 인덱스는 0부터 시작함
		
		// 합계 구하기
		int sum = 0;
		/*
		sum += scores[0];
		sum += scores[1];
		sum += scores[2];
		*/
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("합계:" + sum);
		
		// int average = sum/scores.length; // 86.4가 나올경우 int는 86으로 표기함
		double average = (double)sum/scores.length; // double 적용할 경우 소숫점까지 표현됨
		System.out.println("평균:" + average);
	}

}
