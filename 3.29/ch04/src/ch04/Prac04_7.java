package ch04;

import java.util.Scanner;

public class Prac04_7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.����  | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("------------------------");
			System.out.print("����> ");
			
			String input = scanner.nextLine();
			
			switch(input) {
			case "1":
				System.out.print("���ݾ�> ");
				int inputMoney = Integer.parseInt(scanner.nextLine());
				balance += inputMoney;
				break;
			case "2":
				System.out.print("��ݾ�> ");
				int outputMoney = Integer.parseInt(scanner.nextLine());
				balance -= outputMoney;
				break;
			case "3":
				System.out.println("\n�ܰ�> " + balance);
				break;
			case "4":
				run = false;
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

}