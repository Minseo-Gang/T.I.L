package ch05;

public class ArrayMain {

	public static void main(String[] args) {
		// �迭(Array) - ���� �þ(����) �Ǿ� �ִ� ��, ��ü��!! // ���ӵ� ���� ����
		//	[ ] �����

		// int[] scores = new int[10]; //��ǻ�ʹ� 0���� ������
		//scores[0] .. scores[9] -> [] �ε������ ��

		int[] scores = new int[10]; // �ε����� 0 ~ 9
			//System.out.println(scores[0]); // 0
			//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
			
			// ����!
			// �ε��� ������ ������ ��
			// �迭�� ����Ѵ� -> �ݺ����� ���� (���� for���)
			// �迭�� ���� - �迭��.length
			for(int i = 0; i < scores.length; i++) {
				scores[i] = i + 1;
			}
			//[1, 2, 3, 4 ,5 ,6 ,7 ,8 ,9, 10]
			//System.out.println(scores[1]);
			
			for (int i = 0; i < scores.length; i++) {
				System.out.print(scores[i] + " ");
			}
			System.out.println("----------------------");
			
			int sum = 0;
			for (int i = 0; i < scores.length; i++) {
				sum += scores[i];
				System.out.print(scores[i] + " ");
			}
			System.out.println("sum: " + sum);
			// ��� = �հ�/����
			System.out.println("���:" + (sum / scores.length));
			
			// ������(swapping) - ��ȯ
			int temp = scores[0];
			scores[0] = scores[1];
			scores[1] = temp;
			
			for (int i = 0; i < scores.length; i++) {
				System.out.print(scores[i] + " ");
			}
			
			
			

	}

}
