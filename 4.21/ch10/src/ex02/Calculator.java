package ex02;

public class Calculator {
	
	// throws : �޼��� ���� �κп� ������
	// �ش� �޼ҵ带 �����ϴٰ� ���ܰ� �߻��� �� �ִ�
	// ���ܸ� ó������ �ʰ� �����ڴ�
	// * throw : ���ܸ� ������ ����

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
			System.out.println("0���� ���� �� �����ϴ�");
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

