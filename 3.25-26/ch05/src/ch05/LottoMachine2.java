package ch05;

public class LottoMachine2 {

	public static void main(String[] args) {
		// 1~45까지 저장할 수 있는 공간 만들기
		int[] number = new int[45];
		// System.out.println("number:" + number); 테스트 -> 결과기대 : [I@.....
		
		// 1~45 넣기
		for (int i = 0; i <= 44; i++) {
			number[i] = i + 1;
		}
		// -> [1, 2, 3, ... 45]
		
		// 공 섞기(swapping이용)
		// number[0] <-> number[lotto]
		for (int i = 1; i <= 100; i++) {
			int lotto = (int)(Math.random() * 45);
			//System.out.println("lotto:" + lotto);
			int temp = number[0];
			number[0] = number[lotto];
			number[lotto] = temp;
		}
		
		/*
		//바뀐 상태 보기
		for (int i = 1; i <= 44; i++) {
			System.out.print(number[i] + " ");
		}
		*/
		
		// 6개 추출하기
		for (int i = 0; i <= 5; i++) {
			// 임의의 공 추출 - 몇번째 공인지(0 ~ 44번째)
			int lotto = (int)(Math.random() * 45);
			
			//System.out.println("lotto" + lotto);
			int num = number[i];
			System.out.print(num + " ");
		}
		
		
	}

}
