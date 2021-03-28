package ch02;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
	
		System.out.println("[필수 입력 정보]");
		System.out.print("1. 이름:");
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
			
		System.out.print("2. 주민번호 앞 6자리:");
		String forward= scan.nextLine();
		
		System.out.print("3. 전화번호:");
		String number = scan.nextLine();

		System.out.println("[입력한 내용]");
		System.out.println(input);
		System.out.println(forward);
		System.out.println(number);
		
		scan.close();
	}

}
