package calc1;

public class Calculator {
	
	private int num1;
	private int num2;
	// getInstance()에서 사용됨 - class level로 맞춤
	private static Calculator instance;
	private Calculator() {
		
	}
	
	// getter, setter
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	
	// Calculator.getInstance()
	// 클래스 이름으로 메서드를 실행할 수 있게 static 붙임
	public static Calculator getInstance() {
		if(instance == null) {
			instance = new Calculator();
		}
		return instance;
	}
	
	// 더하기
	public int add() {
		int result = num1 + num2;
		return result;
	}
		
	// 빼기
	public int subtract() {
		int result = num1 - num2;
		return result;
	}
	
	// 곱하기
	public int multiply() {
		int result = num1 * num2;
		return result;
		
	}
	// 나누기
	public int divide() {
		int result = num1 / num2;
		return result;
	}
	
	

	@Override
	public String toString() {
		return "Calculator [num1=" + num1 + ", num2=" + num2 + "]";
	}

	
}
