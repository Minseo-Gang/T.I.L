package ch05;

public class LottoMachine {

	public static void main(String[] args) {
		// 1~45���� ������ �� �ִ� ���� �����
		int[] number = new int[45];
		// System.out.println("number:" + number); �׽�Ʈ -> ������ : [I@.....
		
		//�ʱ� ���� Ȯ��
		/*
		for (int i = 0; i <= 44; i++) {
			int aNumber = number[i];
			System.out.print(aNumber + " ");
		}
		*/
		
		// 1~45 �ֱ�
		for (int i = 0; i <= 44; i++) {
			number[i] = i + 1;
		}
		
		//System.out.println("\n---------------------------");
		
		/*
		// �ٲ� �� Ȯ��
		for (int i = 0; i <= 44; i++) {
			System.out.print(number[i] + " ");
		}
		*/
		
		//System.out.println();
		
		for (int i = 1; i <= 6; i++) {
			// ������ �� ���� - ���° ������(0 ~ 44��°)
			int lotto = (int)(Math.random() * 45);
			//System.out.println("lotto" + lotto);
			int num = number[lotto];
			System.out.print(num + " ");
		}
		
		
	}

}
