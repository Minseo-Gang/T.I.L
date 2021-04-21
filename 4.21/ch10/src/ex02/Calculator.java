package ex02;

public class Calculator {
	
	// throws : 메서드 선언 부분에 기재함
	// 해당 메소드를 실행하다가 예외가 발생할 수 있다
	// 예외를 처리하지 않고 던지겠다
	// * throw : 예외를 강제로 던짐

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public int div(int num1, int num2) {
//		if (num2 == 0) {
//		  	return 0;
//		}
		
		int result = 0;
		try { 
			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
		return 0;
	}
	
	public int div2(int num1, int num2) throws ArithmeticException {
		int result = 0;
		try { 
			result = num1 / num2;
		} catch (ArithmeticException e) {
			throw new ArithmeticException();
		}
		return 0;
	}
}

