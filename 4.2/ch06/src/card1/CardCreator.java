package card1;

public class CardCreator {
	
	// ī�� ���鷯��
	Card[][] createCards() {
		//System.out.println("ī�� �����");
		Card[][] cards = new Card[13][4]; // ī��� 4���� ��ȣ �� ���� 13��, 52���� ī�� ����
		String[] shapes = {"��", "��", "��", "��"}; //for j
		
		for(int j = 0; j < 4; j++) {
			for(int i = 0; i < 13; i++) {
				cards[i][j] = new Card(i + 1,shapes[j]); // Ȯ�ε� �迭 ����ֱ�
			}
		}
		
		return cards; // ī���� ������ �迭�� ī�尪 ������	 
		
		/*
		cards[0][0] = new Card(1,"��"); // 0,0��° �迭�� ��ī�� �ϳ� ����
		cards[0][1] = new Card(2,"��"); // 0,1���� �迭�� ī�� �����
		cards[0][2] = new Card(3,"��"); // �����
		cards[0][i] // �迭 Ȯ��
		*/
	 
//		System.out.println(cards[2][3].number);
//		System.out.println(cards[2][3].shape);
//		ī��� ���� �� ������ �׽�Ʈ
		
		/*
		cards[0][1] = new Card(1, "��");
		cards[1][1] = new Card(2, "��");
		cards[2][1] = new Card(3, "��");
		*/ //���� �ٲ㼭 �迭�غ�. ���翡 ���� �迭 Ȯ�ε�(cards[0][j])
		
	
	
	}
}
