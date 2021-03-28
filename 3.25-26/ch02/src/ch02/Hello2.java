package ch02;

public class Hello2 {
	public static void main(String[] args) {
		//ctrl + space (자동완성)
		System.out.println("Hello2");
		System.out.println("안녕하세요"); //ctrl + alt + 방향키 : 복사
		
		//byte b = 500; - error
		short s = 500;
		int i = 1000000;
		long l = 10000000000L;
		
		//int i2 = 3.14; - error
		float f = 3.14f;
		double d = 12334.123;
		
		// 정수의 기본 타입 : int
		// 실수의 기본 타입 : double
		
		int a = 1 + 2;
		System.out.println(a);
		
		// 연산의 기본 타입 : int ** 중요함 **
		// 컴파일러는 값을 체크하지 않는다!! 타입만 체크함
		
		char c = 'A'; // "A" -> string, char(x)
		
		boolean bo = true;
		// boolean bo = "true"; - error
		
		
	}
}

