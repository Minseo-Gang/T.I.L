package ch04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		// for의 횟수를 판단한 변수를 실수(float)로 사용해보자

		for(float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println("x: " + x);
		}
		
		
	}

}
