package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// phone 타입의 인스턴스를 생성할 수 없다
		// phone 클래스가 추상 클래스이므로
		/*
		Phone p1 = new Phone("홍길동");
		p1.turnOn();
		p1.turnOff();
		*/
		
		SmartPhone p2 = new SmartPhone("홍길동");
		p2.turnOn();
		p2.internetSearch();
		p2.turnOff();
	
	}

}
