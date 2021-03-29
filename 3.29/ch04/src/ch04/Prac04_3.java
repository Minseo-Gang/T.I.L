package ch04;

public class Prac04_3 {

	public static void main(String[] args) {
		

		while(true) {
			int cube1 = (int)(Math.random() * 6) + 1;
			int cube2 = (int)(Math.random() * 6) + 1;
			
			System.out.println("(" + cube1 + ", " + cube2 + ")");
			
			if((cube1 + cube2) == 5) {
				break;
			} 
		}
		/*
		while (true) {
			int num1 = (int)(Math.random() * 6) + 1;
			int num2 = (int)(Math.random() * 6) + 1;
			
			System.out.printf("(%d,%d)\n, num1, num2");
			if (num1 + num2 == 5) {
				break;
			}
		}
		*/
		
	}

}
