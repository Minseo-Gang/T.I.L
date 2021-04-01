package sec04.exam01;

public class Calculator {

	// 전원 켜기
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	// 덧셈 - 더할 값 2개를 받아서 더한 결과를 반환
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// 나눗셈 - 나눌 정수 2개를 받아서 나눈 결과를 반환
	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	
	// 전원 끄기
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	
}
