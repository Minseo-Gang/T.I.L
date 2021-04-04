package phonebook.ver1;

public class PhoneBookMain {

	public static void main(String[] args) {
	
		PhoneInfo info1 = new PhoneInfo("±è¹Î¿µ");
		
		info1.setPhoneNumber("010-5678-1234");
		
		PhoneInfo info2 = new PhoneInfo("±è¹ü¹Î", "010-1234-5678");
		
		System.out.println("[½ÇÇà °á°ú]");
		info1.showInfo();
		
		System.out.println("------------------------");
		
		info2.showInfo();

	}

}
