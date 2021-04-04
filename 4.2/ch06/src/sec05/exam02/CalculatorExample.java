package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator.getCircum(4);
		Calculator.getArea(4);
		
		// 마지막 -> 값 변경 불가함
		final int a = 10; // 상수
		// a = 20; 오류남 
	}

}
