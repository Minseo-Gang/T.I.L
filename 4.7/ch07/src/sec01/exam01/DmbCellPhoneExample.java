package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DMB �� ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		// �ʵ尪 Ȯ��
		System.out.println("��:" + dmbCellPhone.model); // CellPhone field
		System.out.println("����:" + dmbCellPhone.color); // CellPhone field
		System.out.println("ä��:" + dmbCellPhone.channel); //DmbCellPhone field

		// CellPhone�� ���ǵ� �޼��� ���
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿 �Դϴ�");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
		
		// DmbCellPhone�� Ȯ�� ���ǵ� �޼��� ���
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(11);
		dmbCellPhone.turnOffDmb();
		
	}

}
