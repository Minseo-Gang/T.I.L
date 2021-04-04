package card1;

public class Dealer {

	Card[][] cards; // ī�带 ���� �־�� ��
	int indexNumber; // �ʱⰪ�� 0�� ����
	int indexShape; // �ʱⰪ�� 0�� ����
	
	
	void setCards(Card[][] cards) {
		//Card[][] cards���� ���� �޶�� �ϰ� ���� cards���� ���� �޾ƿ;� ��
		this.cards = cards;
	}
	
	void shuffleCards() {
		for(int i = 0; i < cards.length * cards[0].length * 2; i++) {
			int random1 = (int)(Math.random() * cards.length); // 0 ~ 13 (���ڷ���)
			int random2 = (int)(Math.random() * cards[0].length); // 0 ~ 4 (���緣��)
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
		indexShape++; // ���� ������
		return card;
		
	}
	

}
