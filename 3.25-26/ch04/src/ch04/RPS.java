package ch04;

import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("가위.바위.보>");
			
			String input = scan.nextLine();
			if (input.equals("끝")) {
				break;
			}
			
		System.out.println("You - " + input);

		int random = (int)(Math.random() * 3) + 1;
		
			String com = "";
			if(random == 1) {
				com = "바위";
			} else if (random == 2) {
				com = "가위";
			} else {
				com = "보";
			}

		System.out.println("Com - " + com);
		
			String result = "";
			if(input.equals("바위") && com.equals("바위")) {
				result = "비김";
				} else if (input.equals("가위") && com.equals("가위")) {
					result = "비김";	
				} else if (input.equals("보") && com.equals("보")) {
					result = "비김";	
				} else if (input.equals("바위") && com.equals("가위")) {
					result = "이김";
				} else if (input.equals("바위") && com.equals("보")) {
					result = "짐";
				} else if (input.equals("가위") && com.equals("보")) {
					result = "이김";
				} else if (input.equals("가위") && com.equals("바위")) {
					result = "짐";
				} else if (input.equals("보") && com.equals("바위")) {
					result = "이김";
				} else if (input.equals("보") && com.equals("가위")) {
					result = "짐";
				}
				System.out.println("결과 - " + result);
		}
		
		scan.close();
		System.out.println("프로그램 종료");
		
	}
}
