package card1;

public class CardMain {

	public static void main(String[] args) {
		
		// ī�� ����� �� ��Ű�� = CardCreator ->
		CardCreator creator = new CardCreator(); //ī�� ���鷯 �� �����߰�
		Card[][] cards = creator.createCards(); // ī�� ���鷯���� ���� ���(createCards()) �ҷ���
												// ī�� ���������� ����
		Dealer dealer = new Dealer();
		dealer.setCards(cards); //Dealer�� setCards�س����� ȣ��		
		dealer.shuffleCards();
		// dealer.showCards(); �׽�Ʈ�� ���� ���̶� ��������
		Card card = dealer.giveOneCard(); // �������� ī�� ���� �䱸��
		card.showInfo();
	
		Card anotherCard = dealer.giveOneCard(); //�������� �ٸ� ī�� �䱸
		anotherCard.showInfo();
		
	}

}
