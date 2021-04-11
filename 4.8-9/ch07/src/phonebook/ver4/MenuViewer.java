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
	// static은 static끼리 사용할 수 있으므로 Scanner에 붙여줌
	
	public static void showTopMenu() {
		System.out.println("====== 전화번호부 Ver.2 ======");
	}
	
	public static int showStartMenu() {
		System.out.println("----------------------------");
		System.out.println("1.입력  2.조회  3.종료");
		System.out.println("----------------------------");
		System.out.print("선택 >");
		String strInput = scanner.nextLine();
		int choice = Integer.parseInt(strInput);
		return choice;
	}
	
	public static PhoneInfo getPhoneInfo() {
		System.out.print("이름 >");
		String name = scanner.nextLine();
		System.out.print("전화번호 >");
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
		System.out.println("====== 프로그램 종료 ======");
	}
	
	
	public static String getSearchName() {
		System.out.print("이름>");
		String name = scanner.nextLine();
		return name;
	}
	
	public static int showTypeMenu() {
		System.out.println("----------------------------");
		System.out.println("1.사회  2.대학  3.일반");
		System.out.println("----------------------------");
		System.out.print("선택 >");
		String strInput = scanner.nextLine();
		int iInput = Integer.parseInt(strInput);
		return iInput;
	}
	
	public static PhoneInfoSocial getSocialInfo() {
		System.out.print("이름 >");
		String name = scanner.nextLine();
		System.out.print("전화번호 >");
		String phoneNumber = scanner.nextLine();
		System.out.print("회사 >");
		String company = scanner.nextLine();
		
		PhoneInfoSocial socialInfo = new PhoneInfoSocial(name, phoneNumber, company);
		System.out.println("------ 입력 완료 ------");
		return socialInfo;
	}
	
	public static PhoneInfoUniv getUnivInfo() {
		System.out.print("이름 >");
		String name = scanner.nextLine();
		System.out.print("전화번호 >");
		String phoneNumber = scanner.nextLine();
		System.out.print("전공 >");
		String major = scanner.nextLine();
		
		PhoneInfoUniv univInfo = new PhoneInfoUniv(name, phoneNumber, major);
		System.out.println("------ 입력 완료 ------");
		return univInfo;
	}
	
	public static PhoneInfo getGeneralInfo() {
		System.out.print("이름 >");
		String name = scanner.nextLine();
		System.out.print("전화번호 >");
		String phoneNumber = scanner.nextLine();
		
		PhoneInfo genInfo = new PhoneInfo(name, phoneNumber);
		System.out.println("------ 입력 완료 ------");
		return genInfo;
	}
	
	
}
