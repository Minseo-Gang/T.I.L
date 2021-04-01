package ch05;

public class ArrayCreateByValueListExample3 {

	public static void main(String[] args) {
		
		int[] payment = {200, 250, 300, 350, 400};
		addBonus(payment);
		int sum  = calculateTotal(payment);
		System.out.println("гу╟Х : " + sum);
	}
	
	public static void addBonus(int[] payment) {
		
		for(int i = 0; i < payment.length; i++) {
			 payment[i] += 50;
			 System.out.println(payment[i]);
		}
		
	}
	
	public static int calculateTotal(int[] payment) {
		int sum = 0;
		for(int i = 0; i < payment.length; i++) {
			sum += payment[i];
		}
		
		return sum;
	}
	
}
