package ch04;

public class ContinueExample {

	public static void main(String[] args) {
		// continue : continue �Ʒ����� ������� �������� �ʰ� �ݺ��� �����
		
		// 1 ~ 10 �߿��� ¦��(n % 2 == 0)�� ���
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) { // Ȧ�����
				continue; // �ݺ��� �ȿ� �ִ� �Ʒ��� ������� �������� �ʰ� �ݺ� �����
			}
			System.out.println(i);
		}
		
	}

}
