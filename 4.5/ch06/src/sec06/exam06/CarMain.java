package sec06.exam06;

public class CarMain {

	public static void main(String[] args) {
		// �ٸ� Ŭ������ CarMain���� car Ŭ������ ����ʵ� speed, stop�� ������ �� ����.
		// -> .��� ������ �� ���� ����

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
		
		Person p1 = new Person("������", 25, 75.5f);
		System.out.println(p1); // �ڵ����� toString()�� ������
		
		Car car2 = new Car();
		System.out.println(car2);
		
		String str1 = new String("Hello");
		System.out.println(str1);
	
	
	}
	

}
