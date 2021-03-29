package ch04;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "과장"; // 문자열 데이터 "과장"을 String형 변수 position에 저장함
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			break;
		}

	}

}
