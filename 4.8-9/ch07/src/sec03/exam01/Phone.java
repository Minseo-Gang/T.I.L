package sec03.exam01;

public abstract class Phone {
	
	// ������(����)
	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}
	
	// �����ѱ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�");
	}
	
	// ��������
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�");
	}
	
	
	
}
