package ch05;

public class ArrayMain {

	public static void main(String[] args) {
		// 배열(Array) - 값이 늘어서(나열) 되어 있는 것, 객체임!! // 연속된 저장 공간
		//	[ ] 사용함

		// int[] scores = new int[10]; //컴퓨터는 0부터 시작함
		//scores[0] .. scores[9] -> [] 인덱스라고 함

		int[] scores = new int[10]; // 인덱스는 0 ~ 9
			//System.out.println(scores[0]); // 0
			//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
			
			// 주의!
			// 인덱스 관리를 주의할 것
			// 배열을 사용한다 -> 반복문이 나옴 (거의 for사용)
			// 배열의 갯수 - 배열명.length
			for(int i = 0; i < scores.length; i++) {
				scores[i] = i + 1;
			}
			//[1, 2, 3, 4 ,5 ,6 ,7 ,8 ,9, 10]
			//System.out.println(scores[1]);
			
			for (int i = 0; i < scores.length; i++) {
				System.out.print(scores[i] + " ");
			}
			System.out.println("----------------------");
			
			int sum = 0;
			for (int i = 0; i < scores.length; i++) {
				sum += scores[i];
				System.out.print(scores[i] + " ");
			}
			System.out.println("sum: " + sum);
			// 평균 = 합계/갯수
			System.out.println("평균:" + (sum / scores.length));
			
			// 스와핑(swapping) - 교환
			int temp = scores[0];
			scores[0] = scores[1];
			scores[1] = temp;
			
			for (int i = 0; i < scores.length; i++) {
				System.out.print(scores[i] + " ");
			}
			
			
			

	}

}
