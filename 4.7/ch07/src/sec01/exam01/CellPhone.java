package sec01.exam01;

public class CellPhone {
	// �ʵ�
	String model; // ��
	String color; // ����
	
	// ������
	
	//�޼���
	// �����ѱ�
	void powerOn() {
		System.out.println("������ �մϴ�");
	}
	
	// ��������
	void powerOff() {
		System.out.println("������ ���ϴ�");
	}
	
	// ���Ҹ�
	void bell() {
		System.out.println("���� �︳�ϴ�");
	}
	
	// ����������
	void sendVoice(String message) {
		System.out.println("�ڱ� : " + message);
	}
	
	// ���� �ޱ�
	void receiveVoice(String message) {
		System.out.println("����: " + message);
	}
	
	// ��ȭ����
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�");
	}
		

}
