package my.card3;

public class Dealer {

	private static Dealer instance;
	private Card[] cards; 
	private int index;
	
	private Dealer() {
		
	}
	
	public static Dealer getInstance() {
		if(instance == null) {
			instance = new Dealer();
		} 
		 return instance;
	}
		

	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	
	public void shuffleCards() {
		for(int i = 0; i < cards.length * 2; i++) {
			int random1 = (int)(Math.random() * cards.length); 
			Card temp = cards[0];
			cards[0] = cards[random1];
			cards[random1] = temp;
		}
	}
	
	public void showCards() {
		for(int i = 0; i < cards.length; i++) {
			cards[i].showInfo();
		}
	}

	public Card giveOneCard() {
		Card card = cards[index];
		index++;
		return card;
		
	}
	
}
