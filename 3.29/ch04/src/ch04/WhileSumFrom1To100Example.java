package ch04;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		/*
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			// ���ϱ�
			sum += i; // sum = sum + i;
		}
		System.out.println("1~100������ ��: " + sum);
		*/
		
		int i = 1; // �ʱ��
		int sum = 0;
		while (i <= 100) { //���ǽ�
			sum += i;
			i++; // ������
		}
		System.out.println("1~ " + --i + "�� : " + sum);
		
		
	}

}
