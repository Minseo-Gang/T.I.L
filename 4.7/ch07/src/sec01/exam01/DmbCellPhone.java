package sec01.exam01;

// DmbCellPhone [is-a] CellPhone
// CellPhone : 부모클래스, 상위클래스, 슈퍼클래스
// DmBCellPhone : 자식클래스, 하위 클래스, 서브클래스
public class DmbCellPhone extends CellPhone{

	// 필드
	// 채널
	int channel;
	// 보이지 않는  String model; String color; // CellPhone으로부터 물려받음
	
	// 생성자
	DmbCellPhone(String model, String color, int channel) {
		// super(); 생략가능
		this.model = model;  // CellPhone에 정의된 model
		this.color = color;  // CellPhone에 정의된 color
		this.channel = channel;
	}
	
	//메서드
	// 눈에 보이지 않는 메서드가 있음(CellPhone에 있던 메서드들)
	// void powerOn()
	// void powerOff()
	// void bell()
	// void sendVoice()
	// void receiveVoice()
	// void hangUp()
	
	// DMB 켜기
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다");
	}
	
	// DMB 채널변경
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다");
	}
		
	// DMB 끄기
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다");
	}
	
}


