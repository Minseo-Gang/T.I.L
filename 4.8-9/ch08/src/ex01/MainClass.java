package ex01;

public class MainClass {
	// �������̽��� ���� Ÿ���� ������ ��
	public static void main(String[] args) {
		IUsbPort[] ports = {
				new USB(), new ComputerCase()
		};
		
		for(IUsbPort p : ports) {
			p.sendData();
			p.receiveData();
		}

	}

}
