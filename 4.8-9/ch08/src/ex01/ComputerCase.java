package ex01;

public class ComputerCase implements IUsbPort {

	@Override
	public void sendData() {
		System.out.println("ComputerCase에서 보내기");
		
	}

	@Override
	public void receiveData() {
		System.out.println("ComputerCase에서 받기");
		
	}

}
