package ch04;

public class IfExample {

	// 기본적으로 프로그램은 위에서 아래로, 오른쪽에서 왼쪽으로, 괄호()우선으로 실행됨
	public static void main(String[] args) {
		// 점수를 저장하기 위한 정수형 변수에 값을 할당 : 93
		int score = 93;
		
		// 점수가 90점 이상이면 해당 내용 출력
		if(score >= 90) {
			System.out.println("점수가 90보다 크거나 같습니다.");
			System.out.println("등급은 A입니다");
		}
		
		//그렇지 않다면(90점 미만의 경우) 다른 해당내용을 출력함
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다");
		}
		
	}
	//IfExample이라는 프로그램의 종료점
}
