package ch02;

public class CastingExample2 {

	public static void main(String[] args) {
		// 연산의 기본 단위 : int
		// 연산을 할 경우에는 작은 타입 쪽을 큰 쪽에 맞춘다 (자동 형변환)
		int a = 10;
		float b = 10.5f;
		float c = a + b; // 10.0f(float으로 자동 형변환) + 10.5f;
		System.out.println(c);
		
		// 문자열 연결 : +, 문자열과 연결시 문자열 데이터를 변경함
		String s = "Hello";
		String s2 = s + a; //"Hello" + 10 -> "Hello" + "10"(문자열로 변경)
		System.out.println(s2);
		
		//parseInt
		float d = 3.14f;
		int e = (int)d;
		String f = "10"; //prompt("숫자를 입력해주세요"); -> parseInt
		//int g = (int) f; //형변환은 숫자 데이터 끼리 가능, f는 숫자데이터가 아니라 문자데이터임
		int h = Integer.parseInt(f) + 10;
		System.out.println(h);
		
		String i = h + ""; // "20" + "" -> "20"
		System.out.println(i);
		String j = i + 20;
		System.out.println(j);
		
		String k = String.valueOf(h) + 20; //String.valueOf(); 어떠한 값을 넣어도 string 문자열로 변환할 수 있다
		System.out.println(k);
		
		
	}

}
