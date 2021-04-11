package sec03.exam01;

public abstract class Phone {
	
	// 소유주(주인)
	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 전원켜기
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	
	// 전원끄기
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
	
	
	
}
