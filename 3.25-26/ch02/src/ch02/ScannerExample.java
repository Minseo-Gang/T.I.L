package ch02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// �⺻�� 8���� �ƴ� �������� ����� ������(������)
		// ����� ��ȿ = new ���();
		// ��ȿ.���� ������();
		
		Scanner scan = new Scanner(System.in); // Ÿ�� �̸� = ��
		 // -> Ű����� ����� ��ĳ�ʸ� ���� �ϳ� ���� ��ĳ���� ���� scan�� �����Ѵ�.
		// String - ���ڿ�  - "Hello", "�ȳ��ϼ���"
		
		while (true) {
			String input = scan.nextLine(); // "abc"
			/*
			 ���ǻ��� : ���ڿ��� ���� �񱳴� '==' �� ���� �ʴ´�
				.equals()�� ����Ѵ� *****�߿�!*****
			if (input == "q") {
				break;
			}
			 */
			if (input.equals("q")) {
				break;
			}
			System.out.println(input);
		}
		
		scan.close(); //��ĳ�� �ݱ�
		
		System.out.println("���α׷� ����");
	}

}
