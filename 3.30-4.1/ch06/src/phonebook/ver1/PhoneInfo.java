package phonebook.ver1;

public class PhoneInfo {

	String phoneNum; // 전화번호
	String name; // 이름
	
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
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNum);
	}
	
	
	
	
}
