package ex01;

public class USB implements IUsbPort {

	@Override
	public void sendData() {
		System.out.println("USB���� ������");
	
	}

	@Override
	public void receiveData() {
		System.out.println("USB���� �ޱ�");
		
	}
	
}
