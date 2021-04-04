package phonebook.ver2;

import java.util.Scanner;

public class MenuViewer {
	static final int INPUT = 1;
	static final int SEARCH = 2;
	static final int EXIT = 3;
	
	static Scanner scanner = new Scanner(System.in);
	// static�� static���� ����� �� �����Ƿ� Scanner�� �ٿ���
	
	public static void showTopMenu() {
		System.out.println("====== ��ȭ��ȣ�� Ver.2 ======");
	}
	
	static int showStartMenu() {
		System.out.println("----------------------------");
		System.out.println("1.�Է�  2.��ȸ  3.����");
		System.out.println("----------------------------");
		System.out.print("���� >");
		String strInput = scanner.nextLine();
		int choice = Integer.parseInt(strInput);
		return choice;
	}
	
	static void showExitMessage() {
		System.out.println("====== ���α׷� ���� ======");
	}
	
	static PhoneInfo getPhoneInfo() {
		System.out.print("�̸� >");
		String name = scanner.nextLine();
		System.out.print("��ȭ��ȣ >");
		String phoneNumber = scanner.nextLine();
		
		PhoneInfo info = new PhoneInfo(name, phoneNumber);
		System.out.println("------ �Է� �Ϸ� ------");
		return info;
	}
	
	static String getSearchName() {
		System.out.print("�̸�>");
		String name = scanner.nextLine();
		return name;
	}
	
}
