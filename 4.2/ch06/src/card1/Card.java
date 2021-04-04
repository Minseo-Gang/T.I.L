package card1;

public class Card {

	int number;
	String shape;
	
	Card(int number, String shape) {
		this.number = number;
		this.shape = shape;
	}
	
	void showInfo() {
		String strNumber = null;
		switch (number) {
		case 1:
			strNumber = "A";
			break;
		case 11:
			strNumber = "J";
			break;
		case 12:
			strNumber = "Q";
			break;
		case 13:
			strNumber = "K";
			break;
		default:
			strNumber = String.valueOf(number);
			break;
		}
		
		System.out.println(number + " " + shape);
	}
}
