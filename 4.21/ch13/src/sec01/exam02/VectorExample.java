package sec01.exam02;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Vector도 list계열 -> List 인터페이스를 구현한 클래스
		// ArrayList와의 차이 : Thread에 안전함
		List<Board> list = new Vector<>();
		for(int i = 1; i <= 5; i++) {
			list.add(new Board("제목" + i, "내용" + i , "작성자" + i ));
		}
		
		// 특정 위치에 데이터 제거(remove)
		list.remove(2);  // 2번째 인덱스의 데이터는 삭제되고 2번 이후 인덱스의 데이터는 한자리씩 당겨짐(자동)
		
		for(Board b : list) {
			System.out.print(b.subject + " | ");
			System.out.print(b.content + " | ");
			System.out.println(b.writer);
		}

	}

}

// 게시판
class Board {
	String subject;// 글제목
	String content;// 글내용
	String writer;// 작성자
	
	// 필드 생성자
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
}