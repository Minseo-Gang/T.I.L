package ch04;

import java.util.Scanner;

public class GuessNum2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int comNum = (int)(Math.random() * 100) + 1; // 72
		//System.out.println(comNum);
		
		int i = 1;
		for (i = 1; i<=5; i++) {
			System.out.print("���纸���� : ");
			
			String question = scan.nextLine(); // 11
		
			int userNum = Integer.parseInt(question);
			
			
			if(userNum < comNum) {
				// num�� question ���� ũ��
				System.out.println(userNum + "���� Ů�ϴ�");
			} else if(comNum < userNum)	{
				System.out.println(userNum + "���� �۽��ϴ�");
				// question���� �۴�
			} else {
				System.out.println("�����Դϴ�");
				// ����
				System.out.print("������(Y/N)?");
				
				String restart = scan.nextLine();
				if(restart.equals("N")) {
					break;
				} 
			} //if
			
		}//while
		
		scan.close();
		System.out.println("���α׷� ����");
		
	}//public static void

}//public class
