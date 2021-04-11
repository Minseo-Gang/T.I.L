package sec01.exam03;

public class Computer extends Calculator {

	@Override // Annotation
	double areaCircle(double r) {
		System.out.println("Computer¿« areaCircle() Ω««‡µ ");
		return Math.PI * r * r; 
	}
		
	/*
	 * double areaCircle(double r) {
	 * System.out.println("Computer¿« areaCircle() Ω««‡µ "); return Math.PI * r * r; }
	 */
	

}
