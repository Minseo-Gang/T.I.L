package ex10;

public class Test01 {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		String front = ssn.substring(0, 6); // 인덱스 0~6 880815
		String rear = ssn.substring(7); // 인덱스 7~끝 1234567
		System.out.println("front " + front);
		System.out.println("rear " + rear);
		int len = ssn.length(); // 배열의 length는 "()"가 없다.
		System.out.println("ssn의 길이 : " + len);
		char ch = ssn.charAt(2);
		System.out.println("2번째 인덱스의 문자 :" + ch);
	}
	
}
