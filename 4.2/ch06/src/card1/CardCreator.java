package card1;

public class CardCreator {
	
	// 카드 만들러옴
	Card[][] createCards() {
		//System.out.println("카드 만들기");
		Card[][] cards = new Card[13][4]; // 카드는 4종의 기호 및 각각 13장, 52개의 카드 만듬
		String[] shapes = {"◆", "♠", "♥", "♣"}; //for j
		
		for(int j = 0; j < 4; j++) {
			for(int i = 0; i < 13; i++) {
				cards[i][j] = new Card(i + 1,shapes[j]); // 확인된 배열 집어넣기
			}
		}
		
		return cards; // 카드의 이차원 배열에 카드값 돌려줌	 
		
		/*
		cards[0][0] = new Card(1,"◆"); // 0,0번째 배열에 새카드 하나 만듦
		cards[0][1] = new Card(2,"◆"); // 0,1번쨰 배열에 카드 만들고
		cards[0][2] = new Card(3,"◆"); // 만들고
		cards[0][i] // 배열 확인
		*/
	 
//		System.out.println(cards[2][3].number);
//		System.out.println(cards[2][3].shape);
//		카드와 문양 잘 나오나 테스트
		
		/*
		cards[0][1] = new Card(1, "♠");
		cards[1][1] = new Card(2, "♠");
		cards[2][1] = new Card(3, "♠");
		*/ //문양 바꿔서 배열해봄. 문양에 따른 배열 확인됨(cards[0][j])
		
	
	
	}
}
