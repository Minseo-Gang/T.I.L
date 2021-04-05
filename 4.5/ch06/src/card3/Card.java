package card3;

public class Card {

	private int number;
	private String shape;
	private static int width = 50;
	private static int height = 100;
		
	public Card() {
	
	}

	public Card(int number, String shape) {
		this.number = number;
		this.shape = shape;
	}
	

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	
	public void showInfo() {
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

	@Override
	public String toString() {
		return "Card [number=" + number + ", shape=" + shape + "]";
	}
	
	
}
