package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		Animal[] animals = {
				new Dog(),
				new Cat(),
				new Dog(),
				new Cat()
		};
		
		for(Animal a : animals) {
			a.sound();
			// -> Dog와 Cat에서 오버라이드 된 sound()가 실행됨
		}

	}

}
