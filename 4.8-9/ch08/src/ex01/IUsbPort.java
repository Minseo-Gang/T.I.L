package ex01;

public interface IUsbPort {

	// 모든  field가 public static final이다 (상수) - 생략가능
	/*public static final*/ int SEND_SPEED = 10;
	public static final int RECEIVE_SPEED = 15;
	
	/*public abstract*/ void sendData();
	public abstract void receiveData();
	// public abstract가 생략되도 자동으로 붙여줌
	
}
