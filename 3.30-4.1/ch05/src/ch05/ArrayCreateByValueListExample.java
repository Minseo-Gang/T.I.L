package ch05;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		System.out.println("main, scores: " + scores);
		int sum = add(scores); // ��Ű�� �ʿ����� �Ѱ���
		System.out.println("�հ� :" + sum);
		System.out.println("���α׷� ����");
		//System.out.println("scores[0]: " + scores[0]); // 
		
	}

	// method(�޼ҵ�)
	public static int add(int[] scores2) { // void�� return �� ������ ���
		// int[] scores2 = scores; // ���� ������ �ʰ� ���� �Ǿ� ����
		System.out.println("add() �����");
		System.out.println("add, scores2: " + scores2);
		
		int sum = 0;
		for(int i = 0; i < scores2.length; i++) {
			sum += scores2[i];
		}
		
		return sum;
		
		// return; (��������)
		
	}
}
