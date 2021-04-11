package phonebook.ver4;

public class PhoneBookMain {

	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();
		MenuViewer.showTopMenu();
		
		while(true) {
			int choice = MenuViewer.showStartMenu();
			switch (choice) {
			case MenuViewer.INPUT:
				MenuViewer.showTypeMenu();
				PhoneInfo info = MenuViewer.getPhoneInfo();
				phoneBook.insertData(info);
				//phoneBook.showAll();
				break;
			case MenuViewer.SEARCH:
				String name = MenuViewer.getSearchName();
				phoneBook.searchByName(name);
				break;
			case MenuViewer.EXIT:
				MenuViewer.showExitMessage();
				return;
			default:
				System.out.println("잘못입력");
				break;
			} //switch

		}			  

		  
	} //main

} // class
