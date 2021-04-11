package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DMB 폰 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		// 필드값 확인
		System.out.println("모델:" + dmbCellPhone.model); // CellPhone field
		System.out.println("색상:" + dmbCellPhone.color); // CellPhone field
		System.out.println("채널:" + dmbCellPhone.channel); //DmbCellPhone field

		// CellPhone에 정의된 메서드 사용
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동 입니다");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
		
		// DmbCellPhone에 확장 정의된 메서드 사용
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(11);
		dmbCellPhone.turnOffDmb();
		
	}

}
