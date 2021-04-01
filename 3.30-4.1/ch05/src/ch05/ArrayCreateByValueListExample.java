package ch05;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		System.out.println("main, scores: " + scores);
		int sum = add(scores); // 시키는 쪽에서는 넘겨줌
		System.out.println("합계 :" + sum);
		System.out.println("프로그램 종료");
		//System.out.println("scores[0]: " + scores[0]); // 
		
	}

	// method(메소드)
	public static int add(int[] scores2) { // void는 return 값 없을때 사용
		// int[] scores2 = scores; // 눈에 보이지 않게 실행 되어 있음
		System.out.println("add() 실행됨");
		System.out.println("add, scores2: " + scores2);
		
		int sum = 0;
		for(int i = 0; i < scores2.length; i++) {
			sum += scores2[i];
		}
		
		return sum;
		
		// return; (생략가능)
		
	}
}
