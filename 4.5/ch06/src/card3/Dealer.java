package card3;

public class Dealer {

	private static Dealer instance;
	private Card[] cards; // 카드를 갖고 있어야 함
	private int index;
	
	private Dealer() {
		// singleton
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
			cards[random1]= temp;
		}
	}
	
	public void showCards() {
		for(Card aCard : cards) { // 향상된 for문  > 타입 변수 : 배열
			aCard.showInfo();
		}
		
	}

	public Card giveOneCard() {
		Card card = cards[index++];
		if(index >= cards.length) {
			return null;
		}
		return card;
		
	}
	

}
