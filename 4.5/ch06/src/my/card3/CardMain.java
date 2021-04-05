package my.card3;

public class CardMain {

	public static void main(String[] args) {
		
		Card[] cards = CardCreator.createCards(); 
												
		Dealer dealer = Dealer.getInstance();
		dealer.setCards(cards); 	
		dealer.shuffleCards();
		// dealer.showCards(); �׽�Ʈ�� ���� ���̶� ��������
		Card card = dealer.giveOneCard(); 
		card.showInfo();
	
		Card anotherCard = dealer.giveOneCard(); 
		anotherCard.showInfo();
		
	}

}
