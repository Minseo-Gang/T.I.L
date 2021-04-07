package sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();  // 물려받은 이륙하기
		sa.fly(); // 초기상태 - NORMAL, 일반비행 - Airplane의 fly()
		sa.flyMode = SupersonicAirplane.SUPERSONIC; // 비행모드 변경
		sa.fly(); // 초음속 비행 SupersonicAirplane의 fly()
		sa.flyMode = SupersonicAirplane.NORMAL; // 비행모드 변경
		sa.fly(); // Airplane의 fly()
		sa.land(); // 물려받은 착륙하기
	}

}
