package ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		
		// 83, 90, 87���� ���� �հ�, ��� ���ϱ�
		int[] scores = {83, 90, 87, 77, 95};
		System.out.println("1��° ��: " + scores[0]);// 83
		System.out.println("2��° ��: " + scores[1]);// 90
		System.out.println("3��° ��: " + scores[2]);// 87
		// �迭�� �ε����� 0���� ������
		
		// �հ� ���ϱ�
		int sum = 0;
		/*
		sum += scores[0];
		sum += scores[1];
		sum += scores[2];
		*/
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("�հ�:" + sum);
		
		// int average = sum/scores.length; // 86.4�� ���ð�� int�� 86���� ǥ����
		double average = (double)sum/scores.length; // double ������ ��� �Ҽ������� ǥ����
		System.out.println("���:" + average);
	}

}
