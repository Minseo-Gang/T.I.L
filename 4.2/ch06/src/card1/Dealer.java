package card1;

public class Dealer {

	Card[][] cards; // 카드를 갖고 있어야 함
	int indexNumber; // 초기값이 0인 상태
	int indexShape; // 초기값이 0인 상태
	
	
	void setCards(Card[][] cards) {
		//Card[][] cards에게 값을 달라고 하고 위쪽 cards에서 값을 받아와야 함
		this.cards = cards;
	}
	
	void shuffleCards() {
		for(int i = 0; i < cards.length * cards[0].length * 2; i++) {
			int random1 = (int)(Math.random() * cards.length); // 0 ~ 13 (숫자랜덤)
			int random2 = (int)(Math.random() * cards[0].length); // 0 ~ 4 (문양랜덤)
			Card temp = cards[0][0];
			cards[0][0] = cards[random1][random2];
			cards[random1][random2] = temp;
		}
	}
	
	void showCards() {
		for(int j = 0; j < 4; j++) {
			for(int i = 0; i < 13; i++) {
				cards[i][j].showInfo();
			}
		}
	}

	Card giveOneCard() {
		Card card = cards[indexNumber][indexShape];
		indexShape++; // 점점 증가함
		return card;
		
	}
	

}
