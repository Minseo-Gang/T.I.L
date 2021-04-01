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
		System.out.println("林青 矫累");
		Thread.sleep(1000);
		System.out.println("林青加档: 20km/h");
		Thread.sleep(1000);
		System.out.println("林青加档: 40km/h");
		Thread.sleep(1000);
		System.out.println("林青加档: 60km/h");
		Thread.sleep(1000);
		System.out.println("林青加档: 80km/h");
		Thread.sleep(1000);
		System.out.println("林青加档: 100km/h");
		Thread.sleep(1000);
		System.out.println("加档甫 蜡瘤钦聪促 : 100km/h");
		Thread.sleep(3000);
		System.out.println("林青加档: 60km/h");
		Thread.sleep(1000);
		System.out.println("林青加档: 30km/h");
		Thread.sleep(1000);
		System.out.println("林青加档: 0km/h");
		Thread.sleep(1000);
		System.out.println("林青 场");
	}
	*/
	
}
