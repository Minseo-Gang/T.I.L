package ch05;

public class LottoMachine {

	public static void main(String[] args) {
		// 1~45까지 저장할 수 있는 공간 만들기
		int[] number = new int[45];
		// System.out.println("number:" + number); 테스트 -> 결과기대 : [I@.....
		
		//초기 상태 확인
		/*
		for (int i = 0; i <= 44; i++) {
			int aNumber = number[i];
			System.out.print(aNumber + " ");
		}
		*/
		
		// 1~45 넣기
		for (int i = 0; i <= 44; i++) {
			number[i] = i + 1;
		}
		
		//System.out.println("\n---------------------------");
		
		/*
		// 바뀐 값 확인
		for (int i = 0; i <= 44; i++) {
			System.out.print(number[i] + " ");
		}
		*/
		
		//System.out.println();
		
		for (int i = 1; i <= 6; i++) {
			// 임의의 공 추출 - 몇번째 공인지(0 ~ 44번째)
			int lotto = (int)(Math.random() * 45);
			//System.out.println("lotto" + lotto);
			int num = number[lotto];
			System.out.print(num + " ");
		}
		
		
	}

}
