package sec01.exam01;

// DmbCellPhone [is-a] CellPhone
// CellPhone : �θ�Ŭ����, ����Ŭ����, ����Ŭ����
// DmBCellPhone : �ڽ�Ŭ����, ���� Ŭ����, ����Ŭ����
public class DmbCellPhone extends CellPhone{

	// �ʵ�
	// ä��
	int channel;
	// ������ �ʴ�  String model; String color; // CellPhone���κ��� ��������
	
	// ������
	DmbCellPhone(String model, String color, int channel) {
		// super(); ��������
		this.model = model;  // CellPhone�� ���ǵ� model
		this.color = color;  // CellPhone�� ���ǵ� color
		this.channel = channel;
	}
	
	//�޼���
	// ���� ������ �ʴ� �޼��尡 ����(CellPhone�� �ִ� �޼����)
	// void powerOn()
	// void powerOff()
	// void bell()
	// void sendVoice()
	// void receiveVoice()
	// void hangUp()
	
	// DMB �ѱ�
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�");
	}
	
	// DMB ä�κ���
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �ٲߴϴ�");
	}
		
	// DMB ����
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�");
	}
	
}


