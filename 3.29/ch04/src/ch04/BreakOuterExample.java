package ch04;

public class BreakOuterExample {

	public static void main(String[] args) {
		/*
		for(int i = 1; i <= 5; i++) {
			System.out.println("바깥쪽: " + i);
			
			for(int j = 1; j <= 5; j++) {
				System.out.println("안쪽: " + j);
				if(j == 3) {
					break;
				}
			}
		}
		*/
		
		// 바깥쪽 for문에 Outter라는 이름(레이블)을 달기
		Outter: for(int i = 1; i <= 5; i++) {
			System.out.println("바깥쪽: " + i);
			
			for(int j = 1; j <= 5; j++) {
				System.out.println("안쪽: " + j);
				if(j == 3) {
					break Outter; // Outter라는 이름의 반복 중단
				}
			}
		}

	}

}
