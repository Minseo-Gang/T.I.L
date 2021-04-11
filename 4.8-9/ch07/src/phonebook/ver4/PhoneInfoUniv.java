package phonebook.ver4;

public class PhoneInfoUniv extends PhoneInfo{

	public String major;
	
	public PhoneInfoUniv(String name, String phoneNumber, String major) {
		super(name, phoneNumber);
		
		this.major = major;
		
	}
	
	public void showInfo() {
		System.out.println("이름: " + getName());
		System.out.println("전화번호: " + getPhoneNumber());
		System.out.println("전공: " + major);
		System.out.println("------------------");
	}

	@Override
	public String toString() {
		return "PhoneInfoUniv [phoneNumber" + getPhoneNumber() + ", name=" + getName() + ", major=" + major + "]";
	}



}

