package sec06.exam06;

public class Car {
	private int speed; // 속도
	private boolean stop; // 정지상태 여부
	private final int MAX = 200;
	
	// getter
	public int getSpeed() {
		return speed;
	}
	
	// setter
	public void setSpeed(int speed) {
		if(speed >= 0 && speed <= MAX) {
			this.speed = speed;
		}
	}
	
	// getter
	public boolean getStop() {
		return stop;
	}
	
	// setter
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
	
}
