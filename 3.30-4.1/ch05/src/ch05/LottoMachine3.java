package ch05;

import java.util.Scanner;

public class LottoMachine3 {

	public static void main(String[] args) {
		// 1~45까지 저장할 수 있는 공간 만들기
		int[] number = new int[45];
		// System.out.println("number:" + number); 테스트 -> 결과기대 : [I@.....
		
		// 1~45 넣기
		for (int i = 0; i <= 44; i++) {
			number[i] = i + 1;
		}
		// -> [1, 2, 3, ... 45]
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("게임비>");
		String money = scan.nextLine();
		int iMoney = Integer.parseInt(money);
				
		System.out.print("게임수>");
		String gameCount = scan.nextLine();
		int iGameCount = Integer.parseInt(gameCount);
		
		if(iMoney < iGameCount * 1000) {
			System.out.println("금액이 부족합니다");
			scan.close();
			return;
		}
		
		
		int change = iMoney - (iGameCount * 1000);
		
		for (int j = 1; j <= iGameCount; j++) {
			// 공 섞기(swapping이용)
			// number[0] <-> number[lotto]
			for (int i = 1; i <= 100; i++) {
				int lotto = (int)(Math.random() * 45);
				//System.out.println("lotto:" + lotto);
				int temp = number[0];
				number[0] = number[lotto];
				number[lotto] = temp;
			}
			
		/*
		//바뀐 상태 보기
		for (int i = 1; i <= 44; i++) {
			System.out.print(number[i] + " ");
		}
		*/
		
			// 6개 추출하기
			for (int i = 0; i <= 5; i++) {
				// 임의의 공 추출 - 몇번째 공인지(0 ~ 44번째)
				
				int num = number[i];
				String sNum = "";
				if (num < 10) {
					sNum = "0" + num;
				} else {
					sNum = String.valueOf(num);
				}
				System.out.print(sNum + " ");
				
			}
		
			System.out.println(" ");
		}
		
		System.out.println("-----------------------");
		System.out.println("거스름돈" + change + "원 받으세요");
		scan.close();
		
	} //mail
	
} //class


