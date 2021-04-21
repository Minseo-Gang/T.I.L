package sec01.exam02;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Vector�� list�迭 -> List �������̽��� ������ Ŭ����
		// ArrayList���� ���� : Thread�� ������
		List<Board> list = new Vector<>();
		for(int i = 1; i <= 5; i++) {
			list.add(new Board("����" + i, "����" + i , "�ۼ���" + i ));
		}
		
		// Ư�� ��ġ�� ������ ����(remove)
		list.remove(2);  // 2��° �ε����� �����ʹ� �����ǰ� 2�� ���� �ε����� �����ʹ� ���ڸ��� �����(�ڵ�)
		
		for(Board b : list) {
			System.out.print(b.subject + " | ");
			System.out.print(b.content + " | ");
			System.out.println(b.writer);
		}

	}

}

// �Խ���
class Board {
	String subject;// ������
	String content;// �۳���
	String writer;// �ۼ���
	
	// �ʵ� ������
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
}