package ch02;

public class PrintExample {

	public static void main(String[] args) {
		// println() - 출력 후 라인 바꾸기 , ln = line
		// print() - 출력 후 라인 안 바꿈
		// printf() - 형식화된 출력, f = format(형식)
		
		System.out.println("1");
		System.out.println("2");
		System.out.print("3");
		System.out.print("4\n");
		
		int a = 100;
		System.out.printf("이번에 나올 숫자는 %d입니다.", a); // d = decimal(10진수)
		System.out.print("이번에 나올 숫자는" + a + "입니다");
		System.out.println();
		
		float b = 3.14f;
		System.out.printf("숫자 2개는 각각 %d, %.2f 입니다\n", a, b);
		
	}

}
