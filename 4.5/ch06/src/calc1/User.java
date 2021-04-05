package calc1;

public class User {
	
	private Calculator calc;
	
	// 계산기 없이 그냥 사용자 생성됨
	public User() {
		
	}
	
	// 계산기를 가지는 사용자를 생성
	public User(Calculator calc) {
		this.calc = calc;
	}
	
	public void setCalculator(Calculator calc) {
		this.calc = calc;
	}
	// 계산기 이용 덧셈하기 runAdd
		public void runAdd(int n1, int n2) {
			calc.setNum1(n1);
			calc.setNum2(n2);
			int result = calc.add();
			System.out.printf("%d + %d = %d\n", n1, n2, result);
		}
		
	// 계산기 이용 뺄셈하기 runSubtract
		public void runSubtract(int n1, int n2) {
			calc.setNum1(n1);
			calc.setNum2(n2);
			int result = calc.subtract();
			System.out.printf("%d - %d = %d\n", n1, n2, result);
		}
	
	// 계산기 이용 곱셈하기 runMultiply
		public void runMultiply(int n1, int n2) {
			calc.setNum1(n1);
			calc.setNum2(n2);
			int result = calc.multiply();
			System.out.printf("%d * %d = %d\n", n1, n2, result);
		}	
	
	// 계산기 이용 나눗셈하기 runDivide
		public void runDivide(int n1, int n2) {
			calc.setNum1(n1);
			calc.setNum2(n2);
			int result = calc.divide();
			System.out.printf("%d / %d = %d\n", n1, n2, result);
		}	
	
	
}
