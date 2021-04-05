package sec06.exam06;

public class CarMain {

	public static void main(String[] args) {
		// 다른 클래스인 CarMain에서 car 클래스의 멤버필드 speed, stop에 접근할 수 없다.
		// -> .찍고 뭔가를 할 수가 없다

		Car car1 = new Car();
		//System.out.println(car1.speed); //error : private
		//System.out.println(car1.stop); // error : private
		
		System.out.println(car1.getSpeed());
		
		car1.setSpeed(100);
		System.out.println(car1.getSpeed());
		
		car1.setSpeed(300);
		System.out.println(car1.getSpeed());
	
		car1.setStop(false);
		System.out.println(car1.getStop());
		
		car1.setStop(true);
		System.out.println(car1.getStop());
		
		Person p1 = new Person("김종현", 25, 75.5f);
		System.out.println(p1); // 자동으로 toString()을 실행함
		
		Car car2 = new Car();
		System.out.println(car2);
		
		String str1 = new String("Hello");
		System.out.println(str1);
	
	
	}
	

}
