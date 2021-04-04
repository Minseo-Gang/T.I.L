package sec03.exam04;

public class Car {

	String company = "Çö´ëÀÚµ¿Â÷";
	String model;
	String color;
	int maxSpeed;
	
	Car() {
		System.out.println("Car() ½ÇÇàµÊ");
	}
	
	Car(String model) {
		this(model, "Àº»ö", 250);
		System.out.println("Car(String model) ½ÇÇàµÊ");
	}
	
	Car(String model, String color) {
		System.out.println("Car(String model, String color) ½ÇÇàµÊ");
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("Car(String model, String color, int maxSpeed) ½ÇÇàµÊ");
	}
	
	
}
