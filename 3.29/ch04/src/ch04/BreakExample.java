package ch04;

public class BreakExample {

	public static void main(String[] args) {
		// �ݺ��� ������ break - �ݺ��� �ߴ��ϰ�, �ݺ��� ���� ���� �������� �̵���
		// 1 ~ 6 ������ ������ ���� ���ؼ� ���� ���� 6�� ���ö� ���� �ݺ� �����
		
		while(true) {
			int num = (int)(Math.random() * 6) + 1;
			System.out.println("num:" + num);
			if (num == 6) {
				break;
			}
		}
		
		System.out.println("���α׷� ����");

	}

}
