package phonebook.ver4;

public class PhoneInfo {  // Value Object
							// domain
	
	private String phoneNumber; // ��ȭ��ȣ
	private String name; // �̸�
	
	public PhoneInfo() {
		
	}

	public PhoneInfo(String name) {
		this.name = name;
	}
	
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ��ȣ: " + phoneNumber);
		System.out.println("------------------");
	}

	@Override
	public String toString() {
		return "PhoneInfo [phoneNumber=" + phoneNumber + ", name=" + name + "]";
	}
	
	
}
