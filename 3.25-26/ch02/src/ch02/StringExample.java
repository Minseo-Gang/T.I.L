package ch02;

public class StringExample {

	public static void main(String[] args) {
		 String name = "홍길동";
		 // escape sequence (이스케이프 시퀀스)
		 String message = "그녀는 나에게 말했다. \"꺼져\" 라고";
		 System.out.println(message);
		 System.out.println("1\t2\t3"); // \t = tab문자
		 System.out.println("나는 그녀에게 말했다.\n \"그래\""); // \n = new line : enter
		 System.out.println("D:\\workspace\\java"); // backslash 표현하고 싶을 때 (\) : 두번 사용하면 됨
		 
		 int a = 2;
		 int b = 3;
		 boolean result = a < b;
		 boolean result2 = a > b;
		 System.out.println(result);
		 System.out.println(result2);
		 
		 // 자동 형변환(암시적 형변환)
		 	//int a = 100;
		 	//long b = a;
		 
		 // 수동 형변환(명시적 형변환)
		 	// int <-> long
		 	// long c = 100L;
		 	// int d = (int)c; 큰 데이터에서 작은 데이터로 옮길 시, 개발자가 명시해 주는 형태
		 	// 숫자형 <-> 숫자형
		 	// but, int <-> boolean (x)
		 
	}

}
