package ch02;

public class CastingExample {
	
	public static void main(String[] args) {
		int a = 100;
		long b = a;  //a를 long형으로 자동 형변환
		System.out.println(b);
		
		long c = 100L;
		int d = (int)c;
		System.out.println(d);
		
		// 실수가 정수보다 큰 값을 표현할 수 있다
		float f = 3.14f;
		int f2 = (int)f; // 데이터 잘려도 괜찮으니 형변환하셈 하고 컴퓨터한테 말함
		System.out.println(f2);
		
		// 1 ~ 21
		int num = (int)(Math.random() * 21) + 1;
		System.out.println(num);
		

	}
}
