package sec04.exam01;

public class CaculatorExample {

	public static void main(String[] args) {
		
		Calculator myCalculator = new Calculator();
		
		myCalculator.powerOn(); // 전원켜기
		
		int result1 = myCalculator.plus(5, 7);
			System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalculator.divide(x, y);
			System.out.println("result2: " + result2);
			
		myCalculator.powerOff(); // 전원끄기
	}

}
