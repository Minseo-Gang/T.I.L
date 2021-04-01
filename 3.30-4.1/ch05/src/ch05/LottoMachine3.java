package ch05;

import java.util.Scanner;

public class LottoMachine3 {

	public static void main(String[] args) {
		// 1~45���� ������ �� �ִ� ���� �����
		int[] number = new int[45];
		// System.out.println("number:" + number); �׽�Ʈ -> ������ : [I@.....
		
		// 1~45 �ֱ�
		for (int i = 0; i <= 44; i++) {
			number[i] = i + 1;
		}
		// -> [1, 2, 3, ... 45]
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���Ӻ�>");
		String money = scan.nextLine();
		int iMoney = Integer.parseInt(money);
				
		System.out.print("���Ӽ�>");
		String gameCount = scan.nextLine();
		int iGameCount = Integer.parseInt(gameCount);
		
		if(iMoney < iGameCount * 1000) {
			System.out.println("�ݾ��� �����մϴ�");
			scan.close();
			return;
		}
		
		
		int change = iMoney - (iGameCount * 1000);
		
		for (int j = 1; j <= iGameCount; j++) {
			// �� ����(swapping�̿�)
			// number[0] <-> number[lotto]
			for (int i = 1; i <= 100; i++) {
				int lotto = (int)(Math.random() * 45);
				//System.out.println("lotto:" + lotto);
				int temp = number[0];
				number[0] = number[lotto];
				number[lotto] = temp;
			}
			
		/*
		//�ٲ� ���� ����
		for (int i = 1; i <= 44; i++) {
			System.out.print(number[i] + " ");
		}
		*/
		
			// 6�� �����ϱ�
			for (int i = 0; i <= 5; i++) {
				// ������ �� ���� - ���° ������(0 ~ 44��°)
				
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
		System.out.println("�Ž�����" + change + "�� ��������");
		scan.close();
		
	} //mail
	
} //class


