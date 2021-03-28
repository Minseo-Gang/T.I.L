package ch04;

public class Gugudan {

	public static void main(String[] args) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.print("[" + dan + "´Ü]");
				System.out.println();
				
				for(int i = 1; i <=9; i++) {
					System.out.println(dan + "x" + i + "=" + (dan * i));
				}
				
			} 
			
	}

}
