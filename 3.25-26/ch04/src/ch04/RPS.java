package ch04;

import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("����.����.��>");
			
			String input = scan.nextLine();
			if (input.equals("��")) {
				break;
			}
			
		System.out.println("You - " + input);

		int random = (int)(Math.random() * 3) + 1;
		
			String com = "";
			if(random == 1) {
				com = "����";
			} else if (random == 2) {
				com = "����";
			} else {
				com = "��";
			}

		System.out.println("Com - " + com);
		
			String result = "";
			if(input.equals("����") && com.equals("����")) {
				result = "���";
				} else if (input.equals("����") && com.equals("����")) {
					result = "���";	
				} else if (input.equals("��") && com.equals("��")) {
					result = "���";	
				} else if (input.equals("����") && com.equals("����")) {
					result = "�̱�";
				} else if (input.equals("����") && com.equals("��")) {
					result = "��";
				} else if (input.equals("����") && com.equals("��")) {
					result = "�̱�";
				} else if (input.equals("����") && com.equals("����")) {
					result = "��";
				} else if (input.equals("��") && com.equals("����")) {
					result = "�̱�";
				} else if (input.equals("��") && com.equals("����")) {
					result = "��";
				}
				System.out.println("��� - " + result);
		}
		
		scan.close();
		System.out.println("���α׷� ����");
		
	}
}
