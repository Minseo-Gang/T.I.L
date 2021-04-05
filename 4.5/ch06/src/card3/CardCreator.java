package card3;

public class CardCreator {
	
	// 카드 만들러옴
	public static Card[] createCards() {
		/*
		//System.out.println("카드 만들기");
		Card[][] cards = new Card[13][4]; // 카드는 4종의 기호 및 각각 13장, 52개의 카드 만듬
		String[] shapes = {"◆", "♠", "♥", "♣"}; //for j
		
		for(int j = 0; j < 4; j++) {
			for(int i = 0; i < 13; i++) {
				cards[i][j] = new Card(i + 1,shapes[j]); // 확인된 배열 집어넣기
			}
		}
		*/  
		
		String[] shapes = {"◆", "♠", "♥", "♣"};
		Card[] cards = new Card[52];
		
		for(int i = 0; i < cards.length; i++) {

			int number = i % 13 + 1; // 0 ~ 52일 때 모양당 1 ~ 13
			String shape = shapes[i / 13];
			System.out.println(number + ","+ shape);
			
			cards[i] = new Card(number, shape);
		}
		
		return cards; // 카드의 배열에 카드값 돌려줌

		}
	
	//	public static void main(String[] args) {
	//		createCards();

	//	}
		
}
