package ch04;

import java.util.Scanner;

public class Prac04_7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.예금  | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------");
			System.out.print("선택> ");
			
			String input = scanner.nextLine();
			
			switch(input) {
			case "1":
				System.out.print("예금액> ");
				int inputMoney = Integer.parseInt(scanner.nextLine());
				balance += inputMoney;
				break;
			case "2":
				System.out.print("출금액> ");
				int outputMoney = Integer.parseInt(scanner.nextLine());
				balance -= outputMoney;
				break;
			case "3":
				System.out.println("\n잔고> " + balance);
				break;
			case "4":
				run = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
