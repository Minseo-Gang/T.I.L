package ch02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// 기본형 8개가 아닌 나머지는 사용자 정의형(참조형)
		// 사람형 지효 = new 사람();
		// 지효.집에 가세요();
		
		Scanner scan = new Scanner(System.in); // 타입 이름 = 값
		 // -> 키보드와 연결된 스캐너를 새로 하나 만들어서 스캐너형 변수 scan에 저장한다.
		// String - 문자열  - "Hello", "안녕하세요"
		
		while (true) {
			String input = scan.nextLine(); // "abc"
			/*
			 주의사항 : 문자열에 대한 비교는 '==' 를 하지 않는다
				.equals()를 사용한다 *****중요!*****
			if (input == "q") {
				break;
			}
			 */
			if (input.equals("q")) {
				break;
			}
			System.out.println(input);
		}
		
		scan.close(); //스캐너 닫기
		
		System.out.println("프로그램 종료");
	}

}
