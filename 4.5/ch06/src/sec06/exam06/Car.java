package sec06.exam06;

public class Car {
	private int speed; // �ӵ�
	private boolean stop; // �������� ����
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
