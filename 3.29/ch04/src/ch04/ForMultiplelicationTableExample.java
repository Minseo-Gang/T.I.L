package ch04;

public class ForMultiplelicationTableExample {

	public static void main(String[] args) {
		
		for(int j = 2; j <= 9; j++) {
			System.out.println("***" + j + "´Ü ***");
			for(int i = 1; i <= 9; i++) {
				System.out.println(j + " x " + i + " = " + (j * i));
			}
			System.out.println();
		}
		
		/*System.out.println("*** 3´Ü ***");
		for(int i = 1; i <= 9; i++) {
			System.out.println("3 x " + i + " = " + (3 * i));
		}
		
		System.out.println("*** 4´Ü ***");
		for(int i = 1; i <= 9; i++) {
			System.out.println("4 x " + i + " = " + (4 * i));
		}
		*/
		
	}

}
