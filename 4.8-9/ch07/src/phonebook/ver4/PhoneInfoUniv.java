package phonebook.ver4;

public class PhoneInfoUniv extends PhoneInfo{

	public String major;
	
	public PhoneInfoUniv(String name, String phoneNumber, String major) {
		super(name, phoneNumber);
		
		this.major = major;
		
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + getName());
		System.out.println("��ȭ��ȣ: " + getPhoneNumber());
		System.out.println("����: " + major);
		System.out.println("------------------");
	}

	@Override
	public String toString() {
		return "PhoneInfoUniv [phoneNumber" + getPhoneNumber() + ", name=" + getName() + ", major=" + major + "]";
	}



}

