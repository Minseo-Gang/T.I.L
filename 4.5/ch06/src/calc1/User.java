package calc1;

public class User {
	
	private Calculator calc;
	
	// ���� ���� �׳� ����� ������
	public User() {
		
	}
	
	// ���⸦ ������ ����ڸ� ����
	public User(Calculator calc) {
		this.calc = calc;
	}
	
	public void setCalculator(Calculator calc) {
		this.calc = calc;
	}
	// ���� �̿� �����ϱ� runAdd
		public void runAdd(int n1, int n2) {
			calc.setNum1(n1);
			calc.setNum2(n2);
			int result = calc.add();
			System.out.printf("%d + %d = %d\n", n1, n2, result);
		}
		
	// ���� �̿� �����ϱ� runSubtract
		public void runSubtract(int n1, int n2) {
			calc.setNum1(n1);
			calc.setNum2(n2);
			int result = calc.subtract();
			System.out.printf("%d - %d = %d\n", n1, n2, result);
		}
	
	// ���� �̿� �����ϱ� runMultiply
		public void runMultiply(int n1, int n2) {
			calc.setNum1(n1);
			calc.setNum2(n2);
			int result = calc.multiply();
			System.out.printf("%d * %d = %d\n", n1, n2, result);
		}	
	
	// ���� �̿� �������ϱ� runDivide
		public void runDivide(int n1, int n2) {
			calc.setNum1(n1);
			calc.setNum2(n2);
			int result = calc.divide();
			System.out.printf("%d / %d = %d\n", n1, n2, result);
		}	
	
	
}
