package ch02;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
	
		System.out.println("[�ʼ� �Է� ����]");
		System.out.print("1. �̸�:");
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
			
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�:");
		String forward= scan.nextLine();
		
		System.out.print("3. ��ȭ��ȣ:");
		String number = scan.nextLine();

		System.out.println("[�Է��� ����]");
		System.out.println(input);
		System.out.println(forward);
		System.out.println(number);
		
		scan.close();
	}

}
