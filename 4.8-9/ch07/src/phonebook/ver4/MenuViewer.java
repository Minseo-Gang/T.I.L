package phonebook.ver4;

import java.util.Scanner;

public class MenuViewer {
	public static final int INPUT = 1;
	public static final int SEARCH = 2;
	public static final int EXIT = 3;
	public static final int SOCIAL = 1;
	public static final int UNIV = 2;
	public static final int GENERAL = 3;
	
	public static Scanner scanner = new Scanner(System.in);
	// static�� static���� ����� �� �����Ƿ� Scanner�� �ٿ���
	
	public static void showTopMenu() {
		System.out.println("====== ��ȭ��ȣ�� Ver.2 ======");
	}
	
	public static int showStartMenu() {
		System.out.println("----------------------------");
		System.out.println("1.�Է�  2.��ȸ  3.����");
		System.out.println("----------------------------");
		System.out.print("���� >");
		String strInput = scanner.nextLine();
		int choice = Integer.parseInt(strInput);
		return choice;
	}
	
	public static PhoneInfo getPhoneInfo() {
		System.out.print("�̸� >");
		String name = scanner.nextLine();
		System.out.print("��ȭ��ȣ >");
		String phoneNumber = scanner.nextLine();
		PhoneInfo info = null;
		
		while(true) {
			int iInput = MenuViewer.showTypeMenu(); 
			switch(iInput) {
			case MenuViewer.SOCIAL:
				PhoneInfo socialInfo = MenuViewer.getSocialInfo();
				break;
			case MenuViewer.UNIV:
				PhoneInfo univInfo = MenuViewer.getUnivInfo();
				break;
			case MenuViewer.GENERAL:
				PhoneInfo genInfo = MenuViewer.getGeneralInfo();
				break;
			}	
			return info;
		}
	}

	public static void showExitMessage() {
		System.out.println("====== ���α׷� ���� ======");
	}
	
	
	public static String getSearchName() {
		System.out.print("�̸�>");
		String name = scanner.nextLine();
		return name;
	}
	
	public static int showTypeMenu() {
		System.out.println("----------------------------");
		System.out.println("1.��ȸ  2.����  3.�Ϲ�");
		System.out.println("----------------------------");
		System.out.print("���� >");
		String strInput = scanner.nextLine();
		int iInput = Integer.parseInt(strInput);
		return iInput;
	}
	
	public static PhoneInfoSocial getSocialInfo() {
		System.out.print("�̸� >");
		String name = scanner.nextLine();
		System.out.print("��ȭ��ȣ >");
		String phoneNumber = scanner.nextLine();
		System.out.print("ȸ�� >");
		String company = scanner.nextLine();
		
		PhoneInfoSocial socialInfo = new PhoneInfoSocial(name, phoneNumber, company);
		System.out.println("------ �Է� �Ϸ� ------");
		return socialInfo;
	}
	
	public static PhoneInfoUniv getUnivInfo() {
		System.out.print("�̸� >");
		String name = scanner.nextLine();
		System.out.print("��ȭ��ȣ >");
		String phoneNumber = scanner.nextLine();
		System.out.print("���� >");
		String major = scanner.nextLine();
		
		PhoneInfoUniv univInfo = new PhoneInfoUniv(name, phoneNumber, major);
		System.out.println("------ �Է� �Ϸ� ------");
		return univInfo;
	}
	
	public static PhoneInfo getGeneralInfo() {
		System.out.print("�̸� >");
		String name = scanner.nextLine();
		System.out.print("��ȭ��ȣ >");
		String phoneNumber = scanner.nextLine();
		
		PhoneInfo genInfo = new PhoneInfo(name, phoneNumber);
		System.out.println("------ �Է� �Ϸ� ------");
		return genInfo;
	}
	
	
}
