package ex01;

public interface IUsbPort {

	// ���  field�� public static final�̴� (���) - ��������
	/*public static final*/ int SEND_SPEED = 10;
	public static final int RECEIVE_SPEED = 15;
	
	/*public abstract*/ void sendData();
	public abstract void receiveData();
	// public abstract�� �����ǵ� �ڵ����� �ٿ���
	
}
