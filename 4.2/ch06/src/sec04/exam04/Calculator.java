package sec04.exam04;

public class Calculator {

	// 더하기
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// 평균 구하기
	double avg(int x, int y) {
		int sum = plus(x, y);
		double result = sum / 2.0;
		return result;
	}
	
	// 실행하기
	void execute() {
		double result = avg(7, 10);
		println(String.valueOf(result));
	}
	
	// 출력하기
	void println(String message) {
		System.out.println("실행결과: " + message);
	}
	
	
}
