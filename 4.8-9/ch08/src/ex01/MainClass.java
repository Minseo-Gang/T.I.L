package ex01;

public class MainClass {
	// 인터페이스는 상위 타입의 역할을 함
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
