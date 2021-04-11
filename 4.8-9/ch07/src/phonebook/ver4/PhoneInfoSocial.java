package phonebook.ver4;

public class PhoneInfoSocial extends PhoneInfo{
	
	public String company;
	
	public PhoneInfoSocial(String name, String phoneNumber, String company) {
		super(name, phoneNumber);

		this.company = company;
	}

	public void showInfo() {
		System.out.println("�̸�: " + getName());
		System.out.println("��ȭ��ȣ: " + getPhoneNumber());
		System.out.println("ȸ��: " + company);
		System.out.println("------------------");
	}

	
	@Override
	public String toString() {
		return "PhoneInfoSocial [phoneNumber=" + getPhoneNumber() + ", name=" + getName() + ",company=" + company + "]";
	}
	
	
	
		
	
	
	
	
	
	
	
}
