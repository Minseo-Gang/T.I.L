package sec03.exam02;

// �߻�޼��尡 �Ѱ��� �ִ� Ŭ������ �߻� Ŭ������ �����ؾ� ��
// �ȱ׷� ������
public abstract class Animal {
	public String kind;
	
	// ������
	public void breathe() {
		System.out.println("���� ���ϴ�");
	}
	
	// �߻�޼��� - { } (������) �� ����
	// �߻�޼��尡 �Ѱ��� �ִ� Ŭ������ �߻�Ŭ�����̴�
	public abstract void sound();
	
}
