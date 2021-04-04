package sec05.exam02;

public class Calculator {

	// 원주율 - 고정된 값 : 3.14
	// 2 * 원주율 * 반지름
	// 상수는 대문자로 쓰는것이 관례
	static final double MATH_PI = 3.14;
	
	// 둘레 구하기
	static double getCircum(int r) {
		return 2 * MATH_PI * r;
	}
	
	// 면적구하기
	static double getArea(int r) {
		return MATH_PI * r * r;
	}
	
	
}
