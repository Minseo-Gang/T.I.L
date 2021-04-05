package calc1;

public class Calculator {
	
	private int num1;
	private int num2;
	// getInstance()���� ���� - class level�� ����
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
	// Ŭ���� �̸����� �޼��带 ������ �� �ְ� static ����
	public static Calculator getInstance() {
		if(instance == null) {
			instance = new Calculator();
		}
		return instance;
	}
	
	// ���ϱ�
	public int add() {
		int result = num1 + num2;
		return result;
	}
		
	// ����
	public int subtract() {
		int result = num1 - num2;
		return result;
	}
	
	// ���ϱ�
	public int multiply() {
		int result = num1 * num2;
		return result;
		
	}
	// ������
	public int divide() {
		int result = num1 / num2;
		return result;
	}
	
	

	@Override
	public String toString() {
		return "Calculator [num1=" + num1 + ", num2=" + num2 + "]";
	}

	
}
