package ch04;

public class Prac04_4 {

	public static void main(String[] args) {
		
		for(int y = 1; y <= 10; y++) {
			int y2 = y;
			for(int x = 1; x <= 10; x++) {
				int x2 = x;			
			
				if((4 * x2) + (5 * y2) == 60) {
					System.out.println(x2 + "," + y2);
				}
			
			}
			
		}
		/*
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				if((4 * x) + (5 * y) == 60) {
					System.out.printf("(%d,%d)\n", x, y);
				}
			}
		}
		*/
	}
}
