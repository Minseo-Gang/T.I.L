package sec03.exam04;

public class Car {

	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car() {
		System.out.println("Car() �����");
	}
	
	Car(String model) {
		this(model, "����", 250);
		System.out.println("Car(String model) �����");
	}
	
	Car(String model, String color) {
		System.out.println("Car(String model, String color) �����");
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("Car(String model, String color, int maxSpeed) �����");
	}
	
	
}
