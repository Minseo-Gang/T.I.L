package sec01.exam06;

public class Car {
	public int speed;

	public void speedUp() {
		speed += 1;
	}
	
	// �޼��忡 final�� ����
	// ������ �޼��尡 ��
	// �������̵��� ������� �ʰڴ�
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}

}
