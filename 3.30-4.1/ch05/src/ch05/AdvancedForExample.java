package ch05;

public class AdvancedForExample {

	public static void main(String[] args) {
		// ���� for��
		int[] scores = {95, 71, 84, 93, 87};
		// ����
		/*
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		*/
		int sum = 0;
		// ���(�迭) ������ ó�� ~ ������ ���ʷ� ������
		for(int aScore: scores) {
			sum += aScore;
		}
		System.out.println("sum: " + sum);
		
		// ���
		System.out.println("���: " + (float)sum / scores.length);
		
		
	}

}
