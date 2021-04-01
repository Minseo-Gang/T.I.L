package phonebook.ver1;

public class PhoneInfo {

	String phoneNumber; // 전화번호
	String name; // 이름
	
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
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
	}
	
}
