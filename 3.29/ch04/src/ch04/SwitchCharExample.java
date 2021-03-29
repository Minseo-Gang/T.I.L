package ch04;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'A'; // B라는 문자데이터 1개를 문자형 변수 grade에 저장
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다");
			break;
		case 'B': case 'b': //같이 묶어서 쓸 경우에는 가로로 죽 써도 상관없음
			System.out.println("일반 회원입니다");
			break;
		default:
			System.out.println("손님 입니다");
			break;
		}

	}

}
