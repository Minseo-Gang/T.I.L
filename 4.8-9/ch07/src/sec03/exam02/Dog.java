package sec03.exam02;

public class Dog extends Animal {
//The type Dog must implement the inherited abstract method Animal.sound()
	//sound() 메소드를 구현하거나 
	// public class "abstract" Dog로 추상 클래스로 만들어야 함
	
	// Animal.sound() 추상메서드를 구체화 (구현부{ }를 작성)
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
