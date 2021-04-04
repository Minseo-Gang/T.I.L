package card1;

public class CardMain {

	public static void main(String[] args) {
		
		// 카드 만드는 것 시키기 = CardCreator ->
		CardCreator creator = new CardCreator(); //카드 만들러 간 변수추가
		Card[][] cards = creator.createCards(); // 카드 만들러가서 만든 기능(createCards()) 불러옴
												// 카드 만들어놓은거 받음
		Dealer dealer = new Dealer();
		dealer.setCards(cards); //Dealer가 setCards해놓은거 호출		
		dealer.shuffleCards();
		// dealer.showCards(); 테스트를 위한 것이라 생략가능
		Card card = dealer.giveOneCard(); // 딜러에게 카드 한장 요구함
		card.showInfo();
	
		Card anotherCard = dealer.giveOneCard(); //딜러에게 다른 카드 요구
		anotherCard.showInfo();
		
	}

}
