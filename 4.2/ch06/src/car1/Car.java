package car1;

public class Car {
	
	boolean power; // �õ�����
	int speed;// �ӵ�

	void power() {
		power = !power;
	}
	
	void sayPower() {
		if(power == true) {
			System.out.println("�õ� ����");
		} else {
			System.out.println("�õ� ����");
		}
	}
	
	void speed() throws Exception {
		while(true) {
			Thread.sleep(300);
			if(speed >= 100) {
				break;
			}
			speed += 5;
			System.out.println("����ӵ�:" + speed + "km/h");
		}
	}
	
	void stop() throws Exception{
		while(true) {
			Thread.sleep(300);
			if(speed <= 0) {
				System.out.println("����");
				break;
			}
			speed -= 5;
			System.out.println("����ӵ�:" + speed + "km/h");
		}
	}
	
}
