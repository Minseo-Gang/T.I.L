package sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double area1 = calc.areaCircle(10);
		System.out.println("area1 : " + area1);
		
		Computer com1= new Computer();
		double area2 = com1.areaCircle(10); // 오버라이드된 Computer의 areaCircle()이 실행됨
		System.out.println("area2 : " + area2);
		
	}

}
