package car1;

public class Car {
	
	boolean power; // Ω√µøªÛ≈¬
	int speed;// º”µµ

	void power() {
		power = !power;
	}
	
	void sayPower() {
		if(power == true) {
			System.out.println("Ω√µø ƒ—¡¸");
		} else {
			System.out.println("Ω√µø ≤®¡¸");
		}
	}
	
	void speed() throws Exception {
		while(true) {
			Thread.sleep(300);
			if(speed >= 100) {
				break;
			}
			speed += 5;
			System.out.println("¡÷«‡º”µµ:" + speed + "km/h");
		}
	}
	
	void stop() throws Exception{
		while(true) {
			Thread.sleep(300);
			if(speed <= 0) {
				System.out.println("∏ÿ√„");
				break;
			}
			speed -= 5;
			System.out.println("¡÷«‡º”µµ:" + speed + "km/h");
		}
	}
	
}
