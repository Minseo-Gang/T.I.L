package ex01;

public class ComputerCase implements IUsbPort {

	@Override
	public void sendData() {
		System.out.println("ComputerCase���� ������");
		
	}

	@Override
	public void receiveData() {
		System.out.println("ComputerCase���� �ޱ�");
		
	}

}
