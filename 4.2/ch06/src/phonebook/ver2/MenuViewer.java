package phonebook.ver2;

import java.util.Scanner;

public class MenuViewer {
	static final int INPUT = 1;
	static final int SEARCH = 2;
	static final int EXIT = 3;
	
	static Scanner scanner = new Scanner(System.in);
	// static은 static끼리 사용할 수 있으므로 Scanner에 붙여줌
	
	public static void showTopMenu() {
		System.out.println("====== 전화번호부 Ver.2 ======");
	}
	
	static int showStartMenu() {
		System.out.println("----------------------------");
		System.out.println("1.입력  2.조회  3.종료");
		System.out.println("----------------------------");
		System.out.print("선택 >");
		String strInput = scanner.nextLine();
		int choice = Integer.parseInt(strInput);
		return choice;
	}
	
	static void showExitMessage() {
		System.out.println("====== 프로그램 종료 ======");
	}
	
	static PhoneInfo getPhoneInfo() {
		System.out.print("이름 >");
		String name = scanner.nextLine();
		System.out.print("전화번호 >");
		String phoneNumber = scanner.nextLine();
		
		PhoneInfo info = new PhoneInfo(name, phoneNumber);
		System.out.println("------ 입력 완료 ------");
		return info;
	}
	
	static String getSearchName() {
		System.out.print("이름>");
		String name = scanner.nextLine();
		return name;
	}
	
}
