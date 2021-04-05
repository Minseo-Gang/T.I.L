package calc1;

public class CalculatorMain {

	public static void main(String[] args) {
		User u1 = new User(Calculator.getInstance());
		u1.runAdd(4, 2);
		u1.runSubtract(4, 2);
		u1.runMultiply(4, 2);
		u1.runDivide(4, 2);

	}

}
