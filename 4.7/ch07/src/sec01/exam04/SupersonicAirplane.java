package sec01.exam04;

public class SupersonicAirplane extends Airplane {
	// 상수 정의
	public static final int NORMAL = 1;  // 일반모드
	public static final int SUPERSONIC = 2;  // 초음속모드
	
	// 현재 비행 모드
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다");
		} else {
			super.fly();
		}
		
	}

	
	
	
}
