package card3;

public class CardCreator {
	
	// ī�� ���鷯��
	public static Card[] createCards() {
		/*
		//System.out.println("ī�� �����");
		Card[][] cards = new Card[13][4]; // ī��� 4���� ��ȣ �� ���� 13��, 52���� ī�� ����
		String[] shapes = {"��", "��", "��", "��"}; //for j
		
		for(int j = 0; j < 4; j++) {
			for(int i = 0; i < 13; i++) {
				cards[i][j] = new Card(i + 1,shapes[j]); // Ȯ�ε� �迭 ����ֱ�
			}
		}
		*/  
		
		String[] shapes = {"��", "��", "��", "��"};
		Card[] cards = new Card[52];
		
		for(int i = 0; i < cards.length; i++) {

			int number = i % 13 + 1; // 0 ~ 52�� �� ���� 1 ~ 13
			String shape = shapes[i / 13];
			System.out.println(number + ","+ shape);
			
			cards[i] = new Card(number, shape);
		}
		
		return cards; // ī���� �迭�� ī�尪 ������

		}
	
	//	public static void main(String[] args) {
	//		createCards();

	//	}
		
}
