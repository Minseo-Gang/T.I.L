package ch05;

public class LottoMachine2 {

	public static void main(String[] args) {
		// 1~45���� ������ �� �ִ� ���� �����
		int[] number = new int[45];
		// System.out.println("number:" + number); �׽�Ʈ -> ������ : [I@.....
		
		// 1~45 �ֱ�
		for (int i = 0; i <= 44; i++) {
			number[i] = i + 1;
		}
		// -> [1, 2, 3, ... 45]
		
		// �� ����(swapping�̿�)
		// number[0] <-> number[lotto]
		for (int i = 1; i <= 100; i++) {
			int lotto = (int)(Math.random() * 45);
			//System.out.println("lotto:" + lotto);
			int temp = number[0];
			number[0] = number[lotto];
			number[lotto] = temp;
		}
		
		/*
		//�ٲ� ���� ����
		for (int i = 1; i <= 44; i++) {
			System.out.print(number[i] + " ");
		}
		*/
		
		// 6�� �����ϱ�
		for (int i = 0; i <= 5; i++) {
			// ������ �� ���� - ���° ������(0 ~ 44��°)
			int lotto = (int)(Math.random() * 45);
			
			//System.out.println("lotto" + lotto);
			int num = number[i];
			System.out.print(num + " ");
		}
		
		
	}

}
