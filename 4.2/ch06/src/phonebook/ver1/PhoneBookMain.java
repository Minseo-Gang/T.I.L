package phonebook.ver1;

public class PhoneBookMain {

	public static void main(String[] args) {
	
		PhoneInfo info1 = new PhoneInfo("��ο�");
		
		info1.setPhoneNumber("010-5678-1234");
		
		PhoneInfo info2 = new PhoneInfo("�����", "010-1234-5678");
		
		System.out.println("[���� ���]");
		info1.showInfo();
		
		System.out.println("------------------------");
		
		info2.showInfo();

	}

}
