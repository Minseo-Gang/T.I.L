package sec01.exam06;

public class Car {
	public int speed;

	public void speedUp() {
		speed += 1;
	}
	
	// 메서드에 final이 붙음
	// 마지막 메서드가 됨
	// 오버라이딩을 허용하지 않겠다
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}

}
