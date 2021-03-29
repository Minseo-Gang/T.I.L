package ch05;

public class StringEqualsExample {

	public static void main(String[] args) {
		// 문자열 객체 vs 문자열 리터럴(상수)
		// "==" vs "equals();"
		
		// 문자열 리터럴 (메모리에서 힙이 아닌 상수 영역에 정의됨)
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		// 상수영역에 있는 같은 리터럴을 가리킨다
		
		// 참조가 같은지를 비교
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		// 문자열(내용)이 같은지를 비교함
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2의 문자열이 같음");
		} else {
			System.out.println("strVar1과 strVar2의 문자열이 다름");
		}
		
		// 문자열 객체
		String strVar3 = new String("이현승"); // 내용물(문자열)이 이현승인 객체(참조)
		String strVar4 = new String("이현승"); // 내용물(문자열)이 이현승인 또 다른 객체(참조)
		
		// 참조가 같은지를 비교
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		// 문자열 데이터(상수)가 같은지를 비교함
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4의 문자열이 같음");
		} else {
			System.out.println("strVar3과 strVar4의 문자열이 다름");
		}

		// 문자열 비교는 .equals()를 사용하자
	}

}
