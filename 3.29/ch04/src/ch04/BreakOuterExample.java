package ch04;

public class BreakOuterExample {

	public static void main(String[] args) {
		/*
		for(int i = 1; i <= 5; i++) {
			System.out.println("�ٱ���: " + i);
			
			for(int j = 1; j <= 5; j++) {
				System.out.println("����: " + j);
				if(j == 3) {
					break;
				}
			}
		}
		*/
		
		// �ٱ��� for���� Outter��� �̸�(���̺�)�� �ޱ�
		Outter: for(int i = 1; i <= 5; i++) {
			System.out.println("�ٱ���: " + i);
			
			for(int j = 1; j <= 5; j++) {
				System.out.println("����: " + j);
				if(j == 3) {
					break Outter; // Outter��� �̸��� �ݺ� �ߴ�
				}
			}
		}

	}

}
