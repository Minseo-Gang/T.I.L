package ch05;

public class ArrayOddEven {

	public static void main(String[] args) {
		
		int[] scores = new int[8];
		
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 0; i < scores.length; i++) {
			scores[i] = i * 3;
			
			System.out.print(scores[i] + " ");
			
			if(scores[i] % 2 == 0) {
				evenSum += scores[i];
			} else {
				oddSum += scores[i];
			}
		}
		
		System.out.println("\nÈ¦¼öÀÇ ÇÕ :" + oddSum);
		System.out.println("Â¦¼öÀÇ ÇÕ :" + evenSum);
	}

}
