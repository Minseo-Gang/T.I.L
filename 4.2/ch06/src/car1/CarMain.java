package car1;

public class CarMain {

	public static void main(String[] args) throws Exception{
		
		Car car = new Car();
		
		car.power();
		car.sayPower();
		
		//speed();
		
		car.speed();
		car.stop();
		car.power();
		car.sayPower();
	}
	
	/*
	public static void speed() throws Exception {
		System.out.println("���� ����");
		Thread.sleep(1000);
		System.out.println("����ӵ�: 20km/h");
		Thread.sleep(1000);
		System.out.println("����ӵ�: 40km/h");
		Thread.sleep(1000);
		System.out.println("����ӵ�: 60km/h");
		Thread.sleep(1000);
		System.out.println("����ӵ�: 80km/h");
		Thread.sleep(1000);
		System.out.println("����ӵ�: 100km/h");
		Thread.sleep(1000);
		System.out.println("�ӵ��� �����մϴ� : 100km/h");
		Thread.sleep(3000);
		System.out.println("����ӵ�: 60km/h");
		Thread.sleep(1000);
		System.out.println("����ӵ�: 30km/h");
		Thread.sleep(1000);
		System.out.println("����ӵ�: 0km/h");
		Thread.sleep(1000);
		System.out.println("���� ��");
	}
	*/
	
}
