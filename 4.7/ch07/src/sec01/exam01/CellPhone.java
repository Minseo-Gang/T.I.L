package sec01.exam01;

public class CellPhone {
	// 필드
	String model; // 모델
	String color; // 색상
	
	// 생성자
	
	//메서드
	// 전원켜기
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	// 전원끄기
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	// 벨소리
	void bell() {
		System.out.println("벨이 울립니다");
	}
	
	// 음성보내기
	void sendVoice(String message) {
		System.out.println("자기 : " + message);
	}
	
	// 음성 받기
	void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	// 전화끊기
	void hangUp() {
		System.out.println("전화를 끊습니다");
	}
		

}
