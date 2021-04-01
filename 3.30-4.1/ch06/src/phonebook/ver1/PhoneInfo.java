package phonebook.ver1;

public class PhoneInfo {

	String phoneNumber; // ��ȭ��ȣ
	String name; // �̸�
	
	PhoneInfo(String name) {
		this.name = name;
	}
	
	PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ��ȣ: " + phoneNumber);
	}
	
}
