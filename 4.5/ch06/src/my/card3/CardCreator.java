package my.card3;

public class CardCreator {
	
	
	public static Card[] createCards() {
		
		Card[] cards = new Card[52];
		String[] shapes = {"¡ß", "¢¼", "¢¾", "¢À"}; 
		
		for(int i = 0; i < cards.length; i++) {
			int number = i % 13 + 1;
			String shape = shapes[i / 13];
			//System.out.println(number + "," + shape);
			
			cards[i] = new Card(number, shape);
		}
		
		return cards;	 
	
	}
	
//	public static void main(String[] args) {
//		createCards();
//	}
	
}
