package ch04;

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int comNum = (int)(Math.random() * 100) + 1; // 72
		//System.out.println(comNum);
		
		while (true) {
			System.out.print("맞춰보세요 : ");
			
			String question = scan.nextLine(); // 11
		
			int userNum = Integer.parseInt(question);
			
			if(userNum < comNum) {
				// num이 question 보다 크다
				System.out.println(userNum + "보다 큽니다");
			} else if(comNum < userNum)	{
				System.out.println(userNum + "보다 작습니다");
				// question보다 작다
			} else {
				System.out.println("정답입니다");
				// 정답
				System.out.print("새게임(Y/N)?");
				
				String restart = scan.nextLine();
				if(restart.equals("N")) {
					break;
				}
				
				/*if(restart.equals("Y")) {
					System.out.println("--------새게임을 시작합니다-----------");
					comNum = (int)(Math.random * 100) + 1;
					continue;
				} else {
					System.out.println("수고하셨습니다. \n프로그램 종료");
				}
				*/
				
			} //if
			
		}//while
		
		scan.close();
		System.out.println("프로그램 종료");
		
	}//public static void

}//public class
