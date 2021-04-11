package sec03.exam02;

// 추상메서드가 한개라도 있는 클래스는 추상 클래스로 선언해야 함
// 안그럼 에러남
public abstract class Animal {
	public String kind;
	
	// 숨쉬기
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	// 추상메서드 - { } (구현부) 가 없음
	// 추상메서드가 한개라도 있는 클래스는 추상클래스이다
	public abstract void sound();
	
}
