package phonebook.ver1;

public class PhoneInfo {

	String phoneNum; // ��ȭ��ȣ
	String name; // �̸�
	
	PhoneInfo(String name) {
		this.name = name;
	}
	
	void setPhoneNumber(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	PhoneInfo(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNum);
	}
	
	
	
	
}
