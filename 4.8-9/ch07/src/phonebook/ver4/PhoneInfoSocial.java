package phonebook.ver4;

public class PhoneInfoSocial extends PhoneInfo{
	
	public String company;
	
	public PhoneInfoSocial(String name, String phoneNumber, String company) {
		super(name, phoneNumber);

		this.company = company;
	}

	public void showInfo() {
		System.out.println("이름: " + getName());
		System.out.println("전화번호: " + getPhoneNumber());
		System.out.println("회사: " + company);
		System.out.println("------------------");
	}

	
	@Override
	public String toString() {
		return "PhoneInfoSocial [phoneNumber=" + getPhoneNumber() + ", name=" + getName() + ",company=" + company + "]";
	}
	
	
	
		
	
	
	
	
	
	
	
}
